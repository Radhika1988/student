package com.neoteric.student.students.service;

import com.neoteric.student.students.Admission;
import com.neoteric.student.students.Student;

import java.util.UUID;

public class StudentService {

    public Admission getadmission(Student sri){

     Admission admission1 =null;

     if(sri.age>8){

     admission1 = new Admission();

     admission1.rollNumber="b12"+ UUID.randomUUID().toString();
     admission1.fee=5000;
     admission1.standard=sri.standared;

     }
     return admission1;

    }

    
}
