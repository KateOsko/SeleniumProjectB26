package com.cydeo.test.day18_review;

import com.cydeo.pages.AmazonPracticeElements;
import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Amazon_Practice {

    @Test
    public void actionPractice() throws InterruptedException {
        Driver.getDriver().get("https://www.amazon.com/");

        AmazonPracticeElements amazonPracticeElements = new AmazonPracticeElements();

        Actions actions = new Actions(Driver.getDriver());

        JavascriptExecutor js = (JavascriptExecutor)Driver.getDriver();

        actions.moveToElement(amazonPracticeElements.prime).click().perform();

        for(int i=0; i<4; i++){

            Thread.sleep(1000);
            js.executeScript("window.scrollBy(0,750)"); // window.scrollBy(x,y)

        }

        actions.moveToElement(amazonPracticeElements.radioBtn).click().perform();

        actions.moveToElement(amazonPracticeElements.tryForfree).click().perform();

    }
}
