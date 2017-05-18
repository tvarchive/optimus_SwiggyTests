Feature: Buying food and proceeding to payment

  As a customer
  I want to select a restaurant
  then select my address and proceed to payment

  Background:
    Given I have chosen to order some food online and I provide my location for delivery as Rajajinagar

  @login-first-select-food-with-filter
  Scenario: Registered user tries to order and proceed till payment
    Given I login as a valid registered user with phone 7204515609 and password dcba4321
    And I apply filters and select a restaurant of my choice
    When I buy some items and proceed to checkout
    Then I should be able to select my address and proceed to payment

   

