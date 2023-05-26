#Author: Hushin

@Completed_test
Feature: Title of your feature
  I want to use this template for my feature file

  @Test_1
  Scenario Outline: Test Automation 1
    Given I want to write a step with precondition
    And some other precondition
    When I complete action
    And some other action
    And yet another action
    Then I validate the outcomes
    And check more outcomes

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |

