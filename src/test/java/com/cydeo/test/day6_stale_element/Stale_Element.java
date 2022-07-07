package com.cydeo.test.day6_stale_element;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Stale_Element {
    /*
            TC #1: StaleElementReferenceException handling
        1. Open Chrome browser
        2. Go to https://practice.cydeo.com/add_remove_elements/
        3. Click to “Add Element” button
        4. Verify “Delete” button is displayed after clicking.
        5. Click to “Delete” button.
        6. Verify “Delete” button is NOT displayed after clicking.
     */

    //1. Open Chrome browser
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to https://practice.cydeo.com/add_remove_elements/
        driver.get("https://practice.cydeo.com/add_remove_elements/");

//    3. Click to “Add Element” button
        WebElement addElement = driver.findElement(By.xpath("//button[.='Add Element']"));


//    4. Verify “Delete” button is displayed after clicking.
        addElement.click();
        WebElement deleteBtn = driver.findElement(By.cssSelector(("button[class=\"added-manually\"]")));
        System.out.println("deleteBtn.isDisplayed() = " + deleteBtn.isDisplayed());

//    5. Click to “Delete” button.
        deleteBtn.click();

//    6. Verify “Delete” button is NOT displayed after clicking.
      //  System.out.println("After clicking delete nutton = " + deleteBtn.isDisplayed());

        try {
            System.out.println("After clicking delete button = " + deleteBtn.isDisplayed());
        } catch (StaleElementReferenceException e) {
            System.out.println("StaleElementReference is thrown");
            System.out.println("This means the web element is completely deleted from the page and html");
        }
    }
}
