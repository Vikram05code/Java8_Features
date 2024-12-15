package com.learn.vikram.functionalInterfaces;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    static Comparator<Integer> comparator = (num1, num2)->num1.compareTo(num2);
    public static void main(String[] args){
        BinaryOperator<Integer> binaryOperator = (num1, num2)->num1*num2;
        System.out.println(binaryOperator.apply(5,4));

        BinaryOperator<Integer> maxBy = BinaryOperator.maxBy(comparator);
        System.out.println(maxBy.apply(5,4));

        BinaryOperator<Integer> minBy = BinaryOperator.minBy(comparator);
        System.out.println(minBy.apply(5,4));
    }
}
