package com.cydeo.test.day3_css_getText_getAttribute;

import com.cydeo.test.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_getText_getAttribute {
    /*
        TC #5: getText() and getAttribute() method practice
    1- Open a chrome browser
    2- Go to: https://practice.cydeo.com/registration_form
    3- Verify header text is as expected:
    Expected: Registration form
    4- Locate “First name” input box
    5- Verify placeholder attribute’s value is as expected: Expected: first name
     */
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage(). window(). maximize();

        driver.get("https://practice.cydeo.com/registration_form");

        //3- Verify header text is as expected:
        //    Expected: Registration form

        //Using cssSelector
        // WebElement headerText = driver.findElement(By.cssSelector("dic[class='page-header']>h2"));

        WebElement headerText = driver.findElement(By.tagName("h2"));

        String expectedHeader = "Registration form";
        String actualHeader = headerText.getText();

        if(actualHeader.equals(expectedHeader)){
            System.out.println("Passed");
        } else {
            System.out.println("Failed!");
        }

//        4- Locate “First name” input box
//        5- Verify placeholder attribute’s value is as expected: Expected: first name

        //        4- Locate “First name” input box
//        5- Verify placeholder attribute’s value is as expected:
//        Expected: first name

        WebElement firstNameInput = driver.findElement(By.className("form-control"));

        String expectedPlaceHolder = "first name";

        //getAttribute(attribute argument) method is helping us to get value of attributes
        String actualPlaceHolder = firstNameInput.getAttribute("placeholder");

        if(actualPlaceHolder.equals(expectedPlaceHolder)){
            System.out.println("Placeholder text verification passed!");
        }else{
            System.out.println("Placeholder text verification failed!");
        }

    }
    }
