package com.SoftwareTestingByMKT;

public class StaticNonStatic_Demo {
    static int a1=10;
    double b=0.01;

    void dumb(){

        System.out.println("you are smart");

        System.out.println(b+b);

        System.out.println(a1+a1+a1+a1);

        smart();
    }

    static void smart(){

        System.out.println("You are super hero");
  System.out.println(a1+a1+5);

    }

    public static void main(String[] args){

        System.out.println("We love software testing");
        smart();

        StaticNonStatic_Demo m1=new StaticNonStatic_Demo();
System.out.println("******");
        m1.dumb();
        System.out.println("******");
        System.out.println(a1);

        m1.b=80;
        System.out.println(m1.b);
    }
}
