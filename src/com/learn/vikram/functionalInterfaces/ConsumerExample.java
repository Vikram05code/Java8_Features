package com.learn.vikram.functionalInterfaces;

import com.learn.vikram.data.Student;
import com.learn.vikram.data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    static Consumer<Student> consumer2 = (student) -> System.out.println(student);
    static Consumer<Student> consumer3 = (student) -> System.out.print(student.getName());
    static Consumer<Student> consumer4 = (student) -> System.out.println(student.getActivities());


    public static void printStudents() {
        System.out.println("printStudents");
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(consumer2);
    }

    public static void printNameAndActivities() {
        System.out.println("printNameAndActivities");
        List<Student> studentList = StudentDataBase.getAllStudents();

        studentList.forEach(consumer3.andThen(consumer4)); //consumer chaining
    }

    public static void printNameAndActivitiesUsingCondition() {
        System.out.println("printNameAndActivitiesUsingCondition");
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(student->{
            if(student.getGradeLevel()>=3 && student.getGpa()>=3.8){
                consumer3.andThen(consumer4).andThen(consumer2).accept(student);
            }
        });
    }


    public static void main(String[] args) {

        Consumer<String> consumer1 = s -> System.out.println(s.toUpperCase());
        consumer1.accept("vikram");

        printStudents();
        printNameAndActivities();
        printNameAndActivitiesUsingCondition();

    }


}
