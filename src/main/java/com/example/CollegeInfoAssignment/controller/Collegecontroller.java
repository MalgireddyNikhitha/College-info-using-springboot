package com.example.CollegeInfoAssignment.controller;

import com.example.CollegeInfoAssignment.model.College;
import com.example.CollegeInfoAssignment.service.Collegeservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/colleges")
public class Collegecontroller {
@Autowired
    private Collegeservice collegeService;
    @PostMapping
    public ResponseEntity<College> addCollege(@RequestBody College college) {
        return ResponseEntity.ok(collegeService.addCollege(college));
    }

    @GetMapping
    public ResponseEntity<List<College>> getAllColleges() {
        return ResponseEntity.ok(collegeService.getAllColleges());
    }

    @GetMapping("/{id}")
    public ResponseEntity<College> getCollegeById(@PathVariable int collegeid) {
        return ResponseEntity.ok(collegeService.getCollegeById(collegeid));
    }

    @GetMapping("/collegename/{collegename}")
    public ResponseEntity<College> getCollegeByname(@PathVariable String collegename) {
        return ResponseEntity.ok(collegeService.getCollegeByname(collegename));
    }

    @PutMapping("/{id}")
    public ResponseEntity<College> updateCollegeName(@PathVariable int collegeid, @RequestBody String newName) {
        return ResponseEntity.ok(collegeService.updateCollegeName(collegeid, newName));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCollege(@PathVariable int collegeid) {
        collegeService.deleteCollege(collegeid);
        return ResponseEntity.noContent().build();
    }


}