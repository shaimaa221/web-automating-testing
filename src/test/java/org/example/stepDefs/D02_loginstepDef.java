package org.example.stepDefs;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_login;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.support.Color;

public class D02_loginstepDef {
    SoftAssert softAssert=new SoftAssert();
    P02_login loginHome= new P02_login();


    @Given("user go to login page")
    public void userlogin(){
        loginHome.login().click();
    }

    @When("user login with valid email and  Password")
    public void userLoginWithValidEmailPassword() {
        loginHome.email_password("testshaimaa$$@@example.com","P@ssw0rd");
    }

    @And("user press on login button")
    public void userPressOnLoginButton() {
        loginHome.loginbut().click();
    }

    @Then("user login to the system successfully")
    public void userLoginToTheSystemSuccessfully() {
      String URL=  Hooks.driver.getCurrentUrl();
      softAssert.assertEquals("https://demo.nopcommerce.com/",URL);
        boolean value= loginHome.loginsuccess().isDisplayed();
        softAssert.assertTrue(value);
        softAssert.assertAll();
    }

    @When("user login with invalid email and  Password")
    public void userLoginWithInvalidEmailAndPassword() {
        loginHome.email_password("wrong@example.com","P@ssw0rd");
    }

    @Then("user could not login to the system")
    public void userCouldNotLoginToTheSystem() {
       String error_message=loginHome.logininvalid().getText();
    boolean error_value=error_message.contains("Login was unsuccessful");
    softAssert.assertTrue(error_value);
    String error_color= loginHome.logininvalid().getCssValue("color");
        System.out.println(error_color);
        String hexcolor= Color.fromString("rgba(228, 67, 75, 1)").asHex();
        System.out.println(hexcolor);
        softAssert.assertEquals(hexcolor,"#e4434b");
         softAssert.assertAll();

    }
}

