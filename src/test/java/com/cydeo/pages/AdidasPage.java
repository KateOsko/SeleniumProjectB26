package com.cydeo.pages;

import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdidasPage {
    /*
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

     */

    public AdidasPage() {
        //PageFactory is  class provided by Selenium WebDriver to support POD pattern
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[.='Laptops']")
    public WebElement categoryLocator;

    @FindBy(xpath = "//a[.=\"Sony vaio i5\"]")
    public WebElement productName;

    @FindBy(xpath = "//a[.='Add to cart']")
    public WebElement sonyAddtoCart;

    @FindBy(xpath = "//li[@class='nav-item active']/a")
    public WebElement home;

    @FindBy(xpath = "//h3")
    public WebElement purchasePrice;

    @FindBy(xpath = "//a[.='Cart']")
    public WebElement cart;



    public int addProduct (String categoryName, String productName) throws InterruptedException {

        String categoryLocator = "//a[.='"+categoryName+"']";
        Driver.getDriver().findElement(By.xpath(categoryLocator)).click();
        Thread.sleep(3000);

        String productLocator = "//a[.='"+productName+"']";
        Driver.getDriver().findElement(By.xpath(productLocator)).click();
        Thread.sleep(3000);



        String priceString = purchasePrice.getText();
        System.out.println(priceString);

        String[] fullprice = priceString.split(" ");
        int price = Integer.parseInt(fullprice[0].substring(1));

        System.out.println(price);

        sonyAddtoCart.click();
        Thread.sleep(3000);

        Alert alert = Driver.getDriver().switchTo().alert();
        alert.accept();

        Thread.sleep(3000);
        home.click();

        return price;

    }

    }
