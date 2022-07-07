package com.cydeo.test.day11_webtables_utilities;

import com.cydeo.test.base.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PracticeAllWindowHandles extends TestBase {

    @Test
    public void testWindowHandles() {

        driver.get("https://www.dojacat.com/");

        String windowDOJA = driver.getWindowHandle();
        System.out.println("windowDOJA = " + windowDOJA);

        String actualTitle = driver.getTitle();
        String expectedTitle = "Doja Cat — After Hours Til Dawn Tour";
        Assert.assertEquals(actualTitle, expectedTitle, "Title verification failed");
        System.out.println(driver.getCurrentUrl().contains("doja"));
        System.out.println(driver.getCurrentUrl());


    }

}
