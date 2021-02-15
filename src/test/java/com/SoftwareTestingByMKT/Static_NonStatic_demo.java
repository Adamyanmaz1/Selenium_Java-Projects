package com.SoftwareTestingByMKT;

public class Static_NonStatic_demo {

    int a=100;

    final static int num=120;

    public static void main(String[] args){

        Static_NonStatic_demo obj1=new Static_NonStatic_demo();

        System.out.println(obj1.a);

System.out.println(num);
        System.out.println("*********");

        obj1.water();
        System.out.println("*********");


        obj1.water();

    }

    public void water(){
final int hisap;
   hisap=450;
        int amat=200;

        System.out.println(a);

        System.out.println(amat);


System.out.println(hisap);
    }
}
