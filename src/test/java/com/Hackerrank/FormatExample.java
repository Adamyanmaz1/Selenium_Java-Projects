package com.Hackerrank;


import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class FormatExample {

    public static void main(String[] args){


        String name="sonoo";

        String sf1=String.format("%s",name);

        String sf4=String.format("%-10s",name);


        String sf2=String.format("value is %1f",32.33434);
        String sf3=String.format("value is %32.12f",32.33434);//returns 12 char fractional part filling with 0

        System.out.println(sf1);
        System.out.println(sf4);
        System.out.println(sf2);
        System.out.println(sf3);



            String s = "a/b/c/d";
            String[] a1 = s.split("/");
            System.out.println("split string using only regex:");
            for (String string : a1) {
                System.out.println(string);
            }
        System.out.println("*******************************");


        String[] a2 = s.split("/", 2);
        for (String string : a2) {
            System.out.println(string);
        }
        String s2 = "Hello World";
        s2 = s2.replace('l', 'm');
        System.out.println("After Replacing l with m :");
        System.out.println(s2);
        System.out.println("*******************************");
        String s3 = "Hello guys, Hello world";
        s3 = s3.replaceFirst("Hello", "Hi");
        System.out.println("After Replacing :");
        System.out.println(s3);

        System.out.println("*******************************");

        String s4 = "journaldev.com";
        // %s is used to append the string
        System.out.println(String.format("This is %s", s4));

        System.out.println("This is " + s4);

        System.out.println("*******************************");


        System.out.println(String.format(Locale.US, "%f", 3.14));


        System.out.println("*******************************");
        String s5 = "This is journaldev.com";
        s5 = s5.substring(8,18);
        System.out.println(s5);
        System.out.println("*******************************");




    }
}

