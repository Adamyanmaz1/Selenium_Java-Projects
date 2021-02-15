package com.Java_Techincal_Excer;

public class StringFormatInJava {

    public static void main(String[] args){

        String output = String.format("%s is  %d", "joe", 35);

        System.out.println(output);

       System.out.printf("%C",   'g');

        System.out.println(String.format("%10C",'g'));

        System.out.printf("Hello %s!%n", "World");


    }
}
