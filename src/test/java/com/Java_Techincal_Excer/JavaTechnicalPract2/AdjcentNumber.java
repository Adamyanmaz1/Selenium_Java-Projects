package com.Java_Techincal_Excer.JavaTechnicalPract2;

public class AdjcentNumber {

    public static void main(String[] args){

        int[] arr={2,5,8,99,788,666};

        int MaxNum=0;

        for (int i=0;i<arr.length; i++){

            for (int j=i+1; j<arr.length;j++ ){

                if (arr[i]>arr[j]){

                    MaxNum=arr[i];
                }
            }
        }

        System.out.println(MaxNum);
    }
}
