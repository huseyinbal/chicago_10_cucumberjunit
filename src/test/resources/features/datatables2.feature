Feature: Testing datatables website
  @datatables2
  Scenario: Testing adding new employee to the table
    Given User is on the datatables homepage
    And User clickes to New Button
    Then User should see Create New Entry Box
    And User should enter firstname "John"
    And User should enter lastname "Wick"
    And User should enter position "retired assasin"
    And User should enter office
    And User should enter extension
    And User should enter start date
    And User should enter salary
    Then User should click to create button
    And User enters first name "John" to search box
    Then User should see first name is inserted in the table