package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class Iframedemo {

    public static void main(String[] args){

        // path

        System.setProperty("webdriver.driver.chromedriver","/Users/memetiminabliz/webdriver/chromedriver");
        ///Users/memetiminabliz/JavaCoding2/chromedriver

        //inialization

        WebDriver driver=new ChromeDriver();

        //waits

       // driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("https://jqueryui.com/droppable/");

       // driver.navigate().to("");

        System.out.println(driver.findElement(By.tagName("iframe")).getSize());

        WebElement element=driver.findElement(By.cssSelector("iframe.demo-frame"));

//        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));

        driver.switchTo().frame(element);

       // driver.findElement(By.cssSelector("div#droppable")).click();

        WebElement source=driver.findElement(By.cssSelector("div#draggable"));

        WebElement target=driver.findElement(By.cssSelector("div#droppable"));



        Actions a =new Actions(driver);

        a.dragAndDrop(source,target).build().perform();

        System.out.println(driver.getTitle());

        ////

        driver.switchTo().defaultContent();

        System.out.println(driver.getTitle());

    }
}
