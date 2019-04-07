Feature: New User Registration


  Scenario: To SignUp gmail registration
    Given I am on user registration page
    When I enter valid data on the page
      | Fields    | Value               |
      | FirstName | Mukund              |
      | LastName  | Kalam               |
      | UserName  | mukund324@gmail.com |
      | Password  | abck890876          |
      | Confirm   | abck890876          |
    Then the user registration should be successful