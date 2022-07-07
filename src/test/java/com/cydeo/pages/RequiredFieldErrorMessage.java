package com.cydeo.pages;

import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RequiredFieldErrorMessage {
    public RequiredFieldErrorMessage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath="//button[.='Sign in']")
    public WebElement signInBtn;

    @FindBy(id = "inputEmail-error")
    public WebElement fieldRequired;


}
