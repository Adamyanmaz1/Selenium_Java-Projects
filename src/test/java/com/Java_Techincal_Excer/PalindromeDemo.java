package com.Java_Techincal_Excer;

import java.util.Scanner;

public class PalindromeDemo {
    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);

        System.out.println(" Please enter a String and check is this palindrome or not: //");
       String orginalStr=scanner.nextLine();

       if (isPalindrome(orginalStr)){

           System.out.println(" this is a palindrome");
       }
       else {
           System.out.println(" this is not  a palindrome");
       }
    }




    public static boolean isPalindrome(String str) {
//        if(str == null)
//            return false;
        StringBuilder sb = new StringBuilder(str);
        return
                sb.reverse().toString().equalsIgnoreCase(str);

    }


}
