package Pages;

import Base.BasePage;

public class UtilPage extends BasePage {

    private String careersPage = "https://www.xpanxion.com/careers/";
    private String contactUsPage = "https://www.xpanxion.com/contact/";
    private String ourWorkPage = "https://www.xpanxion.com/case-studies/";
    private String whatWeDoPage = "https://www.xpanxion.com/services/";
    private String whoWeArePage = "https://www.xpanxion.com/about-us/";
    private String conceptDesignAndPrototypingPage = "https://www.xpanxion.com/services/concept-design-prototyping/";
    private String productAndSoftwareEngineeringPage = "https://www.xpanxion.com/services/product-software-engineering/";
    private String assuranceServicesPage = "https://www.xpanxion.com/services/assurance-services/";
    private String digitalSolutionsPage = "https://www.xpanxion.com/services/digital-solutions/";

    public String returnExpectedUrlFromString(String pageName) {

        String expectedUrl = "https://www.xpanxion.com";

        switch (pageName) {
            case "careersPage":
                expectedUrl = careersPage;
                break;

            case "contactUsPage":
                expectedUrl = contactUsPage;
                break;

            case "ourWorkPage":
                expectedUrl = ourWorkPage;
                break;

            case "whatWeDoPage":
                expectedUrl = whatWeDoPage;
                break;

            case "whoWeArePage":
                expectedUrl = whoWeArePage;
                break;

            case "conceptDesignAndPrototypingPage":
                expectedUrl = conceptDesignAndPrototypingPage;
                break;

            case "productAndSoftwareEngineeringPage":
                expectedUrl = productAndSoftwareEngineeringPage;
                break;

            case "assuranceServicesPage":
                expectedUrl = assuranceServicesPage;
                break;

            case "digitalSolutionsPage":
                expectedUrl = digitalSolutionsPage;
                break;
        }
        return expectedUrl;
    }

}
