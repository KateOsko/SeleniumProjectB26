package com.cydeo.pages;

import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPracticeElements {

    public AmazonPracticeElements(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath="//*[@id=\"ad\"]/div/div/div/a")
    public WebElement pingPongTable;

    @FindBy(xpath = "//a[@href=\"/prime?ref_=nav_cs_primelink_nonmember\"]")
    public WebElement prime;

    @FindBy(xpath="(//div[@class='plan-card-radio-button'])[2]")
    public WebElement radioBtn;

    @FindBy(xpath="//input[@value='Try Prime free for 30 days']")
    public WebElement tryForfree;


}
