package com.Java_Techincal_Excer.JavaTechnicalPract1;

public class SwapInteger_Naveen {

    public  static void main(String[] args){

        int x=5;

        int y=7;


        System.out.println(x+" , "+y);

        //by third party
        int temp;

        temp=x;

        x=y;

        y=temp;


        System.out.println(x+" , "+y);



        // replacing variables without using third element



        int x1=5;

        int y1=7;



// use swap to replace variables
        x1=x1+y1;

        y1=x1-y1;

        x1=x1-y1;

        System.out.println(x1+" , "+y1);
    }
}
