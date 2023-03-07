package org.example.stepDefs;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homepage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class D03_currenciesStepDef {
    SoftAssert softAssert = new SoftAssert();
    P03_homepage currenciespage = new P03_homepage();


    @When("user check currency list")
    public void user_check_currency_list() {
        Select dropdown = new Select(currenciespage.check_currency());
        String text = dropdown.getFirstSelectedOption().getText();
        System.out.println(text);
        softAssert.assertEquals(text, "US Dollar");
        softAssert.assertAll();
    }

    @When("user select Euro")
    public void userSelectEuro() {
        //to select Euro
        Select dropdown = new Select(currenciespage.check_currency());
        dropdown.selectByVisibleText("Euro");
    }

    @Then("check the Euro sign")
    public void checkTheEuroSign() {
        for (int i = 0; i < currenciespage.list_of_prosducts(); i++) {
            String text = Hooks.driver.findElements(By.className("actual-price")).get(i).getText();
            System.out.println(text);
            boolean sign = text.contains("€");
            System.out.println(i);
            softAssert.assertTrue(sign);
        }
          softAssert.assertAll();
    }
}