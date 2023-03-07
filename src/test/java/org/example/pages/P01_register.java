package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class P01_register {

    public WebElement click_register_but() {
        return Hooks.driver.findElement(By.className("ico-register"));
    }

    public WebElement gender_type() {
        return Hooks.driver.findElement(By.className("female"));
    }

    public void first_nameAnd_lastname(String firstname, String lastname) {
        Hooks.driver.findElement(By.id("FirstName")).sendKeys(firstname);
        Hooks.driver.findElement(By.id("LastName")).sendKeys(lastname);
    }

    public void date_of_birth() {
        WebElement droopDowen_day = Hooks.driver.findElement(By.name("DateOfBirthDay"));
        Select select = new Select(droopDowen_day);
        select.selectByIndex(24);
        WebElement droopDowen_month = Hooks.driver.findElement(By.name("DateOfBirthMonth"));
        Select seleectM = new Select(droopDowen_month);
        seleectM.selectByValue("9");
        WebElement droopDowen_years = Hooks.driver.findElement(By.name("DateOfBirthYear"));
        Select selecty = new Select(droopDowen_years);
        selecty.selectByValue("1995");
    }

    public WebElement Email_field() {
        return Hooks.driver.findElement(By.id("Email"));
    }

    public void passwordfield(String password, String confpassword) {
        Hooks.driver.findElement(By.id("Password")).sendKeys(password);
        Hooks.driver.findElement(By.id("ConfirmPassword")).sendKeys(confpassword);
    }
    public WebElement registerBut(){
        return Hooks.driver.findElement(By.id("register-button"));
    }


    public WebElement Msg(){

        return Hooks.driver.findElement(By.className("result"));
    }

}