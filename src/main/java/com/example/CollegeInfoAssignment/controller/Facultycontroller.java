package com.example.CollegeInfoAssignment.controller;

import com.example.CollegeInfoAssignment.model.Faculty;
import com.example.CollegeInfoAssignment.service.facultyservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/faculty")

public class Facultycontroller {
    @Autowired
    private facultyservice facultyService;

    @PostMapping
    public Faculty addFaculty(@RequestBody Faculty faculty) {
        Faculty addedFaculty = facultyService.addFaculty(faculty);
        return addedFaculty;
    }

    @GetMapping("/department/{departmentName}")
    public List<Faculty> getFacultiesByDepartmentName(@PathVariable String departmentName) {
        List<Faculty> faculties = facultyService.getFacultiesByDepartmentName(departmentName);
        return faculties;
    }

}
