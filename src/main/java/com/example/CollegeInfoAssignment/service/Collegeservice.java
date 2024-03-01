package com.example.CollegeInfoAssignment.service;

import com.example.CollegeInfoAssignment.model.College;
import com.example.CollegeInfoAssignment.repository.collegerepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
public class Collegeservice {
    @Autowired
    private collegerepo collegeRepo;

    public College addCollege(College college) {
        return collegeRepo.save(college);
        }


    public List<College> getAllColleges() {
        return collegeRepo.findAll();
    }

    public College getCollegeById(int collegeid) {
        return collegeRepo.findById(collegeid).get();
    }

    public College getCollegeByname(String collegename) {
        return collegeRepo.findByCollegename(collegename);
    }

    public College updateCollegeName(int collegeid, String newName) {
       College college = collegeRepo.findById(collegeid).get();
       college.setCollegename(newName);
       return collegeRepo.save(college);

    }


    public void deleteCollege(int collegeid) {

        collegeRepo.deleteById(collegeid);
    }
}
