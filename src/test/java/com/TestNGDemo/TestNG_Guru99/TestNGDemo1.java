package com.TestNGDemo.TestNG_Guru99;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestNGDemo1 {

    @Test(groups="Run")

    public static void Run(){

        System.out.println(" I am running");
    }

    @BeforeClass

    public static void ReadyForTest(){

        System.out.println(" This is before class method");
    }

    @Test(groups="Life")

    public static void TestTheWebsite(){

        System.out.println(" I am Testing");
    }
    @Test
    public static void MobileTesting(){

        System.out.println("  I am testing mobile");
    }


    @Test(dependsOnMethods = "TestTheWebsite")
    public static void Resting (){

        System.out.println(" I am having rest");
    }
}
