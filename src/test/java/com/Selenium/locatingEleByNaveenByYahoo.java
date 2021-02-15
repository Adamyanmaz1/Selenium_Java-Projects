package com.Selenium;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class locatingEleByNaveenByYahoo {

    public static void main(String[] args){



        //Path for the chromedriver

        System.setProperty("webdriver.chrome.driver","/Users/memetiminabliz/webdriver/chromedriver");

        //intialization

        WebDriver driver=new ChromeDriver();

        //wait

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("https://login.yahoo.com/?.intl=ca&.lang=en-CA&src=fpctx&activity=uh-signin&pspid=2142623533&done=https%3A%2F%2Fca.yahoo.com%2F&add=1");

        WebElement element=driver.findElement(By.id("login-username"));

        element.sendKeys("emin.yarkant");

        WebElement element1=driver.findElement(By.cssSelector("input[class^='pure']"));

        element1.click();

        //pure-button puree-button-primary puree-spinner-button challenge-button

        WebElement element2=driver.findElement(By.cssSelector("input[id^='login']"));

        element2.sendKeys("ilopm571_#2020");

        WebElement element3=driver.findElement(By.cssSelector("button[class^='pure']"));

        element3.click();

        //

        driver.get("https://www.amazon.ca/");

        driver.findElement(By.xpath("//div[@class='nav-line-1-container']/child::span[contains(text(),'Hello')]")).click();

        driver.findElement(By.xpath("//div[@class='a-row a-spacing-base']/child::input[1]")).sendKeys("elemin991@gmail.com");

        driver.findElement(By.xpath("//div[@class='a-section']//child::input[@class='a-button-input']")).click();

        driver.findElement(By.xpath("//div[@class='a-section a-spacing-large']/child::input")).sendKeys("ilopm571");

        driver.findElement(By.cssSelector("#signInSubmit")).click();

        WebElement element4=driver.findElement(By.xpath("//h2[text()='Hi, muhammedemin']"));

        Assert.assertEquals("Hi, muhammedemin",element4.getText());


        /////////////////////////////////////////////////////

        Set<String> windowHandles1=driver.getWindowHandles();

        System.out.println(windowHandles1.size());

        Iterator<String> handler1=windowHandles1.iterator();

        String ParentWindow=handler1.next();

        driver.switchTo().window(ParentWindow);

        System.out.println("ParentWindwow:   "+driver.getTitle());

        String childWondow=handler1.next();

        driver.switchTo().window(childWondow);

        System.out.println("childWindwow:   "+driver.getTitle());

        driver.switchTo().window(ParentWindow);

        System.out.println(driver.getTitle());

//driver.close();
    }
}
