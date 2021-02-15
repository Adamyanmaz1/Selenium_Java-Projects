package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Iframe_Selenium {


    public static void main(String[] args) {

        System.setProperty("webdriver.driver.chromedriver","/Users/memetiminabliz/webdriver/chromedriver");

        WebDriver driver=new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


        driver.get("http://demo.guru99.com/test/guru99home/");

//    WebElement element= driver.findElement(By.xpath("//a[text()='SAP MM']"));
//
//    driver.switchTo().frame(element);

        int size = driver.findElements(By.tagName("iframe")).size();

        System.out.println(size);

        for (int i=0; i<size;i++){

            driver.switchTo().frame(i);

        }


    }

}
