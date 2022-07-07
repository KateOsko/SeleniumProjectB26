package com.cydeo.test.day5_findElement_checkE;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T4_radioButton {
    /*

            1. Open Chrome browser
            2. Go to https://practice.cydeo.com/radio_buttons
            3. Click to “Hockey” radio button
            4. Verify “Hockey” radio button is selected after clicking.
     */

    public static void main(String[] args) throws InterruptedException {

        // 1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();


        // 2. Go to https://practice.cydeo.com/radio_buttons
        driver.get("https://practice.cydeo.com/radio_buttons");
        Thread.sleep(3000);


        // 3. Click to “Hockey” radio button
        WebElement hockeyRadioBtn = driver.findElement(By.xpath("//input[@id = 'hockey']"));
        hockeyRadioBtn.click();

         // 4. Verify “Hockey” radio button is selected after clicking.
        System.out.println("hockeyRadioBtn.isSelected() = " + hockeyRadioBtn.isSelected());

         // Locate green Button
WebElement greenRadioBtn = driver.findElement(By.xpath("//input[@id='green']"));

         //verify if its enable
        System.out.println("greenRadioBtn.isEnabled() = " + greenRadioBtn.isEnabled());


    }
}
