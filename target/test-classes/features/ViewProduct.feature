Feature: View product details

  Background: Home page
    Given I am on Amazon home page

    Scenario: View a book
      When I select a category "Books"
      And I search a product "Test Expert: Speaking Practice for CELPIP"
      And I click on the best match result product type "Book"
      Then Product details page display
      And Its details are correct
        | Product Title                              | Price  | Product Overview                                                                                                                                 | Product Details                                                                                                                                                             |  |
        | Test Expert: Speaking Practice for CELPIP® | $19.95 | Written by a test expert with more than 20 years of experience, this book gives you everything you need to raise your speaking score for CELPIP® | Product details\nPublisher : Christien Lee (Nov. 18 2016)\nLanguage : English\nPaperback : 124 pages\nISBN-10 : 0995346712\nISBN-13 : 978-0995346710\nItem weight : 308 g\nDimensions : 21.59 x 0.71 x 27.94 cm |  |

    Scenario: View a household product
      When I select a category "Home & Kitchen"
      And I search a product "Dish Drying Rack"
      And I click on the best match result product type "Household"
      Then Product details page display
      And Its details are correct
        | Product Title                                            | Price  | Product Overview                                                                                                                              | Product Details                                                                                                                                                                                                                 |  |
        | SimpleHouseware Dish Drying Rack with Drainboard, Chrome | $36.87 | Colour Chrome\nBrand SIMPLE HOUSEWARE\nMaterial Metal\nItem dimensions L x W x H 45.1 x 27.9 x 33 centimeters\nMounting type Countertop Mount | Product information\nTechnical Details\nBrand SIMPLE HOUSEWARE\nModel Number CO-028-1\nColor Chrome\nProduct Dimensions 45.09 x 27.94 x 33.02 cm; 1.83 Kilograms\nMaterial Metal\nItem Weight 1.83 kg\nAdditional Information\nASIN B07NPVRBL6 |  |
