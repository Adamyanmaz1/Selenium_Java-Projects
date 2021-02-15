package com.Java_Techincal_Excer;

public class SortingArrayBySwap {

    public static void main(String[] args){

        int[] a={-2,6,1,4,9,1000};

        //1,2,3,4,6,9

        for (int i=0; i<a.length; i++){

            for(int j=0; j<a.length; j++){
                if (a[i]>a[j]){

                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }

        System.out.println("**********************");
        System.out.println("DeScending order by hard code");

        for (int i=0; i<a.length; i++){
            System.out.println(a[i]);

        }
        System.out.println("**********************");
        System.out.println("AScending order by hard code");

        for(int j=a.length-1; j>=0; j--){

            System.out.println(a[j]);
        }
    }
}
