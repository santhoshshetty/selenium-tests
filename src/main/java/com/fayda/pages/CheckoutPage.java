package com.fayda.pages;

import org.openqa.selenium.By;

import static com.fayda.utils.ElementUtils.clickElement;

public class CheckoutPage {
    public static final By confirmOrder=By.id("finish");

    public static void submitOrder(){
        clickElement(confirmOrder);
    }
}
