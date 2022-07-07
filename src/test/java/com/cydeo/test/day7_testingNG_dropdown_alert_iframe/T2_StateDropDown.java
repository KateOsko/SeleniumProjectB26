package com.cydeo.test.day7_testingNG_dropdown_alert_iframe;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T2_StateDropDown {
    /*
        1. Open Chrome browser
        2. Go to http://practice.cybertekschool.com/dropdown
        3. Select Illinois
        4. Select Virginia
        5. Select California
        6. Verify final selected option is California.
        Use all Select options. (visible text, value, index)
     */

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){
//      1. Open Chrome browser
//      2. Go to http://practice.cybertekschool.com/dropdown

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        //Providing extra time for our driver before it throws NoSuchElementException
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/dropdown");

    }

    @Test
    public void stateDropdownTest() throws InterruptedException {

        Select stateDropdown = new Select(driver.findElement(By.id("state")));
        System.out.println("stateDropDown.isMultiple() = " + stateDropdown.isMultiple());

   // 3. Select Illinois with selectByValue()
        Thread.sleep(3000);
        stateDropdown.selectByValue("IL");


  //  4. Select Virginia with selectByVisibleText()
        Thread.sleep(3000);
        stateDropdown.selectByVisibleText("Virginia");


//    5. Select California with selectByIndex()
        Thread.sleep(3000);
        stateDropdown.selectByIndex(5);


//    6. getFirstSelectedOption() method will return to current selected option
        String actualStateOption = stateDropdown.getFirstSelectedOption().getText();
        String expectedStateOption = "California";

        Assert.assertEquals(actualStateOption, expectedStateOption, "Selected option verification is failed!");

        //Assert.assertEquals(stateDropdown.getFirstSelectedOption().getText(), "California","Selected option verification is failed!");
    }

    /*
            1. Open Chrome browser
        2. Go to https://practice.cydeo.com/dropdown
        3. Select all the options from multiple select dropdown.
        4. Print out all selected values.
        5. Deselect all values.

     */

        @Test
        public void multiSelectDropdowntest() throws InterruptedException {
            Select languages = new Select(driver.findElement(By.xpath("//select[@name='Languages']")));
            System.out.println("languages.isMultiple() = " + languages.isMultiple());

//            Thread.sleep(3000);
//            languages.selectByValue("java");
//            languages.selectByVisibleText("C#");
//            languages.selectByIndex(3);
//            languages.selectByIndex(3);

            List<WebElement> allOptions = languages.getOptions();
            for(WebElement each: languages.getOptions()){
                each.click();
                Thread.sleep(3000);
                System.out.println("each.getText() = " + each.getText());
            }

////          4.Print out all selected Values
//            for(WebElement each: languages.getOptions()){
//                each.click();
//                Thread.sleep(3000);
//                System.out.println(each.getText());
//            }


        }

    }
