package com.cydeo.test.day3_css_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_Locators_getText {
    /*
        TC #1: NextBaseCRM, locators and getText() practice 1- Open a chrome browser
        2- Go to: https://login1.nextbasecrm.com/
        3- Enter incorrect username: “incorrect”
        4- Enter incorrect password: “incorrect”
        5- Click to login button.
        6- Verify error message text is as expected:
        Expected: Incorrect login or password
    */

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //go here
        driver.get("https://login1.nextbasecrm.com/");

        //3 - Enter incorrect username
        WebElement userName = driver.findElement(By.className("login-inp"));
        userName.sendKeys("incorrect");

        //4 - Enter incorrect password: “incorrect”
        WebElement password = driver.findElement(By.name("USER_PASSWORD"));
        password.sendKeys("incorrect");

        //5 - Click to log in
        WebElement loginBtn = driver.findElement(By.className("login-btn"));
        loginBtn.click();

        //6- Verify error message text is as expected:
        //        Expected: Incorrect login or password

        WebElement errorMsg = driver.findElement(By.className("errortext"));
        String expectedText = "Incorrect login or password";

        //getText() method; it will get the content(text)
        String actualText = errorMsg.getText();


        if(actualText.equals(expectedText)) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }

        driver.quit();

    }
}