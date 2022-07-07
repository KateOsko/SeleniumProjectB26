package com.cydeo.nextbasecrm;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogIn {
    public static void main(String[] args) throws InterruptedException {


       WebDriverManager.chromedriver().setup();
       WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        Thread.sleep(3000);
        driver.get("http://login2.nextbasecrm.com/");
        // inserting loginInfo
        WebElement searchBox = driver.findElement(By.name("USER_LOGIN"));
        searchBox.sendKeys("helpdesk25@cybertekschool.com" + Keys.ENTER);

        Thread.sleep(2000);
        // inserting password
        WebElement password = driver.findElement(By.name("USER_PASSWORD"));
        password.sendKeys("UserUser");


        Thread.sleep(2000);
        // Logging In
        WebElement logIn = driver.findElement(By.className("login-btn"));
        logIn.click();


        String expectedTitle = "(39) Portal";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("LogIn title verification passed");
        } else {
            System.out.println("LogIn title verification Failed");
        }

        driver.quit();
    }
}