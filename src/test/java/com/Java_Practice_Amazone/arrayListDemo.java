package com.Java_Practice_Amazone;


import java.util.ArrayList;

public class arrayListDemo {

    public static void main(String[] args){


        ArrayList<Integer> arraylist=new ArrayList<Integer>();

        arraylist.add(30);

        arraylist.add(40);

        arraylist.add(80);

        arraylist.add(90);

        arraylist.add(100);

//        for(int i=0; i<arraylist.size(); i++){
//
//            System.out.println(arraylist.get(i));
//        }

        for (Integer i: arraylist){

            System.out.println(i);
        }

    }
}
