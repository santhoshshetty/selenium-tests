package com.fayda.pages;
import org.openqa.selenium.By;


import static com.fayda.drivers.DriverHandler.driver;
import static com.fayda.utils.ElementUtils.clickElement;
import static com.fayda.utils.ElementUtils.getText;

public class HomePage {
    public static final By productItem=By.id("add-to-cart-sauce-labs-backpack");
    public static final By cartCount=By.xpath("//span[@data-test='shopping-cart-badge']");
    public static final By cart=By.xpath("//a[@data-test='shopping-cart-link']");
    public static final By burgerMenuButton=By.id("react-burger-menu-btn");
    public static final By logoutButton=By.linkText("Logout");

    public static void addItemsToCart(){
        clickElement(productItem);
        int cartCountValue=Integer.parseInt(getText(cartCount));
        if(cartCountValue==1)
            System.out.println("Items added to the cart..");
        else
            System.out.println("Items not added to the cart...");
        clickElement(cart);
    }

    public static void logout(){
        clickElement(burgerMenuButton);
        clickElement(logoutButton);
        System.out.println(driver.getTitle());
    }
}
