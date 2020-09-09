Feature: It contains add place test cases

  Background: this will before testcase
    Given Before testcase

  @restTest
  Scenario: rest assured
    Given I read test data
    When I send request
    Then I validate response


  @addPlace
  Scenario: Add place testcase
    Given I print hello


  @removePlace
  Scenario: Add place testcase
    Given I remove hello


  Scenario Outline: this is so testcase
    Given I read something "<name>"
    Examples:
      | name |
      | ajay |
      | gopi |

  @dataTable
  Scenario: data table
    Given I pass data through data table
      | name | rank |
      | ajay | 1    |


