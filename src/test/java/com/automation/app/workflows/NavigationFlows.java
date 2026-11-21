package com.automation.app.workflows;

import io.cucumber.java.en.When;

public class NavigationFlows {

    /**
     * navigation flows combine page methods from different pages to perform complex user interactions
     * for e.g:  When user searches for a product "productName" and adds "5" quantity
     */
    @When("user searches for a product {string} and adds {int} quantity")
    public void userSearchesAndAddsProductQty(String productName, int qty){
        // homePage.searchProduct(productName);
        // productCatalogue.scrollToAndAddQty(qty);
    }
}
