
@smoke
Feature: F07_followUs | users could open followUs links

     Scenario Outline:  user opens facebook link
       Given user click on the feacebook icon
       Then  new tap is open contain the new url "<URL>"
       Examples:
       |URL|
       |https://www.facebook.com/nopCommerce|

       Scenario Outline: user open twitter link
         Given user click on twitter icon
         Then  new tap is open contain the new url "<URL>"
         Examples:
         |URL|
         |https://twitter.com/nopCommerce|

         Scenario Outline: user opens rss link
           Given user click on rss link
           Then   new tap is open contain the new url "<URL>"
           Examples:
             |URL|
             |https://demo.nopcommerce.com/new-online-store-is-open|

      Scenario Outline: user opens youtube link
        Given user click on youtube link
        Then   new tap is open contain the new url "<URL>"
        Examples:
       |URL|
       |https://www.youtube.com/user/nopCommerce|







