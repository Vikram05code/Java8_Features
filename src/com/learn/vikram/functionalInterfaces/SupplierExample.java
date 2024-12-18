package com.learn.vikram.functionalInterfaces;

import com.learn.vikram.data.Student;
import com.learn.vikram.data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {

    public static void main(String[] args){
        Supplier<Student> studentSupplier = ()->{
            return new Student("Jenny",2,3.8,"female", Arrays.asList("swimming", "gymnastics","soccer"));
        };
        Supplier<List<Student>> studentListSupplier = ()-> StudentDataBase.getAllStudents();
        System.out.println("Student is : "+studentSupplier.get());
        System.out.println("Students are : "+studentListSupplier.get());
    }
}
