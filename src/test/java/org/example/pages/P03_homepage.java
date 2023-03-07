package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import java.util.List;
public class P03_homepage {
    public String text;

    public WebElement check_currency() {

        return Hooks.driver.findElement(By.id("customerCurrency"));
    }

   public void verify_EURO() {
          List<WebElement> products = Hooks.driver.findElements(By.className("actual-price"));
          for (WebElement element : products) {
              text = element.getText();
              System.out.println(text);
              boolean simpole = text.contains("€");
              Assert.assertTrue(simpole);
          }

      }

    public int list_of_prosducts() {
        List<WebElement> products = Hooks.driver.findElements(By.className("actual-price"));
        int count = products.size();
        return count;

    }

    public void currencies_dollar() {

        List<WebElement> currencies = Hooks.driver.findElements(By.xpath("//select[@id=\"customerCurrency\"]/option"));
        WebElement dollar = currencies.get(1);


    }
}
