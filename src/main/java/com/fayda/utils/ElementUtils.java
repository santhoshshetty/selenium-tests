package com.fayda.utils;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class ElementUtils {

    public static void clickElement(By element){
        Waiters.getFluentWait().until(ExpectedConditions.elementToBeClickable(element));
        tryFindElement(element).click();
    }

    public static String getText(By element){
        return tryFindElement(element).getText();
    }

    public static void sendKeys(By element, String value){
        tryFindElement(element).sendKeys(value);
    }

    public static WebElement tryFindElement(By element){
        return Waiters.getFluentWait().until(ExpectedConditions.presenceOfElementLocated(element));
    }
}
