package com.Java_Techincal_Excer;

public class FactorialExample {

    public static void main(String[] args){

        int number = 10;
        int factorialSum = 1;
        for(int i = 1 ; i <=number; i++) {
            factorialSum = factorialSum * i;
        }
        System.out.println("Factorial of " + number + " is " + factorialSum);

    }
    }

