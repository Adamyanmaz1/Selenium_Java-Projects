package com.Java_Techincal_Excer.JavaTechnicalPract1;

public class AccessModifier {

    final int x = 10;
    final double PI = 3.14;

    public static void main(String[] args) {
        AccessModifier myObj = new AccessModifier();
      //  myObj.x = 50; // will generate an error
      //  myObj.PI = 25; // will generate an error
        System.out.println(myObj.x);
    }
}
