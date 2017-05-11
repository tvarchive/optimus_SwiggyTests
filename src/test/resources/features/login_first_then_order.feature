Feature: Selection of restaurant and food item by user

  As a user,I want to select a restaurant and choose a food item of my choice.
  I want to be able to select an appropriate address for delivery and then proceed to
  payment.

  Background:
    Given I have chosen to order some food online and I provide my location for delivery as Rajajinagar

  @login-first-select-food-with-filter
  Scenario Outline: I login first,apply a filter, select a restaurant
  and then choose a food of my choice
    When I login as a valid registered user with phone number as <phoneNumber> and password as <password>
    And I apply filters and select a restaurant of my choice
    And I buy some items and proceed to checkout
    Then I should be able to select my address and proceed to payment

    Examples:
      | phoneNumber | password |
      | 7204515609  | dcba4321 |