package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SleniumSelectorsPre {

    public static void main(String[] args){


        //path
        System.setProperty("webdriver.chrome.driver","/Users/memetiminabliz/webdriver/chromedriver");

        //initialization

        WebDriver driver=new ChromeDriver();

        //url

        driver.get("http://demo.guru99.com/test/login.html");

        driver.findElement(By.cssSelector("input[id='email']"));

        WebElement element=driver.findElement(By.cssSelector("input[id='email']"));

        System.out.println(element.getText());

        driver.findElement(By.xpath("//input[@name='passwd']"));

        driver.findElement(By.xpath("//button[@name='SubmitLogin']")).click();


        WebElement element1=driver.findElement(By.xpath("//h3[contains(text(),'Successfully Logged in...')]"));

        Assert.assertEquals(element1.getText(),"Successfully Logged in...");








    }
}
