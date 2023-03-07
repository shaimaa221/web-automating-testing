package org.example.stepDefs;

import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Hooks {
    public static WebDriver driver;
    /*steps to open browser
       1- set property
       2- creat object from web driver
       3- configrations
       3.1- maximuize
       3.2- implicite wait
     */
    @Before
    public void open_browser(){
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(600));
        driver.get("https://demo.nopcommerce.com/");
    }
   @After
    public static void quitDriver() throws InterruptedException {
        Thread.sleep(15000);
        driver.quit();
    }

}
