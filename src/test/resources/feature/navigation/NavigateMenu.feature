@navigation
Feature: Navigation

  Background: Home page
    Given I am on Amazon home page

    Scenario Outline: View trending
      When I click Left menu icon
      And I click on category "<Category>"
      Then Products page displays banner "<Banner>"
      And The page title is correct "<Title>"
      Examples:
        | Category         | Banner                  | Title                                                                                       |  |
        | Best Sellers     | Amazon Best Sellers     | Amazon.ca Best Sellers: The most popular items on Amazon                                    |  |
        | New Releases     | Amazon Hot New Releases | Amazon.ca Hot New Releases: The bestselling new & future releases on Amazon                 |  |
        | Movers & Shakers | Amazon Movers & Shakers | Amazon.ca Movers & Shakers: The biggest gainers in Amazon sales rank over the past 24 hours |  |

  Scenario Outline: View shop by department
    When I click Left menu icon
    And I click on category "<Category>" and sub category "<SubCategory>"
    Then The page title is correct "<Title>"
    And The department is highlighted correctly "<Department Highlighted>"
    Examples:
      | Category         | SubCategory | Title                                 | Department Highlighted |
      | Alexa Smart Home | Kitchen     | Amazon.ca: Kitchen: Amazon Smart Home | Smart Home: Kitchen    |