package com.cydeo.test.day4_cssSelector_xpath;

import com.cydeo.test.utilities.WebDriverFactory;
import com.google.common.base.Verify;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_xpath_css_isDisplayed {
    public static void main(String[] args) {

//            TC #1: XPATH and cssSelector Practices
//            1. Open Chrome browser

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

//            2. Go to https://practice.cydeo.com/forgot_password
        driver.get("https://practice.cydeo.com/forgot_password");
//            3. Locate all the WebElements on the page using XPATH and/or CSS locator only (total of 6)
//            a. “Home” link

        //locate homelink using cssSelector , class value
        WebElement homeLink1 = driver.findElement(By.cssSelector("a[class='nav-link']"));

        //Locate homeLink using cssSelector, href value
        WebElement homeLink2 = driver.findElement(By.cssSelector("a[href='/']"));

        //Locate homeLink using cssSelector, syntax2 for class
        WebElement homeLink3 = driver.findElement(By.cssSelector("a.nav-link"));



        //  Locate Home Link text of with X-Path
        WebElement homeLink4 = driver.findElement(By.xpath("//a[.='Home']")); //xpath(text()='Home')

        WebElement homeLink5 = driver.findElement(By.xpath("//a[@class='nav-link']"));

//          b. “Forgot password” header c. “E-mail” text

        //Locate forgotPassword using cssSelector from parent to child with ">"
        WebElement forgotPassword1 = driver.findElement(By.cssSelector("div[class='example']>h2"));

        //Locate forgotPassword using cssSelector Syntax2
        WebElement forgotPassword2 = driver.findElement(By.cssSelector("div.example>h2"));

         // Using XPath
        WebElement forgotPassword3 = driver.findElement(By.xpath("//h2[.='Forgot Password']"));

//
//          c. E-mail input box
        WebElement emailText = driver.findElement(By.cssSelector("label[for='email"));

        //Using X-path
        WebElement emailInputBox1 = driver.findElement(By.xpath("//input[@name='email']"));

        // Using X-Path
        WebElement emailText2 = driver.findElement(By.xpath("label[@for='email"));

        //d. Email Input Box

        WebElement emailInputBox = driver.findElement(By.cssSelector("input[name='email']"));

       // e. “Retrieve password” button f. “Powered by Cydeo text

        WebElement retrievePassword = driver.findElement(By.cssSelector("button.radius"));
        WebElement retrievePassword2 = driver.findElement(By.cssSelector("button#form_submit"));

       // f. powered by Cydeo
            WebElement poweredByCydeo = driver.findElement(By.cssSelector("div[style='text-align: center;']"));

//            4. Verify all web elements are displayed.
        System.out.println("homeLink1.isDisplayed()= " + homeLink1.isDisplayed());
        System.out.println("forgotPassword1.isDisplayed() = " + forgotPassword1.isDisplayed());
        System.out.println("emailText.isDisplayed() = " + emailText.isDisplayed());
        System.out.println("emailInputBox.isDisplayed() = " + emailInputBox.isDisplayed());
        System.out.println("retrievePassword.isDisplayed() = " + retrievePassword.isDisplayed());
        System.out.println("poweredByCydeo.isDisplayed()" + poweredByCydeo.isDisplayed());





    }
}
