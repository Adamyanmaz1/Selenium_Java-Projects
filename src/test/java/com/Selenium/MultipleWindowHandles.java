
package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class MultipleWindowHandles {



    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

         driver.findElement(By.xpath("//button[@id='openwindow']")).click();

        Set<String> windowsIDs=driver.getWindowHandles();

        System.out.println(windowsIDs.size());

     Iterator<String> handler=windowsIDs.iterator();

     String ParentWindow=handler.next();

        driver.switchTo().window(ParentWindow);

        System.out.println("ParentWindwow:   "+driver.getTitle());

        String childWondow=handler.next();

        driver.switchTo().window(childWondow);

        System.out.println("childWindwow:   "+driver.getTitle());

        driver.switchTo().window(ParentWindow);

        System.out.println(driver.getTitle());

    }
}
