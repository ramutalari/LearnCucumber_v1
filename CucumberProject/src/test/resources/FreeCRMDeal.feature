Feature: Test the FreeCRM Deal

  Scenario: freeCRM deal testing
    Given I am on freecrm page to check deals 
    When I enter valid username and password
      | username          | password   |
      | ramu.t9@gmail.com | Iphone2019 |
    Then login should be successfully happen
    And I check title of crmpage
    Then I click on Deal and enter required details
      | Title   | Description | Probability |
      | crmdeal | testpurpose |          30 |
    Then all details should be stored
