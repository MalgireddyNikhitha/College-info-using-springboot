package com.example.CollegeInfoAssignment.service;

import com.example.CollegeInfoAssignment.model.Department;
import com.example.CollegeInfoAssignment.repository.departmentrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Departmentservice {
    @Autowired
    private departmentrepo departmetrepository;
    public Department addDepartment(Department department) {
        return departmetrepository.save(department);
    }

    public List<Department> getDepartmentsByCollegename(String collegename) {
        return departmetrepository.findByCollegename(collegename);
    }
}
