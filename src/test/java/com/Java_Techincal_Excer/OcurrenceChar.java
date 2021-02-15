package com.Java_Techincal_Excer;


public class OcurrenceChar {

    public static void main(String[] args){

        String string=" ABLIMITJAN QAndAq AhwAligiz";
         int k=0;
        for (int i=0; i<=string.length()-1; i++){

            if (string.charAt(i)==string.charAt(1)){

                k++;

            }
        }

        System.out.println(k);
    }
}
