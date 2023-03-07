package org.example.pages;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P04_homePage {


    public WebElement search_field() {
        return Hooks.driver.findElement(By.id("small-searchterms"));
    }

    public int products_count() {
        int count = Hooks.driver.findElements(By.xpath("//h2[@class='product-title']/a")).size();
        return count;
    }

    public List<WebElement> products_name_list() {
        List<WebElement> products_name = Hooks.driver.findElements(By.xpath("//h2[@class='product-title']/a"));
        return products_name;
    }


    public  WebElement Product_title(){
        return Hooks.driver.findElement(By.xpath("//h2[@class='product-title']/a"));
    }

    public WebElement serial_number(){
        return Hooks.driver.findElement(By.cssSelector("div[class=\"additional-details\"] span[id]"));
    }




}
