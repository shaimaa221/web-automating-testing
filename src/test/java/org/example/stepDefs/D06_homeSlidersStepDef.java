package org.example.stepDefs;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P06_homePage;
import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

import static org.example.stepDefs.Hooks.driver;


public class D06_homeSlidersStepDef {
    P06_homePage home_slider=new P06_homePage();
    SoftAssert softAssert=new SoftAssert();
   WebDriverWait wait;

    @When("user click on  first sliders in home page")
    public void user_click_on_slide_in_home_page() throws InterruptedException {
        wait=new WebDriverWait(Hooks.driver,Duration.ofSeconds(15));
        wait.until(ExpectedConditions.attributeContains(home_slider.first_slider(),"style","display: block"));
        home_slider.first_slider().click();
        String actual_url1= driver.getCurrentUrl();
        System.out.println(actual_url1);
    }


    @Then("make sure that the user navigate to the right page")
    public void makeSureThatTheUserNavigateToTheRightPage() {
        wait=new WebDriverWait(Hooks.driver,Duration.ofSeconds(15));
      boolean value= wait.until(ExpectedConditions.urlContains("https://demo.nopcommerce.com/nokia-lumia-1020"));
      softAssert.assertTrue(value);
      softAssert.assertAll();
    }

    @When("user click on second slider in home page")
    public void userClickOnSecondSliderInHomePage() throws InterruptedException {

        wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(15));
        //wait until the slide displayed style="display: block"
        wait.until(ExpectedConditions.attributeContains(home_slider.second_slider(), "style", "display: block"));
        home_slider.second_slider().click();
        String actual_url2= driver.getCurrentUrl();
        System.out.println(actual_url2);
    }

    @Then("relative product for second slider is displayed")
    public void relativeProductForSecondSliderIsDisplayed() {
        wait=new WebDriverWait(Hooks.driver,Duration.ofSeconds(15));
            boolean value=wait.until(ExpectedConditions.urlContains("https://demo.nopcommerce.com/iphone-6"));
            softAssert.assertTrue(value);
            softAssert.assertAll();
        }
        }


