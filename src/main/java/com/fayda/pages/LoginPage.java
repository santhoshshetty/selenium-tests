package com.fayda.pages;

import org.openqa.selenium.By;


import static com.fayda.utils.ElementUtils.clickElement;
import static com.fayda.utils.ElementUtils.sendKeys;

public class LoginPage {
    public static final By userNameTextField=By.id("user-name");
    public static final By passwordTextField=By.id("password");
    public static final By loginSubmit=By.id("login-button");

    public static void login(){
        sendKeys(userNameTextField,"standard_user");
        sendKeys(passwordTextField,"secret_sauce");
        clickElement(loginSubmit);
    }
}
