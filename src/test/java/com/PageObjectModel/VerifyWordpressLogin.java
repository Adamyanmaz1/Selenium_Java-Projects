package com.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VerifyWordpressLogin {

    @Test
    public void verifyValidLogin()
    {


        WebDriver driver1=new ChromeDriver();

        //driver.manage().window().maximize();

        driver1.get("http://demosite.center/wordpress/wp-login.php");

        LoginPage login=new LoginPage(driver1);



        login.clickOnLoginButton();


        driver1.quit();

    }
}
