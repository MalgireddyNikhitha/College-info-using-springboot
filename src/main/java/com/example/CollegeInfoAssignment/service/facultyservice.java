package com.example.CollegeInfoAssignment.service;

import com.example.CollegeInfoAssignment.model.Faculty;
import com.example.CollegeInfoAssignment.repository.facultyrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class facultyservice {
    @Autowired
    private facultyrepo facultyRepository;


    public Faculty addFaculty(Faculty faculty) {
        return facultyRepository.save(faculty);
    }


    public List<Faculty> getFacultiesByDepartmentName(String departmentName) {
        return facultyRepository.findByDepartmentName(departmentName);
    }
}
