package com.cydeo.test.day3_css_getText_getAttribute;

import com.cydeo.test.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.logging.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3_getAttribute_Css {
    public static void main(String[] args) {
        /*
        TC #3: NextBaseCRM, locators, getText(), getAttribute() practice
        1- Open a chrome browser
        2- Go to: https://login1.nextbasecrm.com/
        3- Verify “Log in” button text is as expected:
        Expected: Log In

         */

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com/");

//        3- Verify “Log in” button text is as expected:
//        Expected: Log In

        //Locate using type attribute
        //WebElement loginButton = driver.findElement(By.cssSelector("input[type='submit']"));

        //Locate using value attribute
        //WebElement loginButton = driver.findElement(By.cssSelector("input[value='Log In']"));

        //Locate using type attribute
        WebElement loginButton = driver.findElement(By.cssSelector("input[class='login-btn']"));

        String expectedBtnText = "Log In";
        String actual = loginButton.getAttribute("value");

        if(actual.equals(expectedBtnText)){
            System.out.println("Passed");
        } else{
            System.out.println("Failed");
        }
    }
}
