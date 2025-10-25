package com.fayda.utils;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import java.time.Duration;

import static com.fayda.drivers.DriverHandler.driver;

public class Waiters {

    public static FluentWait<WebDriver> getFluentWait(){
        return new FluentWait<>(driver).withTimeout(Duration.ofSeconds(10)).
                pollingEvery(Duration.ofMillis(2))
                .ignoring(NoSuchElementException.class);
    }
}
