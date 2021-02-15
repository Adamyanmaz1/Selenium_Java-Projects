package com.Java_Techincal_Excer;

import java.util.Scanner;

public class CompareTheTriplets_HackerRank {

    public static final int SIZE=3;

    public static void main(String[] args){

        Scanner in=new Scanner(System.in);

        int[] alist=new int[SIZE];
        int[] blist=new int[SIZE];

        for (int i=0; i<SIZE;i++){
            alist[i]=in.nextInt();
        }

        for (int i=0;i<SIZE; i++){

            blist[i]=in.nextInt();
        }

        int aScore=0;

        int bScore=0;

        for (int i=0; i<SIZE; i++){

            if (alist[i]>blist[i]){

                aScore++;
            }

            else if (blist[i]>alist[i]){

                bScore++;
            }
        }

        System.out.println( aScore +" " +bScore);
    }
}
