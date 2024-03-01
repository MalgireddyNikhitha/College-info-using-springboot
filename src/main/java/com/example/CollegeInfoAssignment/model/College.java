package com.example.CollegeInfoAssignment.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "colleges")
public class College {
    @Id
    @GeneratedValue


    public int collegeid;
    public String collegename;
    public String collegeaddress;
    public String collegeemail;
    public String collegephone;
    public String collegewebsite;
    public String collegecode;



    @OneToMany(mappedBy = "college", cascade = CascadeType.ALL) // Added cascade type
    private List<Department> departments;



}
