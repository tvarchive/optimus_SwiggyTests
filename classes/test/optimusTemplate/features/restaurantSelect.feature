Feature: Selection of restaurant
  As a user,I want to select the restaurant and food of my choice

  Background: Set delivery location
    Given I have swiggy application in my phone
    And I want to enter my location manually
    And I enter my location as Indiranagar in the input box and select the appropriate location
    Then restaurant

  @restaurant-selection
  Scenario: I want to be able to select a restaurant of my choice
    Given I choose a restaurant
    And I buy some items and checkout
    When  I login as a valid registered user
    Then I should be able to see my saved delivery location and proceed to payment

  @login-first-select-food-with-filter
  Scenario Outline: I login first,apply a filter and select a restaurant
  and then choose a food of my choice
    And I tap on account button and then tap on login
    And I enter my phone number as <phoneNumber> and password as <password> and sign in
    Then I am logged in and I tap on restaurant
    And I tap on filters,select relevant filters and then click on apply filters

    Examples:
      | phoneNumber | password |
      | 7204515609  | dcba4321 |