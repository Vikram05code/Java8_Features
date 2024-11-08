package com.learn.vikram;

public class LambdaExample {

    public static void main(String[] args) {

        //prior java 8
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Runnable");
            }
        };
        new Thread(runnable).start();


        //after java 8
        Runnable runnable1 = ()->System.out.println("Inside Runnable1");
        new Thread(runnable1).start();


        new Thread(()->System.out.println("Inside Runnable1")).start();


    }

}
