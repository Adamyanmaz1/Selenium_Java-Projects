package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class SeleniumWaitsPractice {

    public static void main(String[] args){

        //Setting the path
        System.setProperty("webdriver.chrome.driver","/Users/memetiminabliz/webdriver/chromedriver");
        //initialization of driver
        WebDriver driver=new ChromeDriver();
        //Setting of waits
        //implicitly wait
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //explicitly wait

        WebDriverWait wait= new WebDriverWait(driver,20);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));

        //fleunt wait

        Wait<WebDriverWait> wait1=new FluentWait<>((WebDriverWait) driver)
                .withTimeout(30,TimeUnit.SECONDS).
                        pollingEvery(5,TimeUnit.SECONDS).
                        ignoring(NoSuchElementException.class);




    }
}
