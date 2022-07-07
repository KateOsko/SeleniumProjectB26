package com.cydeo.test.day1_selemium_intro;

import com.cydeo.test.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class MyOwnPractice {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebDriver driver2 = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebDriver driver3 = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);





        WebDriver driver5 = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();


//        List<WebElement> sizes = driver.findElement(By.xpath(""));
//        for (WebElement each : sizes){
//            if(each.getText().contains("L")){
//                each.click();
//                System.out.println("each.isEnabled() = " + each.isEnabled());
            }
        }


