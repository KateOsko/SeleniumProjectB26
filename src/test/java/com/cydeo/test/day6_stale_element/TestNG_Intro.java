package com.cydeo.test.day6_stale_element;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_Intro {

    @BeforeClass
    public void setUp(){
        System.out.println("Before class is running");
    }

    public void tearDown(){
        System.out.println("After class is running");
    }


    //BeforeMethod will be running before each test method
    @BeforeMethod
    public void setUpMethod(){
        System.out.println("Before method is running");
    }

    @AfterMethod
    public void tearDownMethod(){
        System.out.println("After method is running");
    }



@Test
    public void test1(){
        System.out.println("Test1 is running...");
        String actual = "apple";
        String expected = "apple";
    Assert.assertEquals(actual, expected);
    }

    @Test
    public void test2(){
        System.out.println("Test2 is running...");
        Assert.assertEquals("Orange", "Orange", "it did not pass");
    }
}


