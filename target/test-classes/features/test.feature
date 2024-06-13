#Author: Hushin

@Completed_test
Feature: I am testing the inventory billiard page 

  @Test_1
  Scenario Outline: I am verify the login
    Given Start invetory page
    When I enter the user <user> and the password <password>
    And I press the login button
    Then I validate the succesful login with the user <user>

    Examples: 
      |user				|password		|
      |"Roy"			|"Prueba1234*"  |
      |"Thocego"	    |"Prueba1234"	|

