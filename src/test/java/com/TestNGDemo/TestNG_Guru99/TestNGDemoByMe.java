package com.TestNGDemo.TestNG_Guru99;

import org.testng.annotations.*;

public class TestNGDemoByMe {


    @BeforeMethod
    public void Smart(){

        System.out.println(" This method is a BeforeMethod!!!--------4, 7");

        }

        @BeforeTest

    public void Mykids(){

            System.out.println("This is a BeforeTest method----------2");
        }

        @BeforeClass
    public void Appreciation(){

            System.out.println("This is a BeforeClass method---------3");
        }

        @Test(priority=1)

    public void Thanks(){

            System.out.println(" This is TestMethod--------8");
        }

        @Test

    public void Elhamdulliah(){

            System.out.println(" this is TestMethod--------5");
        }


        @AfterMethod
    public void GuzelGunler(){

        System.out.println("This is  AfterMethod---6,9");
        }

        @AfterClass
    public void Rahmet(){

            System.out.println("This is AfterClass karang-----10");
        }

        @AfterTest

    public void Rahman(){
            System.out.println(" This is AfterTest method-------11");
        }

        @AfterSuite

    public void Uyghurlar(){

            System.out.println("This is AfterSuite method---------THE LAST-----12");
        }

        @BeforeSuite

    public void Umutwar(){

            System.out.println(" This is BeforeSuite method-------1");
        }

    }

