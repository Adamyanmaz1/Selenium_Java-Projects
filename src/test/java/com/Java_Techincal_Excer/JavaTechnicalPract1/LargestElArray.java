package com.Java_Techincal_Excer.JavaTechnicalPract1;

public class LargestElArray {

    public static void main(String[] args){

        int[] intArray ={2,56,77,8,99,700,5090,6699};


        int temp;


        for (int i = 0; i<= intArray.length-1; i++){

            for (int j = i+1; j<= intArray.length-1; j++){

                if (intArray[i]> intArray[j]){



                    temp= intArray[i];

                    intArray[i]= intArray[j];
                    intArray[j]=temp;
                }
            }
        }


       System.out.println("The largest number in this array::"+intArray[intArray.length-1]);

        System.out.println("The second largest number in this array::"+intArray[intArray.length-2]);

        System.out.println("The smallest number in this array::"+intArray[0]);



        System.out.println("Print all the elements in this integer array:  ");


        for (int a: intArray){


            System.out.println(a);
        }

    }


}
