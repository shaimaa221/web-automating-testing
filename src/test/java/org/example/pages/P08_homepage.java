package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P08_homepage {

    By wishlist_icon=By.cssSelector("a[href='/wishlist']");

  public List<WebElement>my_element(){
      return Hooks.driver.findElements(By.xpath("//div[@class='add-info']//div[2]/button[3]"));
  }
  public  boolean success_mes_displayed(){
      boolean value=Hooks.driver.findElement(By.className("content")).isDisplayed();
      return value;
  }
  public String success_mes_color(){
      return Hooks.driver.findElement(By.className("bar-notification")).getCssValue("background-color");
  }
  public  String wishlist_text(){
    return   Hooks.driver.findElement(By.className("wishlist-qty")).getText();
  }

  public WebElement Wishlist_icon(){
      return  Hooks.driver.findElement(By.cssSelector("a[href='/wishlist']"));
  }
  public WebElement Qty_field(){
      return Hooks.driver.findElement(By.className("qty-input"));
  }

}
