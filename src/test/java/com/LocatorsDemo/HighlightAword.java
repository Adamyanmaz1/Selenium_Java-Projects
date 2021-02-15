package com.LocatorsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HighlightAword {

    public static void main(String[] args){

        // path of the chromedriver

        System.setProperty("webdriver.chrome.driver","/Users/memetiminabliz/webdriver/chromedriver");

        //inialize the chromedriver

        WebDriver driver=new ChromeDriver();

        //Navigate the website

        driver.get("https://www.cbc.ca/news/world/coronavirus-covid19-world-aug-16-1.5688390");

//Exact Match of the word
               // WebElement matchedElement=driver.findElement(By.xpath("//*[text()='Coronavirus: What's happening around the world on Aug. 16']"));

        if(driver.getPageSource().contains("Coronavirus")){
            System.out.println("The page contains word Coronavirus");
        }

        else{

            System.out.println("The page doesn't contains word Coronavirus");

        }






/*
        WebElement matchedElement=driver.findElement(By.xpath("//*[contains(text(), 'Coronavirus: ')]"));




        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", matchedElement);

 */

        driver.quit();
    }
}
