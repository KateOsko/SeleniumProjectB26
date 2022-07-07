package com.cydeo.test.day12;

import com.cydeo.test.base.TestBase;
import com.cydeo.test.utilities.SmartBearUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class SmartBearLinkVerification extends TestBase {

    @Test
    public void countAllLinks(){
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        SmartBearUtils.loginToSmartBear(driver);

        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("The numbers of links = " + links.size());

    }
}
