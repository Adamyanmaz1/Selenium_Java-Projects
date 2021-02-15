package com.Java_Techincal_Excer.JavaTechnicalPract2;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(" Please enter a number for integer::  ");

        int Number = scanner.nextInt();

        if (isPrimeNum(Number)) {

            System.out.println(" This is prime number");
        } else {

            System.out.println(" This is not prime number");
        }


    }

    public static boolean isPrimeNum(int Num) {

        if (Num < 1) {

            return false;
        }

        for (int i = 2; i < Num; i++) {

            if (i % 2 == 0) {


                return false;
            }

        }
        return true;
    }

}