package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.example.stepDefs.Hooks.driver;

public class p05_homepage {


    public List<WebElement>main_categories(){
        return Hooks. driver.findElements(By.xpath("//ul[@class=\"top-menu notmobile\"]/li/a"));
    }
    public  List<WebElement> sub_categories(){
      return Hooks.driver.findElements(By.xpath("//ul[@class=\"top-menu notmobile\"]//ul/li/a"));
    }

    public  WebElement page_title(){
        return  Hooks.driver.findElement(By.cssSelector("div[class='page-title'] h1"));

    }
}
