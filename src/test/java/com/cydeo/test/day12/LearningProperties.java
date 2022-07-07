package com.cydeo.test.day12;

import org.testng.annotations.Test;

public class LearningProperties {

    @Test
    public void java_properties_reading_test(){
        //key=value
        // os.name = Mac OS X
        // user.name = cybertek

        System.out.println("System.getProperties(\"os.name\") = " + System.getProperty("os.name"));
        System.out.println("System.getProperty(\"user.name\") = " + System.getProperty("user.name"));
    }
}
