package com.TestNGDemo.LisnersDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCases {

    // Test to pass as to verify listeners .
    @Test
    public void Login()
    {

        System.setProperty("webdriver.chrome.driver","/Users/memetiminabliz/webdriver/chromedriver");

      WebDriver   driver2=new ChromeDriver();

        driver2.get("http://demo.guru99.com/V4/");
        driver2.findElement(By.name("uid")).sendKeys("mngr34926");
        driver2.findElement(By.name("password")).sendKeys("amUpenu");
        driver2.findElement(By.name("btnLogin")).click();
    }

    // Forcefully failed this test as to verify listener.
    @Test
    public void TestToFail()
    {
        System.out.println("This method to test fail");
        Assert.assertTrue(false);
    }
}
