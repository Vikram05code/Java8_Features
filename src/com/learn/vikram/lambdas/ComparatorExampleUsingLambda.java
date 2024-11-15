package com.learn.vikram.lambdas;

import java.util.Comparator;

public class ComparatorExampleUsingLambda {

    public static void main(String[] args) {

        //prior java 8
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer ob1, Integer ob2) {
                return ob1.compareTo(ob2); //return 0 if equal, return 1 if ob1>ob2, return -1 if ob1<ob2

            }
        };
        System.out.println("Result of Comparator is: "+comparator.compare(35,30));

        //after java 8
        Comparator<Integer> comparatorLambda = (Integer ob1, Integer ob2)->ob1.compareTo(ob2);
        System.out.println("Result of Comparator using Lambda is: "+comparatorLambda.compare(35,30));

        Comparator<Integer> comparatorLambda1 = (ob1, ob2)->ob1.compareTo(ob2);
        System.out.println("Result of Comparator using Lambda is: "+comparatorLambda1.compare(40,30));
    }
}
