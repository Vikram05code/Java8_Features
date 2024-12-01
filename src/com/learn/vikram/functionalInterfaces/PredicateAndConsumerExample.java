package com.learn.vikram.functionalInterfaces;

import com.learn.vikram.data.Student;
import com.learn.vikram.data.StudentDataBase;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.List;

public class PredicateAndConsumerExample {

    Predicate<Student> p1 = student->student.getGradeLevel()>=3;
    Predicate<Student> p2 = student->student.getGpa()>=3.9;
    BiConsumer<String,List<String>> studentBiConsumer = (name,activities)->{
         System.out.println(name+": "+activities);
    };

    Consumer<Student> studentConsumer = student ->{
        if(p1.and(p2).test(student)){
            studentBiConsumer.accept(student.getName(), student.getActivities());
        }
    };

    public void printNameAndActivities(List<Student> studentList){
        studentList.forEach(studentConsumer);
    }



    public static void main(String[] args){
       List<Student> studentList = StudentDataBase.getAllStudents();
       PredicateAndConsumerExample predicateAndConsumerExample = new PredicateAndConsumerExample();
       predicateAndConsumerExample.printNameAndActivities(studentList);
    }
}
