package com.Java_Techincal_Excer;

public class SumArray {

    public static void main(String[] args){

        int[] a={1,3,5,6,7,8,9};


        int sum=sumArray(a);

        System.out.println(sum);

        int MultiplyResult=multiply(5,10);

        System.out.println(MultiplyResult);


    }

    public static int sumArray(int[] a) {
        int sum = 0;
        for (int b = 0; b <= a.length - 1; b++) {

            sum = sum + a[b];
        }

      //  System.out.println(sum);


        return sum;
    }

    public static int multiply(int i,int j){

        int k=1;

        int sum1=0;

        while (k<=j){

            sum1=sum1+i;

            k++;
        }



        return sum1;
    }

}
