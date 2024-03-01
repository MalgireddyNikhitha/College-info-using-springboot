package com.example.CollegeInfoAssignment.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "faculties")
public class Faculty {
    @Id
    @GeneratedValue
    public  int fid;
    public String fname;
    public int collegeid;
    public int deptid;
    public String deptname;
    public String fcontact;
    public String femail;

    public String gender;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "deptid",insertable = false, updatable = false)
    private Department department;



}
