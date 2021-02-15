package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class RadioButtonDemo {

    public static void main(String[] args){

        //path
        System.setProperty("webdriver.driver.chromedriver","/Users/memetiminabliz/webdriver/chromedriver");

        //inialization

        WebDriver driver=new ChromeDriver();

        // waits

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        //

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
/*
        WebElement selected=driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));

      //boolean selected=  driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected();

      if(!selected.isSelected()){

          selected.click();
      }

 */

      /////

       List <WebElement> webElements=driver.findElements(By.xpath("//*[@type='checkbox']"));


      int count=webElements.size();

        System.out.println(count);
        System.out.println(webElements.get(1).getAttribute("value"));

        for (WebElement webElement : webElements) {

            webElement.getAttribute("value");

            if (webElement.getAttribute("value").equalsIgnoreCase("Option2")) {

                webElement.click();

                System.out.println(" Option2 in the checkbox is clicked");
            }
        }

    }
}
