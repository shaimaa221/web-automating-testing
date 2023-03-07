
@smoke
Feature: F02_Login | users could use login functionality to use their accounts
  Scenario: user could login with valid email and password
    Given user go to login page
    When  user login with valid email and  Password
    And   user press on login button
    Then  user login to the system successfully


    Scenario:F02_Login| user login with invalid data
      Given user go to login page
      When user login with invalid email and  Password
      And  user press on login button
      Then  user could not login to the system


