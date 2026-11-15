package com.automation.app.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    @FindBy(id = "userName")
    private WebElement userName;

    public void inputUserName(String name){
        System.out.println("Test");
//        userName.sendKeys(name);
    }

    public void inputPassword(String password) {
        System.out.println("Test");
    }
}
