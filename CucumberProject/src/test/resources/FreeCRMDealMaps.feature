Feature: Test the FreeCRM Deal

  Scenario: freeCRM deal testing
    Given I am on freecrm webpage to check deals details with Map
    When I enter valid username and password with Map
      | username          | password   |
      | ramu.t9@gmail.com | Iphone2019 |
    Then login should be successfully happen with Map
    And I check title of crmpage with Map
    Then I click on Deal and enter required details with Map
      | Title    | Description  | Probability |
      | crmdeal1 | testpurpose1 |          30 |
      | crmdeal2 | description2 |          50 |
      | crmdeal3 | description3 |          80 |
    Then all details should be stored with Map concept
