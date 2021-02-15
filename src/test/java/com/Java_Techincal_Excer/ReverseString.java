package com.Java_Techincal_Excer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseString {

    public static void main(String[] args){

        String ar1="I love my beautiful hometown";

        System.out.println(ar1);


        List<Character> arrylsit=new ArrayList<>();

        for (char c1: ar1.toCharArray()){

            arrylsit.add(c1);
        }

        Collections.reverse(arrylsit);

        Object[] obj1=arrylsit.toArray();

        System.out.println(obj1.length);

        StringBuilder strbuild=new StringBuilder();

        for (Object o: obj1){

            strbuild.append(o);

        }

        System.out.println(strbuild);


    }
}
