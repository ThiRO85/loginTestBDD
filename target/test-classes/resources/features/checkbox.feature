@Login
Feature: Test the login functionality on the Infojobs Page

  Scenario: the user should be able to register their data
    Given user is on the Infojobs page
    When user clicks on the cookie button
    And user enters their correct data
    And user clicks submit button
    Then user gets confirmation

  Scenario Outline: the user should be able to register their data
    Given user is on the Infojobs page
    When user clicks on the cookie button
    And user enters name <username>
    And user enters email <email>
    And user enters password <password>
    And user enters address <address>
    And user enters function <function>
    And user clicks submit button
    Then user gets confirmation

    Examples:
      | username   | email             | password | address   | function  |
      | Mary Smith | mary@testmail.com | marypass | 06045-360 | developer |
      | Alex Green | alex@testmail.com | alexpass | 06045-370 | engineer  |
      | John Silva | john@testmail.com | johnpass | 06045-380 | doctor    |