package com.example.CollegeInfoAssignment.controller;

import com.example.CollegeInfoAssignment.model.Faculty;
import com.example.CollegeInfoAssignment.service.facultyservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/faculties")
public class Facultycontroller {
    @Autowired
    private facultyservice facultyService;
    @PostMapping
    public ResponseEntity<Faculty> addFaculty(@RequestBody Faculty faculty) {
        return ResponseEntity.ok(facultyService.addFaculty(faculty));
    }

    @GetMapping("/department/{departmentName}")
    public ResponseEntity<List<Faculty>> getFacultiesByDeptname(@PathVariable String deptname) {
        return ResponseEntity.ok(facultyService.getFacultiesByDeptname(deptname));
    }

}
