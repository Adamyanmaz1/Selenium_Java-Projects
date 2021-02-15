package com.Java_Techincal_Excer;

public class WrappperClass_demo {
    
    public static void main(String[] args){

        int num=5;

        Integer obj1= Integer.valueOf(num);

        System.out.println(obj1);

        //////////////////////////////////

        Integer object1=new Integer(10);

        int num1=object1.intValue();

        System.out.println(num1);
        //////////////////////////////////

        int number=100;

        Integer obj2=Integer.valueOf(number);

        System.out.println(obj2);
        //////////////////////////////////

        Integer obj3=new Integer(200);

        int number1=obj3.intValue();

    }
}
