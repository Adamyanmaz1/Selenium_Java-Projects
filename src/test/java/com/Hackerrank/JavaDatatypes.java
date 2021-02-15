package com.Hackerrank;

import java.util.Scanner;

public class JavaDatatypes {

    public static void main(String[] args) {

        Scanner scanner1 = new Scanner(System.in);

        long Numb = scanner1.nextLong();

        if (Numb >= Byte.MIN_VALUE && Numb <= Byte.MAX_VALUE) {

            System.out.println(Numb+" can be fitted in:");

            System.out.println("* Byte");

            System.out.println("* short");
            System.out.println("* int");

            System.out.println("* long");
        }

        else if (Numb >= Short.MIN_VALUE && Numb <= Byte.MIN_VALUE || Numb <= Short.MAX_VALUE && Numb >= Byte.MAX_VALUE) {

            System.out.println(Numb+" can be fitted in:");

            System.out.println(" * short");
            System.out.println(" *  int");
            System.out.println(" * long");

        }

        else if (Numb >= Integer.MIN_VALUE && Numb <= Short.MIN_VALUE || Numb <= Integer.MAX_VALUE && Numb >= Short.MAX_VALUE) {

            System.out.println(Numb+" can be fitted in:");


            System.out.println(" *  int");
            System.out.println(" * long");
        }

        else
        {
            System.out.println(Numb+" can be fitted in:");
            System.out.println(" * long");
        }

    }
}