package com.cydeo.test.day9_iframe;

import com.cydeo.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

/*

                TC #6: Iframe Task
                1- Open a chrome browser
                2- Go to: https://practice.cydeo.com/iframe
                3- Clear text from comment body
                4- Type "Hello World" in comment body
                5- Verify "Hello World" text is written in comment body
                6- Verify header "An iFrame containing the TinyMCE
                WYSIWYG Editor" is displayed

 */

public class IframePractice extends TestBase {

    @Test
    public void iframeTest() throws InterruptedException {
        driver.get("https://practice.cydeo.com/iframe");

        // 3- Clear text from comment body

        //frame(id)
        driver.switchTo().frame("mce_0_ifr");


        WebElement commentBody = driver.findElement(By.id("tinymce"));
        commentBody.clear();
        //clear() method to delete text form from comment body
        Thread.sleep(3000);

        commentBody.sendKeys("Hello World");

        assertEquals(commentBody.getText(),"Hello World");

        driver.switchTo().parentFrame();


        //6- Verify header "An iFrame containing the TinyMCE  WYSIWYG Editor" is displayed

        WebElement headerText = driver.findElement(By.tagName("h3"));
        Assert.assertTrue(headerText.isDisplayed(),"Header text did not appear!");

        String actualHeader = headerText.getText();
        String expectedHeader = "An iFrame containing the TinyMCE WYSIWYG Editor";
        assertEquals(actualHeader,expectedHeader,"Header text did not match");

    }
}
