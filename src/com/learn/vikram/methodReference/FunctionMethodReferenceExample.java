package com.learn.vikram.methodReference;

import java.util.function.Function;

public class FunctionMethodReferenceExample {

    static Function<String, String> toUpperCaseLambda = str->str.toUpperCase();
    static Function<String, String> toUpperCaseMethodReference = String::toUpperCase;




    public static void main(String[] args){
      System.out.println(toUpperCaseLambda.apply("vikram"));
        System.out.println(toUpperCaseMethodReference.apply("vikram"));
    }
}
