package com.Java_Techincal_Excer.JavaTechnicalPract2;

public class CompareTwoIntegerArray {

    public static void main(String[] args){

        int[] a1={3,5,6,7,8,9,10};

        int[] b1={4,9,3,7,5,8,6,11};

        for (int i=0; i<a1.length; i++){

            for (int j=0; j<b1.length; j++){

                if (a1[i]==b1[j]){

                    System.out.println(a1[i]);
                }
            }
        }
    }
}
