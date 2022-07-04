Feature: Login Test

  Scenario: Go to amazon website and test login page

    Given Go to Amazon website
    And  click to login button
    And  enter to name
    And  enter to password
    When when you click to submit button
    Then verify to success messag