package com.Java_Techincal_Excer;

public class MinNumberTwoDimArray {

    public static void main(String[] args){

        int[][] abc={{2,4,6,9},{3,5,7,10},{1,3,5,11}};

        int MinNum=abc[0][0];

        System.out.println(MinNum);

        for (int i=0;i<3; i++){

            for (int j=0; j<3;j++){

                if(abc[i][j]<MinNum){
                    MinNum=abc[i][j];
                }

            }
        }

        System.out.println(MinNum);
    }
}
