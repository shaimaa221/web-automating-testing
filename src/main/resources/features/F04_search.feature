
@smoke
Feature:  F04_user could use search functionality
  Scenario Outline: user could search with valid product name
    Given user go to search field with the product name "<productName>"
    And   user press on search button
    Then  user get the result of search correctly "<productName>"
    Examples:
      |productName|
      |book|
      |laptop|
      |nike|

    Scenario Outline: user could search using serial
      Given  uder go to search field with serial  "<serial>"
      And  user press on search button
      Then  user get the search result successfully "<serial>"
      Examples:
      |serial|
      |SCI_FAITH|
      |APPLE_CAM|
      |SF_PRO_11|