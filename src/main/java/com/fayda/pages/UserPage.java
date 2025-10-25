package com.fayda.pages;

import org.openqa.selenium.By;
import static com.fayda.utils.ElementUtils.clickElement;
import static com.fayda.utils.ElementUtils.sendKeys;

public class UserPage {
    public static final By firstName=By.id("first-name");
    public static final By lastName=By.id("last-name");
    public static final By postalCode=By.id("postal-code");
    public static final By continueToConfirmOrder=By.id("continue");

    public static void submitUserDetails(){
        sendKeys(firstName,"Ishaan");
        sendKeys(lastName,"G");
        sendKeys(postalCode,"13587");
        clickElement(continueToConfirmOrder);
    }
}
