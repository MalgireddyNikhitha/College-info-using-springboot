package com.example.CollegeInfoAssignment.repository;

import com.example.CollegeInfoAssignment.model.College;
import com.example.CollegeInfoAssignment.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface collegerepo extends JpaRepository<College,Long> {


    List<Department> findByname(String name);


    College findByName(String name);




}

