package com.fayda.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.HashMap;
import java.util.Map;

public class DriverHandler {

    public static WebDriver driver;

    public static void initDriver(String browser) {
        if (browser.equalsIgnoreCase("chrome")) {
            final Map<String, Object> chromePrefs = new HashMap<>();
            chromePrefs.put("credentials_enable_service", false);
            chromePrefs.put("profile.password_manager_enabled", false);
            chromePrefs.put("profile.password_manager_leak_detection", false);
            final ChromeOptions options = new ChromeOptions();
            options.setExperimentalOption("prefs", chromePrefs);
            driver = new ChromeDriver(options);
            driver.get("https://www.saucedemo.com/");
        } else if (browser.equalsIgnoreCase("firefox")) {
            driver = new EdgeDriver();
            driver.get("https://www.saucedemo.com");
        } else {
            driver = new FirefoxDriver();
            driver.get("https://www.saucedemo.com/");
        }
    }

    public static void closeDriver(){
        driver.quit();
    }
}
