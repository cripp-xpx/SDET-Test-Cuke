Feature: Footer Links

  Scenario Outline: Test that the footer links go to the right pages
    Given I start on the Xpanxion Home Page
    When I click on the footer "<FooterLink>"
    Then I should be on the "<ExpectedPage>"
    Examples:
      | FooterLink                        | ExpectedPage                      |
      | whatWeDoLink                      | whatWeDoPage                      |
      | conceptDesignAndPrototypingLink   | conceptDesignAndPrototypingPage   |
      | productAndSoftwareEngineeringLink | productAndSoftwareEngineeringPage |
      | assuranceServicesLink             | assuranceServicesPage             |
      | digitalSolutionsLink              | digitalSolutionsPage              |