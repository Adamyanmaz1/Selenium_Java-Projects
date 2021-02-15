package com.Java_Techincal_Excer;

public class StringImmutable_Rahul {

    public static void main(String[] args){

        String a="Hello";

        String b="Hello";

         a.concat("World");

        System.out.println(a);
        String c=a.concat("World");

        System.out.println(c);

        String s= new String("Hello");

        String s1= new String("Hello");

        // compare

        System.out.println(a.equals(b));  //true

        System.out.println(a==b);  // true

        System.out.println(a.equals(s));

        System.out.println(a==s); //fail  Matching reference is not the same

        System.out.println(s==s1);  //fail ---References are different
    }
}
