package com.Java_Techincal_Excer;

import java.util.Scanner;

public class IsPalindrome1 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter String:   ");

        String string=scanner.nextLine();

        if (isPalindrome(string)){

            System.out.println("this is palindrome ");
        }
        else {
            System.out.println("this is not palindrome");
        }

    }

    public static boolean isPalindrome(String string){
        int head=0;
        int tail=string.length()-1;

        while(head<tail){
            if (string.charAt(head) != string.charAt(tail)){
                return false;
            }
            else {
                head++;
                tail--;
            }
        }

        return true;
    }
}

