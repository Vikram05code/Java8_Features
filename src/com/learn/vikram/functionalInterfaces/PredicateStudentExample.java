package com.learn.vikram.functionalInterfaces;

import com.learn.vikram.data.Student;
import com.learn.vikram.data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample {

   static Predicate<Student> p1 = student -> student.getGradeLevel()>=3;

    public static void filterStudentByGradeLevel(){
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(student->{
            if(p1.test(student)){
                System.out.println(student);
            }
        });
    }


    public static void main(String[] args){
        filterStudentByGradeLevel();
    }
}