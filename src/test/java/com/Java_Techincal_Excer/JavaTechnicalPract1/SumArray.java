package com.Java_Techincal_Excer.JavaTechnicalPract1;

public class SumArray {

    public static void main(String[] args) {

        int[] array1 = {22, 44, 67, 88, 40, 77};

        int sum = 0;

        for (int i = 0; i <= array1.length - 1; i++) {

            sum += array1[i];

        }

            System.out.println(sum);


            int multiplication = multiply1(10, 10);

            System.out.println(multiplication);


    }

        public static int multiply1 ( int a, int b){
            int k = 1;

            int sum2 = 0;
            while (k <= b) {

                sum2 = sum2 + a;

                k++;
            }

            return sum2;

        }

}