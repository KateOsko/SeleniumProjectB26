package com.cydeo.test.day5_findElement_checkE;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class T4_2_radioBtn_ {
    /*
            Create a utility method to handle above logic.
            Method name: clickAndVerifyRadioButton
            Return type: void or boolean
            Method args:
            1. WebDriver
            2. Name attribute as String (for providing which group of radio buttons)
            3. Id attribute as String (for providing which radio button to be clicked)

            Method should loop through the given group of radio buttons. When it finds the
            matching option, it should click and verify option is Selected.
            Print out verification: true
     */

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/radio_buttons");

        // Locate all sport RadioButtons
        List<WebElement> sportRadioBtn = driver.findElements(By.xpath("//input[@name='sport']"));

        for (WebElement eachBtn : sportRadioBtn) {
            Thread.sleep(3000);
            eachBtn.click();
        }


    }
}
