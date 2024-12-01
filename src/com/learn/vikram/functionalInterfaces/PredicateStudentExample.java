package com.learn.vikram.functionalInterfaces;

import com.learn.vikram.data.Student;
import com.learn.vikram.data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample {

   static Predicate<Student> p1 = student -> student.getGradeLevel()>=3;

   static Predicate<Student> p2 = student -> student.getGpa()>=3.9;

    public static void filterStudentByGradeLevel(){
        System.out.println("-------------filterStudentByGradeLevel-------------");
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(student->{
            if(p1.test(student)){
                System.out.println(student);
            }
        });
    }

    public static void filterStudentByGPA(){
        System.out.println("-------------filterStudentByGPA-------------");
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(student->{
            if(p2.test(student)){
                System.out.println(student);
            }
        });
    }

    public static void filterStudents(){
        System.out.println("-------------filterStudent-------------");
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(student->{
            if(p1.and(p2).test(student)){
                System.out.println(student);
            }
        });
    }

    public static void filterStudentsUsingOR(){
        System.out.println("-------------filterStudent-------------");
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(student->{
            if(p1.or(p2).negate().test(student)){
                System.out.println(student);
            }else{
                System.out.println(student);
            }
        });
    }


    public static void main(String[] args){
        filterStudentByGradeLevel();
        filterStudentByGPA();
        filterStudents();

    }
}
