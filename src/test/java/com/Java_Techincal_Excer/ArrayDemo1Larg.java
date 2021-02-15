package com.Java_Techincal_Excer;

import java.util.Arrays;

public class ArrayDemo1Larg {

    public static void main(String[] args){

        int[] arr={1,2,3000,4,5,6};
int[] array={2,8,967,66,44,5555,7777,98766};

       // Arrays.sort(arr);

    //    System.out.println(arr[arr.length-1]);

        int maxNum;

        for (int i=0; i<array.length-1; i++) {

            for (int j = i + 1; j < array.length - 1; j++) {

                if (array[i] > array[j]) {

                     maxNum=array[i];

                    array[i] = array[j];

                     array[j]=maxNum;

                }

            }

        }

        System.out.println(array[array.length-1]);

    }
}
