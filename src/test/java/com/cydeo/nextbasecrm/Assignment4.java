package com.cydeo.nextbasecrm;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Assignment4 {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Got to https://login2.nextbasecrm.com/
        driver.get("https://login2.nextbasecrm.com/");
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }

    @Test
    public void LogIn() {
        //Log in with the right credentials
        WebElement logIn = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        logIn.sendKeys("helpdesk25@cybertekschool.com" + Keys.ENTER);

        WebElement password = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        password.sendKeys("UserUser");

        //Click logIn button
        WebElement logInbtn = driver.findElement(By.xpath("//input[@class='login-btn']"));
        logInbtn.click();

        // Find Message Tab in the middle top menu and click it
        WebElement message = driver.findElement(By.xpath("//span[@id='feed-add-post-form-tab-message']/span"));
        message.click();

        // Click send button leaving the message field empty
        WebElement sendButton = driver.findElement(By.xpath("//button[@id='blog-submit-button-save']"));
        sendButton.click();

        //the error message is displayed
        WebElement isDisplayed = driver.findElement(By.xpath("//*[text()='The message title is not specified']"));
        System.out.println("isDisplayed.isDisplayed() = " + isDisplayed.isDisplayed());
    }

}

