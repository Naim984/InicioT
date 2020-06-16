Feature: Have a page with mobile phones available for purchase
  Scenario: Person interested in buying a mobile and wants to see the offers
    Given I navigate to the home page and verify your title
    When   Enter the mobile page
    And enter the offers section to see the available mobiles
    Then The available mobile offers are shown