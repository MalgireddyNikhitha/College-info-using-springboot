package com.example.CollegeInfoAssignment.service;

import com.example.CollegeInfoAssignment.model.Department;
import com.example.CollegeInfoAssignment.repository.departmentrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Departmentservice {
    @Autowired
    private departmentrepo departmentRepository;


    public Department addDepartment(Department department) {
        return departmentRepository.save(department);
    }

    public List<Department> getDepartmentsByCollegeName(String collegeName) {
        return departmentRepository.findByCollegeName(collegeName);
    }
}
