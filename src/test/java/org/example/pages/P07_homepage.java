package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P07_homepage {


    public WebElement URL_button(String locator){

        return Hooks.driver.findElement(By.cssSelector(locator));
    }
}
