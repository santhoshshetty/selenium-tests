package com.fayda.tests;

import com.fayda.drivers.DriverHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    @BeforeMethod
    public void setupBrowser(){
        DriverHandler.initDriver("chrome");
    }

    @AfterMethod
    public void tearDown(){
        DriverHandler.closeDriver();
    }
}
