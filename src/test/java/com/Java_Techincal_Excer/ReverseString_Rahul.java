package com.Java_Techincal_Excer;

import java.util.Scanner;

public class ReverseString_Rahul {



    public static void main(String[] args) {


        System.out.println(" plese enter a palindrome:  ");

        Scanner scan= new Scanner(System.in);

        String str=  scan.nextLine();

        System.out.println(str);




      String sum = "";

//StringBuilder sum=new StringBuilder();

        for ( int i= str.length()-1;  i>=0; i--) {

         sum= String.format("%s%s", sum, str.charAt(i));


         //   sum.append(str.charAt(i));

        }
        System.out.println(" Reverse String of str::"+sum);


        if (str.equalsIgnoreCase(sum)){

            System.out.println("str is a palindrome");
        }

        else {
            System.out.println("str is not palindrome");
        }
        }
    }
