package com.HomeDepot_Project;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

import java.util.concurrent.TimeUnit;

/*
  Dont use main method
     use TestNG
        Use Annotation- @BeforClass- Setup Browser @AfterClass- CloseBrowser
        Use Assertion-
        Product- Checkout- Capture url
        Write xpath
        WebDriver Manager API- Automatically drivers for you.
        Once it is done- push to github

        Second part- Maven
            Framework
                Page Object Model
                Reports- SCreenshots
                Utility
                Create BaseClass
                    Open Browser
                    Close Browser
                  create testng.xml
                  pom.xml - add surefire plugin
                  mvn clean test
 */

public class Test1 {

    //initialization of driver
    static WebDriver driver;

    @BeforeClass
    public void SetUp() {
        //chromedriver setup
        WebDriverManager.chromedriver().setup();
        //initialization of driver
        driver = new ChromeDriver();
        // maximizing the screen
        driver.manage().window().maximize();
    }

    @Test()
    public void SummaryPage() throws InterruptedException {
        driver.get("http://automationpractice.com");
        // setting waitting time
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        new Actions(driver)
                .moveToElement(driver.findElement(By.xpath("//a[text()='Women']")))
                .pause(Duration.ofSeconds(3))
                .moveToElement(driver.findElement(By.xpath("//a[text()='Summer Dresses']")))
                .click()
                .build()
                .perform();
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].click();", driver.findElement(By.xpath("//div/a[contains(@href,'id_product=5')]/span[text()='Quick view']")));
        Select select1 = new Select(driver.findElement(By.name("group_1")));
        select1.selectByValue("1");
        driver.findElement(By.xpath("//span[text()='Add to cart']")).click();
        driver.findElement(By.xpath("//div[@id='layer_cart']/div/div[2]/div[4]/span/span")).click();
        new Actions(( driver )).moveToElement(driver.findElement(By.xpath("//b[text()='Cart']")))
                .pause(Duration.ofSeconds(3))
                .moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Check out')]")))
                .pause(Duration.ofSeconds(5))
                .click()
                .build()
                .perform();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//div/a/span[contains(text(),'Proceed to checkout')]")).click();

        Thread.sleep(5000);
    }
    @Test(priority = 1)
    public void createAccount() throws InterruptedException {

        driver.findElement(By.id("email_create")).sendKeys("emin.softwaretester@gmail.com");
        driver.findElement(By.cssSelector("button#SubmitCreate")).click();
        //Fill in mandatory fields and click 'Register' button
        driver.findElement(By.xpath("//div/span/input[@id='id_gender1'][@name='id_gender']")).click();
        driver.findElement(By.cssSelector("#customer_firstname")).sendKeys("amin");

        driver.findElement(By.cssSelector("#customer_lastname")).sendKeys("yarkant");
        driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("A11556171v");
        driver.findElement(By.cssSelector("input#address1")).sendKeys("N Kenmore Ave");
        driver.findElement(By.cssSelector("#city")).sendKeys("Los Angeles");
        //
        WebElement elem1 = driver.findElement(By.cssSelector("#id_state"));

        Select select2 = new Select(elem1);

        select2.selectByVisibleText("California");

        driver.findElement(By.cssSelector("#postcode")).sendKeys("90004");

        WebElement elem2 = driver.findElement(By.cssSelector("#id_country"));

        Select select3 = new Select(elem2);

        select3.selectByVisibleText("United States");

        driver.findElement(By.xpath("//input[@id='phone_mobile']")).sendKeys("+13236174856");

        driver.findElement(By.xpath("//input[@id='alias']")).sendKeys("1deauville lane");

        driver.findElement(By.cssSelector("#submitAccount")).click();
    }
    @Test(priority = 2)
    public void Address() throws InterruptedException {

        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[text()='Proceed to checkout']")).click();
    }
    @Test(priority = 3)
    public void Shipping() {

        driver.findElement(By.xpath("//input[@id='cgv'][@name='cgv']")).click();

        driver.findElement(By.xpath("//button/span[contains(text(),'Proceed to checkout')]")).click();
    }
    @Test(priority=4)
    public void Payment() {

        driver.findElement(By.xpath("//p/a[contains(text(),'Pay by bank wire')]")).click();

        driver.findElement(By.xpath("//button/span[text()='I confirm my order']")).click();
    }
    @AfterClass
    public void tearDown() {

        driver.close();
    }

}
