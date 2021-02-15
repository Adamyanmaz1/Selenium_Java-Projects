package com.Java_Techincal_Excer.JavaTechnicalPract2;

public class ReverseString2 {

    public static void main(String[] args){


    String str2=" Guzel kunler aldimizda inshallah";

        System.out.println(str2);


       // StringBuilder builder=new StringBuilder();

        String revers="";

    for(int k=str2.length()-1; k>=0; k--){

//        System.out.println(str2.charAt(k));

       // builder.append(str2.charAt(k));

revers=revers+str2.charAt(k);
    }

       // System.out.println(builder);

        System.out.println(revers);


    if (str2.equalsIgnoreCase(revers)){

        System.out.println(" str2 is palindrome");
    }

    else {

        System.out.println(" str2 is not palindrome");
    }

    }
}
