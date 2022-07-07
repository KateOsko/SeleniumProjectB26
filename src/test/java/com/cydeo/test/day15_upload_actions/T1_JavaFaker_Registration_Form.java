package com.cydeo.test.day15_upload_actions;

import com.cydeo.test.utilities.ConfigurationReader;
import com.cydeo.test.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class T1_JavaFaker_Registration_Form {
    @Test
    public void registration_form_test() {

        //    Note: Use JavaFaker OR read from configuration.properties file when possible.
//    1. Open browser
//    2. Go to website: https://practice.cydeo.com/registration_form
        // driver.get("https://practice.cydeo.com/registration_form");
        Driver.getDriver().get(ConfigurationReader.getProperty("registration.form.url"));

        Faker faker = new Faker();

//    3. Enter first name
        WebElement firstname = Driver.getDriver().findElement(By.name("firstname"));
        firstname.sendKeys(faker.name().firstName());

//    4. Enter last name

//    5. Enter username
//      faker.bothify("???")

//    6. Enter email address

//    7. Enter password

//    8. Enter phone number
        WebElement phoneNumber = Driver.getDriver().findElement(By.cssSelector("input[name='phone']"));
        phoneNumber.sendKeys(faker.numerify("###-###-####"));
//


//    9. Select a gender from radio buttons
        WebElement gender = Driver.getDriver().findElement(By.xpath("//input[@value = 'female']"));
        gender.click();

//    10.Enter date of birth
        WebElement dateOfBirth = Driver.getDriver().findElement(By.cssSelector("input[placeholder='MM/DD/YYYY']"));
        dateOfBirth.sendKeys("10/2/1990");


//    11.Select Department/Office
        Select office = new Select(Driver.getDriver().findElement(By.cssSelector("select[name='department']")));
        office.selectByIndex(faker.number().numberBetween(1,9));


//    12.Select Job Title

        Select jobTitle = new Select(Driver.getDriver().findElement(By.cssSelector("select[name='job_title']")));
        jobTitle.selectByIndex(faker.number().numberBetween(1,9));

//    13.Select programming language from checkboxes
//    14.Click to sign up button
//    15.Verify success message “You’ve successfully completed registration.” is
//    displayed.

    }
}