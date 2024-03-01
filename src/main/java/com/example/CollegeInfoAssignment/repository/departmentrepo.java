package com.example.CollegeInfoAssignment.repository;

import com.example.CollegeInfoAssignment.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface departmentrepo extends JpaRepository<Department, Integer>{
    List<Department> findByCollegeName(String collegeName);
}

