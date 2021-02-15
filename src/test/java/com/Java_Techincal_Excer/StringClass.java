package com.Java_Techincal_Excer;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class StringClass {
    public static void main(String[] args){

        //There are several constructors available in String class to get String from char array,
        // byte array, StringBuffer and StringBuilder.


        String str  =  new String("abc");


        char[] a = {'a', 'b', 'c'};
        String str2  =  new String(a);

        System.out.println(str2);

        System.out.println(str);

        String s1="I love Canada";
        String s2="I love Justice";
        String s3="I love you";
        String s4="I love Canada";

        /*String class implements Comparable interface, which provides compareTo() and
        compareToIgnoreCase() methods and it compares two strings lexicographically.

        Both strings are converted into Unicode value for comparison and return an integer
        value which can be greater than, less than or equal to zero. If strings are equal then it returns zero or else it returns either greater or less than zero.
         */


        System.out.println(s1.equalsIgnoreCase(s4));

        String string1="ABSC";

        String string2="BBDFR";
        String string3="hhhnv";
        String string4="ABSC";
        String string5="HHHNV";
        System.out.println(string1.compareTo(string2));
        System.out.println(string1.compareTo(string4));
        System.out.println(string3.compareToIgnoreCase(string5));

        /*split()
Java String split() method is used to split the string using given expression.
 There are two variants of split() method.

split(String regex):
This method splits the string using given regex expression and returns array of string.
split(String regex, int limit): This method splits the string using given
 regex expression and return array of string but the element of array is limited by the specified limit.
  If the specified limit is 2 then the method return an array of size 2.


         */

       String[] s7=s3.split("");

        for (String s8:s7){
            System.out.println(s8);
        }

        String s = "a/b/c/d";
        String[] a1 = s.split("/",2);
        System.out.println("split string using only regex:");
        for (String string : a1) {
            System.out.println(string);
        }

        String guzel=" hi/ man how are you";

        String[] askim=guzel.split("/",2);

        for(String yaqut:askim ){
            System.out.println(yaqut);
        }
        /*
        contains(CharSequence s)
Java String contains() methods checks if string contains specified sequence of character or not.
This method returns true if string contains specified sequence of character, else returns false.
         */

String string10="Hello world in pandemic";

System.out.println(string10.contains("Hello"));
        /*
        length()
Java String length() method returns the length of string.

         */
        System.out.println(string10.length());
        /*
        replace()
Java String replace() method is used to replace a specific part of string with other string.
There are four variants of replace() method.

replace(char oldChar, char newChar): This method replace all the occurrence of oldChar with newChar in string.
replace(CharSequence target, CharSequence replacement): This method replace each target literals with replacement literals in string.
replaceAll(String regex, String replacement): This method replace all the occurrence of substring matches with specified regex with specified replacement in string.
replaceFirst(String regex, String replacement): This method replace first occurrence of substring that matches with specified regex with specified replacement in string.

         */

        System.out.println(string10.replace('H','h'));

        String string11="Hello world, Hello my loved ones";


        System.out.println(String.format("string11, %s", string11));

        System.out.println(string11.replaceAll("H","M"));
System.out.println(string11.replaceFirst("Hello","Nello"));
/*
format()
Java String format() method is used to format the string.
There is two variants of java String format() method.
 */

        System.out.println(String.format("string11, %S", string11));
        /*
There is difference between %S, %s
         */
        System.out.println(String.format("string11, %s", string11));

        System.out.println(String.format(Locale.US, "%f", 3.14));
/*
substring
 */
        String string12 = " This is journaldev.com";
        string12 = string12.substring(8,18);
        System.out.println(string12);
        /*
        String Concatenation
String concatenation is very basic operation in java.
String can be concatenated by using “+” operator or by using concat() method.
         */
        System.out.println(string11+string12);

        System.out.println(string11.concat(string12));
        /*
        Java String Pool
Memory management is the most important aspect of any programming language.
 Memory management in case of string in Java is a little bit different than any other class.
 To make Java more memory efficient, JVM introduced a special memory area for the string called String Constant Pool.

When we create a string literal it checks if there is identical string already exist in string pool or not.
 If it is there then it will return the reference of the existing string of string pool.
         */
        //same reference
        if (string11==string12) {
            System.out.println("Both string refer to the same object");
        }
        else{
            System.out.println("Both string  not refer to the same object");}

        //different reference
        if (string1==string3) {
            System.out.println("Both strings refer to the same object");
        }else {
            System.out.println("Both strings refer to the different object");}

        /*
        Java 8 String join()
A new static method join() has been added in String class in Java 8.
This method returns a new String composed of copies of the CharSequence elements joined together with a
copy of the specified delimiter.
 Let’s look at an example to understand it easily.
         */
        List<String> words = Arrays.asList(new String[]{"Hello", "World", "2019"});
        String msg = String.join(" ", words);
        System.out.println(msg);


        String string6=s1.toUpperCase();
        System.out.println(string6);
        String string7=s1.toLowerCase();
        System.out.println(string7);

        /*
        reverse string
         */
        String string15="I am heading to home";

        StringBuilder strbuilder=new StringBuilder(string15);

        System.out.println(strbuilder.reverse());
        /*
        another way to getting reverse string
         */
        char[] arr=string15.toCharArray();

        System.out.println(arr.length);

        String reverseString=null;

        for (int i=arr.length-1;i<=0;i++){
             reverseString=reverseString+arr[i];

             System.out.println(reverseString);

        }
    }
}
