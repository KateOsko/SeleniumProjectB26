package com.cydeo.test.day1_selemium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1_YahooTitleVerification {

    public static void main(String[] args) {

        //1.Setting up Web Driver Manger

        WebDriverManager.chromedriver().setup();

        //2. Creating an instance
        WebDriver driver = new ChromeDriver();


        //Maximizing the screen

        driver.manage().window().maximize();
        driver.get("http://www.yahoo.com");

        //actual title comes from Selenium
        String actualTitle = driver.getTitle();
        System.out.println("Actual Title of Yahoo: "+ actualTitle);

        //expected Title comes from the requirements
        String expectedTitle = "Yahoo";

        if(actualTitle.contains(expectedTitle)){
            System.out.println("Title verification is passed");
        } else {
            System.out.println("Title verification is failed");
        }
        driver.quit();
    }
}
