package com.automation.app.stepdefinitions;

import com.automation.app.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

    LoginPage loginPage;

    public LoginSteps(){
        loginPage = new LoginPage();
    }


    @Given("user closes cookie popup")
    public void userClosesCookiePopup() {
        //Closes the TrustArc screen/ cookies popup
        System.out.print("Handle Cookies preference manager");
    }

    @Given("user enters user name as {string}")
    public void userEntersPhoneNumberAsString(String name) {
        loginPage.inputUserName(name);
    }

    @And("user enters password as {string}")
    public void userEntersPassword(String password) {
        loginPage.inputPassword(password);
    }

    @When("user clicks on login button")
    public void userClicksOnLoginButton() {
        //click on login button
        System.out.println("Clicks on Login");
    }

    @Then("user is on {string} screen")
    public void userIsOnScreen(String screenName) {
        System.out.println(screenName);
    }

}
