package com.Java_Techincal_Excer;

public class CompareTwoArray3 {

    public static void main(String[] args){

        String[] arr1={"pass","Math","sass","tass","poss","MOSS"};

        String[] arr2={"Math","KOSS","sass","tass","poss","MOSS"};

        int i=0;
        int j=0;

        //i<5

        while(i< arr1.length &&j<arr2.length){

            if (arr1[i].equals(arr2[j])){

                System.out.println(arr1[i]);

                j++;

                i++;


            }

            else if (arr1[i] !=arr2[j]){

                j++;

                i++;


            }

        }
    }
}
