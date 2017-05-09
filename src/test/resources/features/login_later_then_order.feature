Feature: Selection of restaurant
  As a user,I want to select a restaurant and food items of my choice

  Background:
    Given I have chosen to order some food online and I provide my location for delivery as Indiranagar
    And I choose a restaurant

  @restaurant-selection
  Scenario Outline: I want to be able to select a food item of my choice
    And I buy some items and proceed to checkout
    When I login as a valid registered user with phone number as <phoneNumber> and password as <password>
    Then I should be able to see my saved delivery location and proceed to payment

    Examples:
      | phoneNumber | password |
      | 7204515609  | dcba4321 |