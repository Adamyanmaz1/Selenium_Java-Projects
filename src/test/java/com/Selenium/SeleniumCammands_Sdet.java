package com.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumCammands_Sdet {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","/Users/memetiminabliz/webdriver/chromedriver");

        WebDriver driver=new ChromeDriver();

        driver.get("https://www.facebook.com/");

        driver.navigate().to("https://dzone.com/articles/java-string-format-examples");

        driver.navigate().back();

        driver.navigate().forward();

       // driver.navigate().refresh();
    }
}
