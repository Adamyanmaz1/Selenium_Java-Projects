package com.collectiondemo;

import java.util.ArrayList;

public class ArrayListdemo {

    public static void main(String[] args){

        ArrayList<String> stringArray=new ArrayList<String>();

        System.out.println("ArraySize:  "+stringArray.size());

        stringArray.add("Tursun");
        stringArray.add("Gulum");

        System.out.println(" All values of stringArray:  "+stringArray.size());


        for (String str:stringArray){
            System.out.print(str);
        }
    }
}
