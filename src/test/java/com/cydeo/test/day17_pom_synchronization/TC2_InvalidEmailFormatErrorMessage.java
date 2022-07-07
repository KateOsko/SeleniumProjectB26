package com.cydeo.test.day17_pom_synchronization;

import com.cydeo.pages.InvalidErrorMessage;
import com.cydeo.test.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC2_InvalidEmailFormatErrorMessage {

    //    TC #2: Invalid email format error message test
//    1- Open a chrome browser
//    2- Go to: https://library1.cydeo.com
    @Test
    public void invalidEmailFormat() {
        Driver.getDriver().get("https://library1.cydeo.com");
        InvalidErrorMessage invalidErrorMessage = new InvalidErrorMessage();

//    3- Enter invalid email format
       invalidErrorMessage.email.sendKeys("rgsfefg");
       invalidErrorMessage.signInBtn.click();

//    4- Verify expected error is displayed:
//    Expected: Please enter a valid email address.
        Assert.assertEquals(invalidErrorMessage.errorMessage.getText(), "Please enter a valid email address.");

    }
}
