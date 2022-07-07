package com.cydeo.test.day17_pom_synchronization;

import com.cydeo.pages.InvalidErrorMessage;
import com.cydeo.test.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC3_LibraryNegativeLogIn {

    //    1- Open a chrome browser
//    2- Go to: https://library1.cydeo.com
    @Test
    public void libraryNegativeLogIn() throws InterruptedException {
        Driver.getDriver().get("https://library1.cydeo.com");
        InvalidErrorMessage invalidErrorMessage = new InvalidErrorMessage();


//    3- Enter incorrect username or incorrect password
        invalidErrorMessage.email.sendKeys("alrjhg@gmail.comd");

        Thread.sleep(3000);
        invalidErrorMessage.password.sendKeys("Jtg56");
        invalidErrorMessage.signInBtn.click();

//    4- Verify title expected error is displayed:
//    Expected: Sorry, Wrong Email or Password

        Assert.assertEquals(invalidErrorMessage.sorryWrongEmailOrPass.getText(), "Sorry, Wrong Email or Password");


    }
}
