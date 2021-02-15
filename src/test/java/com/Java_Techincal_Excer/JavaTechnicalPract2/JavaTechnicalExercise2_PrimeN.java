package com.Java_Techincal_Excer.JavaTechnicalPract2;

import java.util.Scanner;

public class JavaTechnicalExercise2_PrimeN {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(" Please a integer number:    ");

        int Num = scanner.nextInt();


        if (IsPrime(Num)){

            System.out.println(" This is truely a Prime number");
        }

        else {

            System.out.println(" this is not prime number");
        }


    }


        private static  boolean IsPrime(int Number){

        if (Number<=1){

           return false;
        }

        for (int i=2; i<Number; i++){

            if (i%2==0){

                return false;
            }
        }

            return true;
        }

}
