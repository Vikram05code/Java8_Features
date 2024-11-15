package com.learn.vikram.functionalInterfaces;

import com.learn.vikram.data.Student;
import com.learn.vikram.data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    public static void printStudents(){
        Consumer<Student> consumer1 = (student)->System.out.println(student);
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(consumer1);
    }

    public static void main(String[] args){

        Consumer<String> consumer1 = s->System.out.println(s.toUpperCase());
        consumer1.accept("vikram");

        printStudents();

    }


}
