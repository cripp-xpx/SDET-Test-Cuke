Feature: Header Links

  Scenario Outline: Test that the header links go to the right pages
    Given I start on the Xpanxion Home Page
    When I click on the header "<HeaderLink>"
    Then I should be on the "<ExpectedPage>"
    Examples:
      | HeaderLink    | ExpectedPage  |
      | whatWeDoLink  | whatWeDoPage  |
      | ourWorkLink   | ourWorkPage   |
      | whoWeAreLink  | whoWeArePage  |
      | careersLink   | careersPage   |
      | contactUsLink | contactUsPage |