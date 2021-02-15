package com.Java_Techincal_Excer;

public class StringDemo {

    public static void main(String[] args){

        String str="I am going to school";

        System.out.println(str);

        /*
        StringBuilder str1=new StringBuilder(str);


        System.out.println(str1.reverse());

         */

        char[] arr=str.toCharArray();

        System.out.println(arr.length);

        StringBuilder ReStr= new StringBuilder();

        for(int i=arr.length-1; i>=0;i--){

            ReStr.append(arr[i]);

        }

        System.out.println(ReStr);

        /////////////

        int count=0;

        for(int c=0; c<=arr.length-1;c++){
            count++;

            for (int j=1; j<=arr.length;j++){


            }


        }



    }
}
