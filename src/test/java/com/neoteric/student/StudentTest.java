package com.neoteric.student;

import com.neoteric.student.students.Admission;
import com.neoteric.student.students.Student;
import com.neoteric.student.students.service.StudentService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StudentTest {

    @Test

    public void studentTest(){

        Student radhika = new Student();
        radhika.fistName="sri";
        radhika.age= 4;
        radhika.Admission="12345";
        radhika.address="hyd";
        radhika.standared="V";


        StudentService service=new StudentService();
        service.getadmission(radhika);

        Admission admission= service.getadmission(radhika);


        Assertions.assertEquals(5000, admission.fee);
        Assertions.assertNotNull(admission.rollNumber);
        Assertions.assertNotNull(admission.standard);




    }
}
