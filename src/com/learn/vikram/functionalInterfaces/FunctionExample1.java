package com.learn.vikram.functionalInterfaces;

public class FunctionExample1 {

    public static String performConccat(String str){
        return FunctionExample.addSomeString.apply(str);
    }

    public static void main(String[] args) {
        String result = performConccat("vikram");
        System.out.println("Result : "+result);
    }
}
