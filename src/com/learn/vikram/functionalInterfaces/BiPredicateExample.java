package com.learn.vikram.functionalInterfaces;

import com.learn.vikram.data.Student;
import com.learn.vikram.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class BiPredicateExample {

    Predicate<Student> p1 = student->student.getGradeLevel()>=3;
    Predicate<Student> p2 = student->student.getGpa()>=3.9;

    BiPredicate<Integer, Double> biPredicate = (gradeLevel, gpa)-> gradeLevel>=3 && gpa>=3.9;
    BiConsumer<String, List<String>> studentBiConsumer = (name, activities)->{
        System.out.println(name+": "+activities);
    };

    Consumer<Student> studentConsumer = student ->{
        if(biPredicate.test(student.getGradeLevel(),student.getGpa())){
            studentBiConsumer.accept(student.getName(), student.getActivities());
        }
    };

    public void printNameAndActivities(List<Student> studentList){
        studentList.forEach(studentConsumer);
    }



    public static void main(String[] args){
        List<Student> studentList = StudentDataBase.getAllStudents();
        BiPredicateExample biPredicateExample = new BiPredicateExample();
        biPredicateExample.printNameAndActivities(studentList);
    }
}

