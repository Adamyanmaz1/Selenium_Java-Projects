package com.Java_Techincal_Excer;

import java.util.Scanner;

public class IsPrimeNum {

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println(" Please enter a number:  ");

        int Number=scan.nextInt();
if (isPrimeNumber(Number)){

    System.out.println(" This is a prime Number");
}

else {
    System.out.println("This is not a prime number!!!");
}


    }

public static boolean isPrimeNumber(int num){
        if (num<=1){
            return false;
        }

        for (int i=2;i<num;i++){
            if (num %i==0){
                return false;
            }
        }
        return true;
}

}
