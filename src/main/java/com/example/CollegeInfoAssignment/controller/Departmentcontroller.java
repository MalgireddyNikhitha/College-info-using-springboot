package com.example.CollegeInfoAssignment.controller;

import com.example.CollegeInfoAssignment.model.Department;
import com.example.CollegeInfoAssignment.service.Departmentservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departments")
public class Departmentcontroller {
    @Autowired
    private Departmentservice departmentService;
    @PostMapping
    public ResponseEntity<Department> addDepartment(@RequestBody Department department) {
        return ResponseEntity.ok(departmentService.addDepartment(department));
    }

    @GetMapping("/collegename/{collegename}")
    public ResponseEntity<List<Department>> getDepartmentsByCollegename(@PathVariable String collegename) {
        return ResponseEntity.ok(departmentService.getDepartmentsByCollegename(collegename));
    }
}
