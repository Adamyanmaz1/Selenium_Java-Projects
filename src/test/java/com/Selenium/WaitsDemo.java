package com.Selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class WaitsDemo {

    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver","/Users/memetiminabliz/webdriver/chromedriver");

        WebDriver driver=new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

// explicit wait - to wait for the compose button to be click-able
        WebDriverWait wait = new WebDriverWait(driver,30);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));

//        Wait wait = new FluentWait<WebDriver>(driver)
//                .withTimeout(50, TimeUnit.SECONDS)
//                .pollingevery(3, TimeUnit.SECONDS)
//                .ignoring(NoSuchElementException.class);

//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'COMPOSE')]")));

    }
}
