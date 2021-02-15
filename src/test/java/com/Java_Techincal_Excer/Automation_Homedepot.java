package com.Java_Techincal_Excer;

import org.omg.CORBA.TIMEOUT;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Automation_Homedepot {

    public static void main(String[] args){

        //Setting the path of chromedriver

        System.setProperty("webdriver.driver.chromedriver", "/Users/memetiminabliz/webdriver/chromedriver");

        WebDriver driver=new ChromeDriver();

        // Setting the waiting methods

        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);


        // Navigate to URL
       // driver.get("https://www.homedepot.ca/en/home.html");

        driver.navigate().to("https://www.homedepot.ca/en/home.html");

driver.findElement(By.xpath("//button[@class='hdca-gheader-localization__close-button hdca-button hdca-button--icon hdca-button--icon-small hdca-popover__close']")).click();
      /*
        // Switching to Alert
        Alert alert = driver.switchTo().alert();

        alert.accept();

        // Capturing alert message.
        String alertMessage= driver.switchTo().alert().getText();




       */

        //Locatting the elements

       // driver.findElement(By.id("close")).click();
       driver.findElement(By.xpath("//span[@class='hdca-gheader-nav__item-button-label'][contains(text(),'Shop by Room')]")).click();




    }
}
