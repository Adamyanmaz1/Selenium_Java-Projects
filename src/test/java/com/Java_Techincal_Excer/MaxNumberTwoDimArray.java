package com.Java_Techincal_Excer;

public class MaxNumberTwoDimArray {

    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4, 5},
                {100, 101, 102, 103, 10491},
                {2, 80, 70, 57, 66},
                {1000, 10001, 65, 34, 54000}
        };
        System.out.println(arr.length);
//        int max = Integer.MIN_VALUE;
        int max = arr[0][0];

       // int min = arr[0][0];

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(arr[i][j] > max){
                    max = arr[i][j];
                }
            }

        }
        System.out.println("Maximum Value : " + max);
    }
}
