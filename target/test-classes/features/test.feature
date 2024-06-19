#Author: Hushin

@Completed_test
Feature: I am testing the inventory billiard page 

  @Login
  Scenario Outline: I am verify the login
    Given Start invetory page
    When I enter the user <user> and the password <password>
    And I press the login button
    Then I validate the successful login with the user <user>

    Examples: 
      |user				|password		|
      |"Roy"			|"Prueba1234*"  |
      |"Thocego"	    |"Prueba1234"	|

  @Login
  Scenario: I am verify the login
    Given Start invetory page
    When The user admin log into the app
    Then I validate the successful admin login

  @Login
  Scenario: I am verify the login
    Given Start invetory page
    When The user cash log into the app
    Then I validate the successful cash login

