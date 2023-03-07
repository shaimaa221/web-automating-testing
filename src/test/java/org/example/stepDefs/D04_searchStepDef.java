package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import jdk.internal.dynalink.beans.StaticClass;
import org.example.pages.P03_homepage;
import org.example.pages.P04_homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.asserts.SoftAssert;

import java.util.Locale;

public class D04_searchStepDef<product_name> {
    SoftAssert softAssert = new SoftAssert();
    P04_homePage search = new P04_homePage();

    @Given("user go to search field with the product name {string}")
    public void user_GoToSearch_Field_With_TheProduct_Name( String product_name) {

           search.search_field().sendKeys(product_name);
    }
    @And("user press on search button")
    public void userPressOnSearchButton() {
       search.search_field().sendKeys(Keys.ENTER);
    }

    @Then("user get the result of search correctly {string}")
    public void userGetTheResultOfSearchCorrectly(String product_name ) {
        search.products_count();
        System.out.println(search.products_count());
        for (int x = 0; x < search.products_count(); x++) {
           String text=search.products_name_list().get(x).getText();
            System.out.println(text);
           boolean value = text.toLowerCase().contains(product_name);
            softAssert.assertTrue(value);
        }

        softAssert.assertAll();
    }

    @Given("uder go to search field with serial  {string}")
    public void uderGoToSearchFieldWithSerial(String product_serial) {

        search.search_field().sendKeys(product_serial);
    }


    @Then("user get the search result successfully {string}")
    public void userGetTheSearchResultSuccessfully(String product_serial) {
        search.Product_title().click();
        String text = search.serial_number().getText();
        System.out.println(text);
        boolean value = text.contains(product_serial);
        softAssert.assertTrue(value);
        softAssert.assertAll();
    }
}






