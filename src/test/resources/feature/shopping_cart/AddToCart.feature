Feature: Add product to cart

  Background: Select 1 product
    Given I am on Amazon home page
    And I select a category "Books"
    And I search a product "Test Expert: Speaking Practice for CELPIP"
    And I click on the best match result "Test Expert: Speaking Practice for CELPIP"

  Scenario: Add 1 single product to category
    When I click Add to Cart
    Then Message "Added to Cart" notify added to cart
    And I go to cart
    Then Item name, quantity are correct
    And Amount is correct