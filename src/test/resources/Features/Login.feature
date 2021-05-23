Feature: feature to test login functionality

  Scenario: user can login to site with valid username and paasword
    Given user is in login screen
    When user enter valid <username> and <password>
    And click entre
    Then home page should get displayed
