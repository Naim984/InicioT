Feature: Login to the website to buy products
  Scenario: User not registered on the website
    Given  The user is on the website and wants to register
    When  Enter the login section of the website
    And select register new user
    And  Fill in the necessary fields for a successful registration
    Then DASHBOARD is shown
    And validate that the page title is correct

    Scenario: User with previous registration and proceed to login
      Given the user enters the website and wants to login with their credentials
      When Enter the login section of the website and want to login
      And select login section
      And Email and password
      Then DASHBOARD is shown with the user's data and all their previous purchase record
      And validate that it correctly displays the username



