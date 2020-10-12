@Test4
  Feature: Add to cart button on all product for Laptops Netbooks

    Scenario: User able to see add to cart button on all product
    So,User should be able to add product to cart
      Given User is on Home Page
      When User click on show Laptops & Netbooks category page
      And User can see all Add to cart button on all laptops product
      And User can able to click on add to cart button for selected
      Then User can able to add product to cart successfully