package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P06_homePage {
    public WebElement first_slider() {
       return Hooks.driver.findElement(By.xpath("//a[@href='http://demo.nopcommerce.com/'][1]"));
    }

    public WebElement second_slider(){
        return Hooks.driver.findElement(By.xpath("//a[@href='http://demo.nopcommerce.com/'][2]"));
    }
}
