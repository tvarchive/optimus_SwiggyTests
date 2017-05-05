Feature: Selection of restaurant
  As a user,I want to select the restaurant of my choice

  Background: Set delivery location
    Given I have swiggy application in my phone
    And I want to enter my location manually
    And I enter my location as AECS layout in the input box and select the appropriate location

  @restaurant-selection
  Scenario: I want to be able to select a restaurant of my choice
    When I choose a restaurant of my choice and click on it
    And I choose a food item and click on checkout
    And I accept delivery fee and then click on login button
    And I enter my phone number as 7204515609 and password as dcba4321 and login