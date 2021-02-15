package com.Java_Practice_Amazone;

public class LargestNumArray {

    public static void main(String[] args) {

        int[] array = {20000, 4, -5, 6, 7, 8, 9, 100, 300, 500,40000};

//      Arrays.sort(array);  //Ascending by default
//
//        System.out.println(array[array.length - 1]);

        // ************************************************

        for (int i = 0; i < array.length; i++) {

            for (int j = i+1; j< array.length;j++) {

                if (array[i] >array[j] ) {

                    int temp=array[i];

                    array[i]=array[j];

                    array[j]=temp;


                }

            }


        }

        System.out.println(array[array.length-1]);
    }
}
