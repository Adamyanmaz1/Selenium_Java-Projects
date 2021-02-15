package com.Java_Techincal_Excer;

import java.util.ArrayList;

public class CompareArray_Rahul {

public static void main(String[] args){


    int[] a={1,4,5,7,300,12};

    int[] b={6,4,3,7,10,300};


    ArrayList<Integer> al=new ArrayList<>();

    for (int i=0; i<a.length; i++)

    {
        if (a[i]==b[i])
        {
            //code to create another array
            al.add(a[i]);

        }
    }

    Object[] c=al.toArray();

    for(Object obj: c)
    {
      System.out.println(obj);
    }


}

}
