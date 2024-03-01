package com.example.CollegeInfoAssignment.repository;

import com.example.CollegeInfoAssignment.model.College;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface collegerepo extends JpaRepository<College,Integer> {

    College findByCollegename(String collegename);
}
