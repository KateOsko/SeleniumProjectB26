package com.cydeo.test.day11_webtables_utilities;

import com.cydeo.test.base.TestBase;
import com.cydeo.test.utilities.BrowserUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class T1_Multiple_Windows extends TestBase {

    @Test
    public void windowHandleTest(){

        //2. Goto:https://www.amazon.com/
        driver.get("https://www.amazon.com/");
        //3. Copy paste the lines from below into your class


        ((JavascriptExecutor) driver).executeScript("window.open('http://google.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('http://etsy.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('http://facebook.com','_blank');");

        //4. Create a logic to switch to the tab where Etsy.com is open

        //5. Assert:Title contains “Etsy”

        BrowserUtils.switchWindowAndVerify(driver, "etsy", "Etsy" );
      //switchWindowAndVerify(WebDriver driver, String expectedInUrl, String expectedTitle)
}
}
