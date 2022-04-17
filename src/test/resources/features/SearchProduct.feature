Feature: Search product

  Background: Home page
    Given I am on Amazon home page

  Scenario: Search a product
    When I search a product "dell laptop"
    Then Search results display "\"dell laptop\""

  Scenario: Search a product in category
    When I select a category "Books"
    And I search a product "Celpip"
    Then Search results display "\"Celpip\""