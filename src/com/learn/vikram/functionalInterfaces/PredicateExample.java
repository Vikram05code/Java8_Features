package com.learn.vikram.functionalInterfaces;

import java.util.function.Predicate;

public class PredicateExample {

    static Predicate<Integer> p = (num)->{return num%2==0;};

    static Predicate<Integer> p1 = num-> num%2==0;
    static Predicate<Integer> p2 = num-> num%5==0;

    public static void  predicateAnd(Integer num){
        System.out.println(p1.and(p2).test(num));  //Predicate chaining

    }

    public static void  predicateOR(Integer num){
        System.out.println(p1.or(p2).test(num));  //Predicate chaining

    }

    public static void main(String[] args) {
        System.out.println(p.test(10));
        System.out.println(p1.test(12));
        predicateAnd(10);
        predicateAnd(11);

        predicateOR(10);
        predicateOR(8);
        predicateOR(9);
    }
}
