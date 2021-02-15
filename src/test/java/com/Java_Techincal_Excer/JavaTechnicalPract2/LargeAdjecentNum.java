package com.Java_Techincal_Excer.JavaTechnicalPract2;

public class LargeAdjecentNum {

    public static void main(String[] args){

        int[] arrg={300,55,77,600,900};

        int diff=0;

        System.out.println(arrg.length);

        for (int i=0; i<arrg.length-1; i++){

            if (arrg[i+1]-arrg[i]>diff){

                diff=arrg[i+1]-arrg[i];
            }
        }

        System.out.println(diff);
    }
}
