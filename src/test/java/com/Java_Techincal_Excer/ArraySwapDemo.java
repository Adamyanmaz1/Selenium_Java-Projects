package com.Java_Techincal_Excer;

public class ArraySwapDemo {

    public static void main(String[] args){

        int a=5;

        int b=3;

        System.out.println(" before -->integer a is  "+a+" integer b is  "+b);

        // One senario

        a=a+b;

        b=a-b;

        a=a-b;

        System.out.println(" After1 -->integer a is  "+a+" integer b is  "+b);

        System.out.println("*********************************");

        // second senario;

        int a1=5;

        int b1=3;

        int temp=a1-b1;   //2

        b1=temp+b1;      //

        a1=b1-temp;

        System.out.println(temp);

        System.out.println(" After2 -->integer a is  "+a1+" integer b is  "+b1);


    }
}
