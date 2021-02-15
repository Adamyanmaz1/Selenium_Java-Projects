package com.Java_Techincal_Excer.JavaTechnicalPract2;

public class ReverseString1 {

    public static void main(String[] args){

        String str1=" Hello world, are you still looking at us?";

        System.out.println(str1);

        StringBuilder str2=new StringBuilder(str1);

        System.out.println(str2.reverse().toString());

        char[] ArrayStr=str1.toCharArray();

        int i;

        StringBuilder builder=new StringBuilder();

        for ( i=ArrayStr.length-1; i>=0; i--){

            builder.append(ArrayStr[i]) ;
        }


        System.out.println(builder);
    }


}
