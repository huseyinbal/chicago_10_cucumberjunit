Feature: Google search feature
@googleSO
  Scenario Outline: Testing google search functionlaity
    Given User is on the homepage of goolge
    When User enters "<searchValue>"
    Then User should see "<searchValue>" in the title

    Examples: Test data for google search functionality

    |searchValue|
    |flowers    |
    |cars       |
    |truck      |