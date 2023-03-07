
@smoke
Feature:  F03_currencies user could switch between currencies
  Scenario: Dollar currency is selected by default
    When user check currency list


    Scenario:  user could select Euro currency
      When  user select Euro
      Then  check the Euro sign



