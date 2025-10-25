package com.fayda.pages;
import org.openqa.selenium.By;

import static com.fayda.utils.ElementUtils.getText;

public class ConfirmationPage {
    public static final By orderCompletion=By.xpath("//h2[@data-test='complete-header']");

    public static String orderConfirmationMessage(){
        return getText(orderCompletion);
    }
}
