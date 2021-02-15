package com.TestNGDemo;


import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertDemo {

    SoftAssert softassert=new SoftAssert();

    @Test

    void Softassertdemo1(){

        System.out.println("This is soft assert");

        String str="I am going to school";

        String str1="I am going to school";


       softassert.assertEquals(str,str1);


        System.out.println(" Hay balilar oynaymiz ma?");
        softassert.assertAll();

    }

    @Test
    public void interviewPlan(){

      boolean  Akilliq=true;


        softassert.assertTrue(Akilliq);

        System.out.println("Hayat sadece bu dunya hatayi degildir dostum, namazni unutma");
softassert.assertAll();
    }

}
