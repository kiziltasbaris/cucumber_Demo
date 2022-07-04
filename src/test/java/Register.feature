Feature: Register Test
  Scenario Outline: Create An account

    Given  Navigate to Website
    And  click sign in button
    And type to Email "<Email>"
    And click on Create an Account button
    And choose title
    And type firstName "<firstName>" and lastName "<LastName>"
    And type password "<Password>"
    And type Company "<Company>"
    And type address "<address>"
    Examples:
      | Email | firstName | LastName | Password | Company | address |

      |kizilbaris7@gmail.com|baris|kiziltas  |1234  |  renastech   |toronto|
      |borklu@gmail.com|omer|borklu  |532346 |  technoStudy   |ottowa|
      |borkluuu@gmail.com|omfer|borklf  |532346 |  tecshnoStudy   |Montreal|


