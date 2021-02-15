package com.Java_Techincal_Excer;

public class ReverseNum {

    public static void main(String[] args){

        int a=567;

        int reversedNum=0;

        while(a!=0){

            int digit=a%10;

            reversedNum=digit+reversedNum*10;

            a=a/10;

            System.out.println(reversedNum);

        }

        System.out.println(reversedNum);


        System.out.println(7+6+5);
    }
}
