package com.cydeo.test.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SmartBearUtils {


    public static void loginToSmartBear(WebDriver driver) {

        WebElement username = driver.findElement(By.cssSelector(("input[id='ctl00_MainContent_username']")));
        username.sendKeys("Tester");

        WebElement password = driver.findElement(By.cssSelector("input[id='ctl00_MainContent_password']"));
        password.sendKeys("test");

        WebElement logInbtn = driver.findElement(By.cssSelector("input[id='ctl00_MainContent_login_button']"));
        logInbtn.click();

    }
}