#Sureshmanikandan
#10/7/2024

Feature: Login page automation of saucedemo application
Scenario: Check login is successful with valid credentials

    Given User is on Dashboard page
    When User enters valid "<username>" and "<password>"
    And clicks on login button
    Then user is navigated to the Luxurious car page
    Then user is navigated to the sports car page
    Then user is navigated to the vintage car page
    Then user is navigated to the superlux car page
    Then user is navigated to the userinfo car page
    And Close the browser


    Examples: 
      | username  | password |
      | sandeep123@gmail.com | sandeep234 |

      
      
