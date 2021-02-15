package com.Java_Techincal_Excer;

public class AdjacentArray {

    public static void main(String[] args){

        int[] a={1,4,5,6,7,890};

        int dif=0;

        for (int i=0; i<a.length-1; i++){

            if (a[i+1]-a[i]>dif){

                dif=a[i+1]-a[i];

            }
        }

        System.out.println(dif);
    }
}
