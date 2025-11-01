package com.fayda.tests;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class CrossBrowserTest {

    @Test
    public void runTestInGridMode() throws Exception {
        URL url=new URL("");
        DesiredCapabilities caps=new DesiredCapabilities();
        caps.setBrowserName("chrome");
        WebDriver driver=new RemoteWebDriver(url,caps);
        driver.get("https://www.google.com");
        driver.quit();
    }
}
