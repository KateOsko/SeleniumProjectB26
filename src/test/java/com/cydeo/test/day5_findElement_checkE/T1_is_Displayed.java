package com.cydeo.test.day5_findElement_checkE;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_is_Displayed {
    public static void main(String[] args) {


        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://www.tesla.com");


        WebElement solarHeader = driver.findElement(By.xpath("(//h1[contains(text(), 'Solar Panels')])[1]"));

        System.out.println("solarHeader.isDisplayed() = " + solarHeader.isDisplayed());
    }
}
