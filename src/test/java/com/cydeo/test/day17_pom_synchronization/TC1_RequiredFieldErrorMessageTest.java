package com.cydeo.test.day17_pom_synchronization;

import com.cydeo.pages.RequiredFieldErrorMessage;
import com.cydeo.test.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC1_RequiredFieldErrorMessageTest {

    //1- Open a chrome browser
    //2- Go to: https://library1.cydeo.com
    @Test
    public void dignInErrorMessage() {
        Driver.getDriver().get("https://library1.cydeo.com");
        RequiredFieldErrorMessage requiredFieldErrorMessage = new RequiredFieldErrorMessage();

        //3- Do not enter any information
        //4- Click to “Sign in” button
        requiredFieldErrorMessage.signInBtn.click();

        //5- Verify expected error is displayed:
        //Expected: This field is required.
        Assert.assertEquals(requiredFieldErrorMessage.fieldRequired.getText(),"This field is required.");

    }
}
