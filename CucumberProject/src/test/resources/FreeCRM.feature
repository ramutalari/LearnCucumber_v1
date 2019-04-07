Feature: Test the FreeCRM

  Scenario Outline: freeCRM webpage testing
    Given I am on freecrm webpage
   When I enter valid "<username>" and "<password>"
    Then login should be successful
    And I check title of crm homepage
    Then I enter "<firstname>" and "<lastname>" and "<description>"
    Then all details stored

    #To achieve data driven framework with Examples keyword
    Examples: 
      | username          | password   | firstname | lastname | description |
      | ramu.t9@gmail.com | Iphone2019 | robin     | utappa   | KKR         |
      | ramu.t9@gmail.com | Iphone2019 | NITEESH   | RANA     | KKR         |
