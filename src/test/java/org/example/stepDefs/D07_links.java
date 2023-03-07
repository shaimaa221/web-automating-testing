package org.example.stepDefs;

import com.google.common.collect.ArrayListMultimap;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P07_homepage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import javax.swing.text.html.HTMLDocument;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class D07_links {
    P07_homepage links=new P07_homepage();
    WebDriverWait wait;


    @Given("user click on the feacebook icon")
    public void userClickOnTheFeacebookIcon() {
        links.URL_button("a[href='http://www.facebook.com/nopCommerce']").click();

    }

    @Then("new tap is open contain the new url {string}")
    public void newTapIsOpenContainTheUrl(String Expected_url) {
        wait=new WebDriverWait(Hooks.driver,Duration.ofSeconds(2));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        ArrayList<String> ids= new ArrayList<String>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(ids.get(1));
        String actual_url=Hooks.driver.getCurrentUrl();
        System.out.println("the actual url is "+ actual_url);
        Assert.assertEquals(actual_url,Expected_url);
      /*  wait=new WebDriverWait(Hooks.driver,Duration.ofSeconds(20));
        Hooks.driver.close();
        Hooks.driver.switchTo().window(ids.get(0));*/
    }
    @Given("user click on twitter icon")
    public void user_click_on_twitter_icon() {

        links.URL_button("a[href='https://twitter.com/nopCommerce']").click();
    }

    @Given("user click on rss link")
    public void userClickOnRssLink() {

        links.URL_button("a[href='/news/rss/1']").click();
    }

    @Given("user click on youtube link")
    public void userClickOnYoutubeLink() {
        links.URL_button("a[href='http://www.youtube.com/user/nopCommerce']").click();
    }
}

