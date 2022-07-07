package com.cydeo.pages;

import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InvalidErrorMessage {

    public InvalidErrorMessage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (id="inputEmail")
    public WebElement email;

    @FindBy(id="inputPassword")
    public WebElement password;

    @FindBy (xpath="//button[.='Sign in']")
    public WebElement signInBtn;

    @FindBy (id="inputEmail-error")
    public WebElement errorMessage;

    @FindBy(xpath="//div[.='Sorry, Wrong Email or Password']")
    public WebElement sorryWrongEmailOrPass;

}
