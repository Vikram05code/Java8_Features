package com.learn.vikram.functionalInterfaces;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

    static UnaryOperator<String> unaryOperator = s->s.concat("Programming");

    public static void main(String[] args){
     System.out.println(unaryOperator.apply("Java"));
    }
}
