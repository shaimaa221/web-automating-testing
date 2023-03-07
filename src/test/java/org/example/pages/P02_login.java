package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P02_login {
    public WebElement login(){
        return Hooks.driver.findElement(By.className("ico-login"));
    }
    public void  email_password( String MyEmail, String Mypassword) {
        Hooks.driver.findElement(By.id("Email")).sendKeys(MyEmail);
        Hooks.driver.findElement(By.id("Password")).sendKeys(Mypassword);
    }
    public WebElement loginbut(){
        return Hooks.driver.findElement(By.className("login-button"));
    }

    public WebElement loginsuccess(){
       return  Hooks.driver.findElement(By.className("ico-account"));
    }

    public  WebElement logininvalid(){
       return Hooks.driver.findElement(By.className("message-error"));
    }

}
