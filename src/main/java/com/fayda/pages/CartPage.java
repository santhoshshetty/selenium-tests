package com.fayda.pages;

import org.openqa.selenium.By;

import static com.fayda.utils.ElementUtils.clickElement;

public class CartPage {
    public static final By continueToCheckout=By.id("checkout");

    public static void continueToCheckoutPage(){
        clickElement(continueToCheckout);
    }
}
