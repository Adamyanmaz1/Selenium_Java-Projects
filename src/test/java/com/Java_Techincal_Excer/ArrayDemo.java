package com.Java_Techincal_Excer;

import java.util.Arrays;

public class ArrayDemo {

    public static void main(String[] args){

        String[] str=new String[4];
        str[0]="mamut";
        str[1]="Gulum";
        str[2]="tohti";
        str[3]="Amut";

        System.out.println(str.length);
       for (String s: str){

           System.out.println(s);
       }

      int[] integer1=new int[]{1,2,3,4,54,5,7,9};

       StringBuilder stringBuilder=new StringBuilder();

       for (int number: integer1){

           System.out.println(number);

           stringBuilder.append(number);
       }
        System.out.println(stringBuilder);

        Arrays.sort(integer1);
// second largest element in this inger array in Java
        System.out.println(integer1[integer1.length-2]);

        // first largest  element in this integer array in Java

        System.out.println(integer1[integer1.length-1]);

        // The smallest element in this inger array in Java

        System.out.println(integer1[0]);

    }
}
