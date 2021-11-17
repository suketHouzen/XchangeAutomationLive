Feature: Xchange smoke test

@smokeTest 
Scenario: Verify if search property is giving valid result

   Given I login Xchange			

   When I search for property		

   Then I should get a search result
   
   And I click on price of the property
   
   
    @smokeTest @price
  Scenario: Verify if property price is giving valid result
    Given I login Xchange
    Then I click on price of the property
    Then I should get the same price result in new tab
