Feature: Xchange smoke test

Scenario: Verify if search property is giving valid result

   Given I login Xchange			

   When I search for property		

   Then I should get a search result