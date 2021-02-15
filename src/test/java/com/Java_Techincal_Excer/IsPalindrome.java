package com.Java_Techincal_Excer;

import java.util.Scanner;

public class IsPalindrome {

    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);

System.out.println(" PLEASE ENTER YOUR STRING:  ");
        String string=scanner.nextLine();



        if (isPalindrome(string)){

            System.out.println("This is  palindrome");
        }
else {

    System.out.println("This is not Palindrome");
        }
    }

    public static boolean isPalindrome(String s) {
        int head = 0;
        int tail = s.length() - 1;
        while (head < tail) {
            if (s.charAt(head) != s.charAt(tail)) {
                return false;
            }
            head++;
            tail--;
        }
        return true; }
}
