package com.Java_Techincal_Excer;

import java.util.ArrayList;

public class CountRepeateInarray {

    public static void main(String[] args) {
        //Auto- generated method

        int[] a = {4, 4, 4, 4, 5, 6, 6, 67, 7, 8, 8, 9, 44, 8, 5, 67};

        //print unique number from the list --Amazon

        ArrayList<Integer> ab = new ArrayList<Integer>();


        for (int i = 0; i < a.length; i++){

            int k = 0;



        if (!ab.contains(a[i])) {

            ab.add(a[i]);

            k++;

            for (int j = i + 1; j < a.length; j++) {

                if (a[i] == a[j]) {

                    k++;

                }
            }

                      System.out.println(a[i]);



            System.out.println("****************");


            System.out.println(k);

        }

    }

    }

}
