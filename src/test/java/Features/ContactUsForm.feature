Feature: Contact us form

  Scenario: Error message should be shown when form is not filled out completely
    Given I am on the Contact Us Page
    When I press Submit on an empty form
    Then An error message should be shown

  Scenario: Missing fields should be highlighted in red when the form is not filled out completely
    Given I am on the Contact Us Page
    When I press Submit on an empty form
    Then The form label Name should be colored Dark Red

    Scenario: blah
      Given anewthing