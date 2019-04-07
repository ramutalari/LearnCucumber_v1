Feature: Proof of Concept that my framework works

  Scenario: My first test
    Given I am on toolsqa website
    When I enter firstname and lastname
    Then firstname and lastname should be displayed

  Scenario: My second test
  	Given I am on toolsqa website
    When I click on the LinkTest link
    Then I should be on the Automation Practice Table form