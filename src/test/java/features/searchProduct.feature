Feature: Search and place the order

  @kart
  Scenario: Search experience for product search in both home and offer page
    Given User is on GreenCart landing page
    When user search with shortname Tom and extracted actual name or the product
    Then user searched for Tom shortname in offer page
    And Validate product name is matched in home page and offer page

  @context
  Scenario: ContextSetup
    And I set traceId as "abc"
    Then I access traceId in other page

  @kartSO
  Scenario Outline: Search experience for product search in both home and offer page
    Given User is on GreenCart landing page
    When user search with shortname <Name> and extracted actual name or the product
    Then user searched for <Name> shortname in offer page
    And Validate product name is matched in home page and offer page
    

    Examples: 
      | Name |
      | Tom  |
      | Beet |
