package com.Java_Techincal_Excer;

public class ArrayOfObjects {

    public static void main(String[] args){

        /*
        The array of objects, as defined by its name, stores an array of objects.
         An object represents a single record in memory, and thus for multiple records,
         an array of objects must be created. It must be noted, that the arrays can hold only references to
         the objects, and not the objects themselves.

        Let us see how can we declare Array of objects in Java.
         */

        Object[] JavaObjectArray = {"Women Empowerment", new Integer(5)};
        System.out.println( JavaObjectArray[0] );
        System.out.println( JavaObjectArray[1] );
    }
}
