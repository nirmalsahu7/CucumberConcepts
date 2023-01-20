Feature: Checkout and place the order



  @checkout
  Scenario Outline: Search experience for product search in both home and offer page
    Given User is on GreenCart landing page
    When user search with shortname <Name> and extracted actual name or the product
    And Added "3" items of selected product to cart
    Then user proceed to Checkout and validate the <Name> items in checkout page
    And verify user has ability to enter promo code and place the order



    Examples: 
      | Name |
      | Tom  |
      | Beet |
