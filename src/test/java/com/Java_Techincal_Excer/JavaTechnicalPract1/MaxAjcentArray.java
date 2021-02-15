package com.Java_Techincal_Excer.JavaTechnicalPract1;


public class MaxAjcentArray {

    public static void main(String[] args){

        int[] arratnum={-100000,2,4,5,8,9000000,300,600,589,500};



        int maxNum=maxDiff(arratnum);


System.out.println(maxNum);

//int[] intarr={};

      //  System.out.println(Arrays.toString(intarr));

    }

    private  static int maxDiff(int[] numbers) {
        if (numbers.length < 2) {
            return 0;

        }

        if (numbers.length == 2) {
            return Math.abs(numbers[1] - numbers[0]);
        }

        int max = Math.abs(numbers[1] - numbers[0]);



        for (int i = 2; i < numbers.length; i++) {
                int diff = Math.abs(numbers[i] - numbers[i-1]);
                if (diff > max) {
                    max = diff;
                }
        }
        return max;
    }

}
