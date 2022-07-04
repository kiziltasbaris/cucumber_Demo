Feature: Contact us test

  Scenario: Go to website and test contact us page

    Given navigate to Website
    And click on contact us button
    And select subject heading
    And type Email
    And type order reference
    And type a message3
    When click on send button
    Then verify  success message