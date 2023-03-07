package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.p05_homepage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import java.util.List;
import java.util.concurrent.TimeUnit;
import static org.example.stepDefs.Hooks.driver;
import org.testng.asserts.SoftAssert;

public class D05_hoverStepDef {
    p05_homepage hover=new p05_homepage();
    SoftAssert softAssert = new SoftAssert();
    Actions actions = new Actions(driver);
    public  int selectedcat;
   public  String SubText1 ,SubText2,SubText3;
   public  String title1,title2,title3;


    @When("user select random category to hover on it")
    public void user_select_category() throws InterruptedException {
        int count = hover.main_categories().size();
        System.out.println("the number of categories is  "+count);
        //select random namber from 0:6 (selectedcat)to hover ,becouse the size of main category in the list is 7
        int min=0;
        int max=6;
         selectedcat= (int)Math.floor(Math.random()*(max-min+1)+min);
        //hover on the element
        actions.moveToElement(hover.main_categories().get(selectedcat)).perform();
        String selectedCatText = hover.main_categories().get(selectedcat).getText();
        System.out.println("the name of category you hover on it is "+selectedCatText);
      //if random main category is the firest category :hover on one of the firest 3 element in the list
    }

    @And("select asub category from the main category and click on it")
    public void selectAsubCategoryFromTheMainCategory() {

        if(selectedcat==0) {
            int min1 = 0;
            int max1 = 2;
            int selectedSubcat = (int) Math.floor(Math.random() * (max1 - min1 + 1) + min1);
            System.out.println("the index of sub category is  "+selectedSubcat);
            actions.moveToElement(hover.sub_categories().get(selectedSubcat)).perform();
            SubText1 = hover.sub_categories().get(selectedSubcat).getText();
            System.out.println("the name of subcategory is  "+SubText1);
            hover.sub_categories().get(selectedSubcat).click();
            title1= hover.page_title().getText();
            System.out.println("the page title of sub category is  " +title1);
        }
        else if (selectedcat==1){
            int min2 = 3;
            int max2 = 5;
            int selectedSubcat = (int) Math.floor(Math.random() * (max2 - min2 + 1) + min2);
            System.out.println("the index of sub category is  "+selectedSubcat);
            actions.moveToElement(hover.sub_categories().get(selectedSubcat)).perform();
             SubText2 = hover.sub_categories().get(selectedSubcat).getText();
            System.out.println("the name of sub category is " +SubText2);
            hover.sub_categories().get(selectedSubcat).click();
            title2= hover.page_title().getText();
            System.out.println("the page title of sub category " +title2);
        }
        else if(selectedcat==2) {
            int min3 = 6;
            int max3 = 8;
            int selectedSubcat = (int) Math.floor(Math.random() * (max3- min3 + 1) + min3);
            System.out.println("the index of sub category is  "+selectedSubcat);
            actions.moveToElement(hover.sub_categories().get(selectedSubcat)).perform();
             SubText3 = hover.sub_categories().get(selectedSubcat).getText();
            System.out.println("the name of subcategory is " +SubText3);
            hover.sub_categories().get(selectedSubcat).click();
            title3= hover.page_title().getText();
            System.out.println("the page title is " +title3);
        }
        //if random category not contain sub categories
        else {
            actions.moveToElement(hover.main_categories().get(selectedcat)).perform();
            String textmain=hover.main_categories().get(selectedcat).getText();
            System.out.println( "the name of category is" +textmain);
            hover.main_categories().get(selectedcat).click();
            String title=hover.page_title().getText();
            System.out.println("the page title is " +title);
        }
    }
    @Then("make sure that page title  contain the name of selected subcategory")
    public void makeSureThatPageTitleContainTheNameOfSelectedSubcategory() {

        if(selectedcat==0){
            boolean value=title1.toLowerCase().trim().contains(SubText1);
            softAssert.assertTrue(value);
            softAssert.assertAll();
        }
        else if (selectedcat==1) {
            boolean value=title2.toLowerCase().trim().contains(SubText2);
            softAssert.assertTrue(value);
            softAssert.assertAll();
        }
        else if (selectedcat==2) {
            boolean value=title3.toLowerCase().trim().contains(SubText3);
            softAssert.assertTrue(value);
            softAssert.assertAll();
        }
    }
}

