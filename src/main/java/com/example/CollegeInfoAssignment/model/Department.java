package com.example.CollegeInfoAssignment.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "departments")
public class Department {
    @Id
    @GeneratedValue

    public int deptid;
   public String deptname;
   public String deptthod;
    public int collegeid;
    public String collegename;

    public String deptcode;
    public String deptemail;


    @ManyToOne
    @JsonIgnore
     // Corrected the name to match the column name in the database
    @JoinColumn(name = "collegeid", insertable = false, updatable = false)
    private College college;

    @OneToMany(mappedBy = "department")
    private List<Faculty> faculties;


}
