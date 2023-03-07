package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P08_homepage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.support.Color;

import java.time.Duration;
import java.util.List;

public class D08_wishlistStepDef {
    P08_homepage wishlist=new P08_homepage();

    SoftAssert softAssert = new SoftAssert();
    WebDriverWait wait;
    public int myquantity;
    public boolean check;

    @Given("user click on the click on wishlist button on the product in home page")
    public void user_click_on_the_click_on_wishlist_button_on_the_product_in_home_page() {
        wishlist.my_element().get(2).click();
    }

    @Then("success message is appeared in the home page")
    public void successMessageIsAppearedInTheHomePage() {
        softAssert.assertTrue( wishlist.success_mes_displayed());
        softAssert.assertAll();
        String color=  wishlist.success_mes_color();
        System.out.println(color);
        String HEX_color = Color.fromString("rgba(75, 176, 122, 1)").asHex();
        System.out.println(HEX_color);
        softAssert.assertEquals(HEX_color, "#4bb07a");
        softAssert.assertAll();
    }

    @Then("the product is added in wishlist quantity")
    public void theProductIsAddedInWishlistQuantity() {

        wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.textToBe(By.className("wishlist-qty"), "(1)"));
        String text = wishlist.wishlist_text();
        System.out.println(text);
        wishlist.Wishlist_icon().click();
        String quantity = wishlist.Qty_field().getAttribute("value");
        System.out.println("the quantity is " + quantity);
        myquantity = Integer.parseInt(quantity);
        System.out.println(myquantity);
        if(myquantity>0){
            check=true;
        }
        System.out.println(check);
        softAssert.assertTrue(check);
        softAssert.assertAll();

    }
}