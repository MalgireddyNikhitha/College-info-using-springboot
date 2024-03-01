package com.example.CollegeInfoAssignment.repository;

import com.example.CollegeInfoAssignment.model.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@Repository
public interface facultyrepo extends JpaRepository<Faculty,Integer>{

    List<Faculty> findByDepartmentName(String departmentName);
}
