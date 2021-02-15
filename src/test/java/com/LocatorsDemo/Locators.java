package com.LocatorsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class Locators {

    public static void main(String[] args){

        // inialization of driver

        System.setProperty("webdriver.chrome.driver","/Users/memetiminabliz/webdriver/chromedriver");

        WebDriver driver=new ChromeDriver();

//        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


/*
        driver.get("https://demoqa.com/");

       driver.findElement(By.xpath("//a/img[@src='/images/Toolsqa.jpg']")).click();


   // driver.findElement(By.xpath("//div//div//h5[text()='Elements']")).click();

driver.findElement(By.xpath("//*[contains(text(),'Elements')]")).click();


 */
  driver.get("http://webdunia.com");
        driver.close();
        driver.quit();
    }
}
