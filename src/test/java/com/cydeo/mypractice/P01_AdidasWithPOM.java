package com.cydeo.mypractice;

import com.cydeo.pages.AdidasPage;
import com.cydeo.test.utilities.ConfigurationReader;
import com.cydeo.test.utilities.Driver;
import org.testng.annotations.Test;

public class P01_AdidasWithPOM {

    @Test
    public void adidas() throws InterruptedException {

        Driver.getDriver().get(ConfigurationReader.getProperty("adidasUrl"));

        AdidasPage adidaspage = new AdidasPage();

        int expectedPrice = adidaspage.addProduct("Laptops", "Sony vaio i5");
        expectedPrice += adidaspage.addProduct("Phones", "Samsung galaxy s6");
        expectedPrice += adidaspage.addProduct("Monitors", "Apple monitor 24");

        System.out.println(expectedPrice);

        adidaspage.cart.click();
        Thread.sleep(3000);

        Driver.closeDriver();

    }
    /*
    SHOP: https://www.demoblaze.com/index.html
    • Customer navigation through product categories: Phones, Laptops and Monitors
    • Navigate to "Laptops" → "Sony vaio i5" and click on "Add to cart". Accept pop up confirmation.
    • Navigate to "Phones" → "Samsung galaxy s6" and click on "Add to cart". Accept pop up confirmation.
    • Navigate to "Monitors" → "Apple monitor 24" and click on "Add to cart". Accept pop up confirmation.
    • Navigate to "Cart" → Delete "Apple monitor 24" from cart.
    • Click on "Place order".
    • Fill in all web form fields.
    • Click on "Purchase"
    • Capture and log purchase Id and Amount.
    • Assert purchase amount equals expected.
    • Click on "Ok"
    • Verify that there is no product in the cart


NOTE : We will create Page Object Model (POM) to solve this task
     */


}
