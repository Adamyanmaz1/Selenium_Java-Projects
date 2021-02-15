package com.Java_Techincal_Excer.JavaTechnicalPract1;

public class ReverStrPalindrome {

    public static void main(String[] args) {

        String str1 = "MOM is Mom";


        System.out.println(str1);


        String reveStr = "";

//StringBuilder stringBuilder1=new StringBuilder();

        for (int i = str1.length() - 1; i >= 0; i--) {
            reveStr = reveStr + str1.charAt(i);

            //stringBuilder1.append(str1.charAt(i));

        }

        System.out.println(reveStr);
        //  System.out.println(stringBuilder1);


        if (str1.equalsIgnoreCase(reveStr)) {

            System.out.println("The str1 is palindrome");
        } else {

            System.out.println("The str1 is not palindrome");
        }


    }
    }