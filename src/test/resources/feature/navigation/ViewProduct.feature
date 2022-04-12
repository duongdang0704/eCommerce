Feature: View product details

  Background: Home page
    Given I am on Amazon home page

    Scenario: View a book
      When I select a category "Books"
      And I search a product "Test Expert: Speaking Practice for CELPIP"
      And I click on the best match result
      Then Product details page "Books" display
      And Its details are correct
        | Product Title                              | Price  | Product Overview                                                                                                                                 | Product Details                                                                                                                                                             |  |
        | Test Expert: Speaking Practice for CELPIP® | $19.95 | Written by a test expert with more than 20 years of experience, this book gives you everything you need to raise your speaking score for CELPIP® | Product details\nPublisher : Christien Lee (Nov. 18 2016)\nLanguage : English\nPaperback : 124 pages\nISBN-10 : 0995346712\nISBN-13 : 978-0995346710\nItem weight : 308 g\nDimensions : 21.59 x 0.71 x 27.94 cm |  |

    Scenario: View a household product
      When I select a category "Home & Kitchen"
      And I search a product "Umbra Holster Dish Rack– Molded Plastic Dish Drying Rack with Drainage Spout, Charcoal"
      And I click on the best match result
      Then Product details page "Household" display
      And Its details are correct
        | Product Title                                                                          | Price   | Product Overview                                                                                                                    | Product Details                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      |  |
        | Umbra Holster Dish Rack– Molded Plastic Dish Drying Rack with Drainage Spout, Charcoal | $29\n35 | Colour\tCharcoal\nBrand\tUmbra\nMaterial\tPlastic\nItem Weight\t2 Pounds\nItem dimensions L x W x H\t34.3 x 41.9 x 15.2 centimeters | Product information\nTechnical Details\nItem Weight\t‎2 Pounds\nAssembly required\t‎No\nNumber of pieces\t‎1\nWarranty Description\t‎5 year manufacturer's warranty\nBatteries Required?\t‎No\nIncluded Components\t‎Dish Rack\nAdditional Information\nASIN\tB07454G4LD\nCustomer Reviews\t\n4.5 out of 5 stars\n    831 ratings\n4.5 out of 5 stars\nBest Sellers Rank\t#714 in Tools & Home Improvement (See Top 100 in Tools & Home Improvement)\n#1 in Air Conditioners\n#1 in Metal-Cutting Saws\n#79 in Building Supplies\n\nDate First Available\tDec 10 2017\nManufacturer\tUmbra\nPlace of Business\tSCARBOROUGH, ON, M1S 1B1 CA\nFeedback\nWould you like to tell us about a lower price? |  |
