Feature: Delivery location input feature
  As a user I should be able to select my own delivery location


  @delivery-location
  Scenario Outline: I want to select my own delivery location
    Given I have swiggy application in my phone
    And I want to enter my location manually
    And I enter my location as <location> in the input box and select the appropriate location
    Then I choose a restaurant of my choice and click on it

    Examples:
      | location    |
      | aecs layout |


