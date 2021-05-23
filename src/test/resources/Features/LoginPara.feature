Feature: Test Login functionality

  Scenario Outline: check Login was succesful with valid username and paasssword
    Given browser is open
    And user is in login page
    When user enter  <username> and <password>
    And click on login
    Then home page should get displayed
    Examples:
      | username | password |
      | Gyana    |    12345 |
      | Raja     |    12345 |
      | Bhai     |    12345 |
