Feature: Test Facebook Smoke Scenario

  Scenario: Test Facebook login with valid credentials
    Given Open chrome and Start application
    When I enter valid username and valid password
    Then User should be able to login successfully

   