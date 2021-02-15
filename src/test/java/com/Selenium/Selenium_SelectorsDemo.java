package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class Selenium_SelectorsDemo {

    public static void main(String[] args) throws MalformedURLException {

        //path for chromedriver

        System.setProperty("webdriver.chrome.driver", "/Users/memetiminabliz/webdriver/chromedriver");

        //inialization of chromedriver

        WebDriver driver = new ChromeDriver();

        //wait time

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        //dropdownBox

        WebElement webelement = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));

        Select select = new Select(webelement);

        int size = select.getOptions().size();

        System.out.println(select.getOptions().get(1).getText());

        select.selectByVisibleText("Option1");

        for (int i = 0; i < size; i++) {

            //System.out.println(select.getOptions().get(i).getText());


            if (select.getOptions().get(i).getText().equalsIgnoreCase("Option2")) {

                select.getOptions().get(i).click();

                System.out.println("Option2 is cliked successfully");


             //   select.selectByVisibleText("Option3");


            }

        }

        boolean text=driver.getPageSource().contains("Suggession Class Example");


        if (text){

            System.out.println(" this page contanins Suggession Class Example ");


        }

        else {

            System.out.println(" this page  does not contain contanins Suggession Class Example ");

        }


        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].style.border='5px solid red'", webelement);

// js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", text);


    }
}
