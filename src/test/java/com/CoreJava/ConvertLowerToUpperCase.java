package com.CoreJava;

import java.util.Scanner;

public class ConvertLowerToUpperCase {


    public static void toLowerCase(String str) {
        for (int i = 0; i < str.length(); i++) {
            char singleLette = str.charAt(i);
            if (singleLette >= 65 && singleLette <= 90) {
                singleLette = (char)(singleLette + 32);
            }
            System.out.print(singleLette);
        }
    }

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Please enter some words: ");

        String str=scanner.nextLine();
        toLowerCase(str);
    }
}
