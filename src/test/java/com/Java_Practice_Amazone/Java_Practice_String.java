package com.Java_Practice_Amazone;

public class Java_Practice_String {

    public static void main(String[] args){

        String str1=" I am going to school";

        System.out.println(str1);

//        StringBuilder builder=new StringBuilder(str1);
//
//       String string2=builder.reverse().toString();
//
//        System.out.println(string2);

       // System.out.println(builder);

        String reverseStr1="";

        for(int i=str1.length()-1; i>=0; i--){

            reverseStr1=reverseStr1+str1.charAt(i);
        }

        System.out.println(reverseStr1);

        //is Palindrome or not

        if(str1.equalsIgnoreCase(reverseStr1)){

            System.out.println("This is palindrome");
        }

        else{

            System.out.println(" This is not palindrome ");
        }

//String array
String[] strArray={"hello", "Aqilliq"," guzel", "Mahtanchaq", "Razillik"};

System.out.println(strArray.length);

for (int i=0; i<strArray.length; i++){

    System.out.println(strArray[i]);

}

    }
}
