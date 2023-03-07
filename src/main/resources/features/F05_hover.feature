@smoke
Feature:F05_ user could hover between elements
  Scenario: hover on element
    When user select random category to hover on it
    And  select asub category from the main category and click on it
    Then  make sure that page title  contain the name of selected subcategory
