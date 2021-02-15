package com.LocatorsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class MakeFlightReserve {

    public static void main(String[] args){

       // path of webdriver

        System.setProperty("webdriver.chrome.driver","/users/memetiminabliz/webdriver/chromedriver");

        // initialize of webdriver

        WebDriver driver=new ChromeDriver();

        // implicit waits

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        //Navigate the URL

        driver.get("https://www.cheapflights.ca/");


driver.findElement(By.xpath("//div[@class='col js-label _ibU _ibV _iiN _idj']")).click();


List<WebElement> elementList=driver.findElements(By.xpath("//button[@type='button']//span[@class='icon plus _h-2 _jVz _jVD _h-- _ia1 _iaA _ig2 _iay _iaz']"));

int count=elementList.size();

        elementList.get(1).click();

        System.out.println(count);
//
//for (int i=0; i<count; i++){
//
//    elementList.get(1).click();
//}


//driver.findElement(By.xpath("[@type='button']//span[@class='icon plus _h-2 _jVz _jVD _h-- _ia1 _iaA _ig2 _iay _iaz']")).click();

driver.findElement(By.cssSelector(".js-selection-display _id7 _ii0 _iir _iQe _kaM _ic2 _ic3")).clear();

driver.findElement(By.cssSelector("#c1U1C-origin-airport[type='text']")).sendKeys("Toronto");

WebElement element=driver.findElement(By.xpath("//div[text()='Pearson Intl']"));

Actions action=new Actions(driver);

action.moveToElement(element).click().perform();





    }
}
