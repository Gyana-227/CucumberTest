Feature: verify use shoul able to search

  Scenario: Test search functionality of google
    Given Browser is open
    And user is in google search page
    When user enter text in search box
    And hits enter
    Then search result should get displayed
