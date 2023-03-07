@smoke
Feature: F08_Wishlist
  Scenario:user could add product to the cart
    Given user click on the click on wishlist button on the product in home page
    Then success message is appeared in the home page


    Scenario:check that the product is added in wishlist
      Given user click on the click on wishlist button on the product in home page
      Then the product is added in wishlist quantity