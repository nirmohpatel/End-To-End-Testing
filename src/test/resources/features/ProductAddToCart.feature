@Test2
  Feature: Product Add To Cart Successfully
    Scenario: User should be able to add product to cart successfully
      Given User is on homepage
      When User click on HTC Touch HD add to cart button
      And User click on iphone add to cart button
      Then User should be able to add product to cart successfully