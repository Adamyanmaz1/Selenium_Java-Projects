package com.Hackerrank.ConversionDemo;

public class ConversionDemo1 {

    public static void main(String[] args)
    {

        // converting from integer conversion
        int a = 1234;
        int b = -1234;
     String str1 = String.valueOf(a);
       String str2 = Integer.toString(b);
        System.out.println("String str1 = " + str1 );
        System.out.println("String str2 = " + str2);

        // from String to integer conversion

        String str10="123";
        int inum = 100;

        /* converting the string to an int value
         * ,the value of inum2 would be 123 after
         * conversion
         */
        int inum2 = Integer.parseInt(str10);

        int sum = inum+inum2;
        System.out.println("Result is: "+sum);

        // converting from String to double
        String str = "122.202";

        /* Convert String to double using
         * parseDouble(String) method of Double
         * wrapper class
         */
        double dnum = Double.parseDouble(str);

        //displaying the value of variable dnum
        System.out.println(dnum);

String string1="hello";
String string2="dostlar";

int numsum=string1.length()+string2.length();

System.out.println("gel gor ki: "+numsum);

        String str1111="i am coming to home";

        System.out.println(string1.length());

        System.out.println(str1111.substring(0,1).toUpperCase()+str1111.substring(1));
    }
}
