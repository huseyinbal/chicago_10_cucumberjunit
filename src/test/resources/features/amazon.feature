@amazons
Feature: Amazon search

  Scenario: Amazon search test
    Given User is on the Amazon homepage
    When User enters headphones keyword
    And User clicks to search button
    Then User should see headphones in results