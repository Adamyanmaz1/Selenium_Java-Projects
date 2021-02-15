package com.Java_Techincal_Excer;

public class CompareTwoArray2 {

    public static void main(String[] args){

        int[] arr1={2,3,4,5,6,7,11};

        int[] arr2={4,6,8,9,12,11,5};

        int i=0;
        int j=0;

        //i<5

        while(i< arr1.length &&j<arr2.length){

            if (arr1[i]==arr2[j]){

                System.out.println(arr1[i]);
                j++;

                i++;


            }

            else if (arr1[i]>arr2[j]){

                j++;
            }
            else {
                i++;
            }
        }
    }
}
