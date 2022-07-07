package com.cydeo.test.day16_actions_jsexecutor;

import com.cydeo.test.utilities.ConfigurationReader;
import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class T3_JSExecutor_Scroll {

    @Test
    public void etsy_scroll_test(){

      //   * Goto Etsy homepage
        Driver.getDriver().get(ConfigurationReader.getProperty("etsy.page.url"));

      //   * Scroll down

        JavascriptExecutor js = (JavascriptExecutor)Driver.getDriver();
        


      //   * Generate random email and enter into subscribe box


      //   * Click on Subscribe


      //   * Verify "Great! We've sent you an email to confirm your subscription." is displayed

    }
}
