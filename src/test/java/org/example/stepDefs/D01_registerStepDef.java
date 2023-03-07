package org.example.stepDefs;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_register;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;


public class D01_registerStepDef {

    P01_register register=new P01_register();
    SoftAssert softAssert=new SoftAssert();

    @Given("user go to register page")
    public void userGoToRegisterPage() {

        register.click_register_but().click();
    }

    @When("user select gender type")
    public void userSelectGenderType() {
        register.gender_type().click();
    }

    @And("user enter first name  and last name")
    public void userEnterFirstNameAndLastName() {

        register.first_nameAnd_lastname("automation","tester");
    }

    @And("user enter date of birth")
    public void userEnterDateOfBirth() {

        register.date_of_birth();
    }

    @And("user enter email")
    public void userEnterEmail() {

        register.Email_field().sendKeys("testshaimaa$$@@example.com");
    }

    @And("user fills Password fields")
    public void userFillsPasswordFields() {

        register.passwordfield("P@ssw0rd","P@ssw0rd");
    }

    @And("user clicks on register button")
    public void userClicksOnRegisterButton() {

        register.registerBut().click();
    }

    @Then("success message is displayed")
    public void successMessageIsDisplayed() {
        String color= register.Msg().getCssValue("color");
        softAssert.assertEquals(color,"rgba(76, 177, 124, 1)");
        boolean value =register.Msg().isDisplayed();
        softAssert.assertTrue(value);
        softAssert.assertAll();

    }
}
