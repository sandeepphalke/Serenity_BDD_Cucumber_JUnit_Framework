#Author: Sandeep Phalke

Feature: BECOME A DONAR functionality on UNICEF website  
  Here we will verify all possible scenarios applicable for BECOME A DONAR functionality on UNICEF website.

  Scenario: Verify user is able to navigate to donate page after clicking the BECOME A DONOR link
    Given User is on home page of UNICEF website
    When  User click on the become a donar button
    Then  User is navigated to donation page 
    
  Scenario: Verify user is not able to donate funds monthly with alphabetic fund value
    Given User is on home page of UNICEF website
    When  User click on the become a donar button
    Then  User is navigated to donation page 
    And 	User select other option
    And 	User enter "abcd" value
    When 	User click on next button
    Then 	User get an "Other give monthly amount does not meet the requirements." error message
    