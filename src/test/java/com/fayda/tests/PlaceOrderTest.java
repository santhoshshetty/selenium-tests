package com.fayda.tests;

import com.fayda.pages.*;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class PlaceOrderTest extends BaseTest {
    @Test
    public void orderTest() {
        LoginPage.login();
        HomePage.addItemsToCart();
        CartPage.continueToCheckoutPage();
        UserPage.submitUserDetails();
        CheckoutPage.submitOrder();
        assertEquals(ConfirmationPage.orderConfirmationMessage(), "Thank you for your order!");
    }
}
