Feature: Xchange smoke test

   @smokeTest 
   Scenario: Verify if search property is giving valid result
   Given I login Xchange			
   When I search for property		
   Then I should got the fifth property
   Then I should get a search result
   
   
    @price 
    Scenario: Verify if property price is giving valid result
    Given I login Xchange
    Then I click on price of the property
    Then I should get the same price result in new tab
    
    @commission
    Scenario: Verify if commission percentage is giving valid result
     Given I login Xchange
     Then I click on commission of the property
     Then I should get the same commission result in new tab
   
    @bedanddays
    Scenario: Verify if bed and days filter is working
    Given I login Xchange
    And I can select no of beds with days
    
    
    @actions 
    Scenario: Verify if actions are working
    Given I login Xchange
    Then I can view details in actions
    Then I can book a viewing in actions
    
    @requestproperty
    Scenario: Verify if requestproperty is working fine
     Given I login Xchange
     And I can request a property and cancel it
     
     @offers
     Scenario: Verify if offers is working fine
     Given I login Xchange
     And I click on Instructions lettings
     
     @portfolio
     Scenario: Verify if portfolio is working fine
     Given I login Xchange
     When I click on add property 
     
     @help
     Scenario: Verify if help section is working fine
     Given I login Xchange
     Then I click on help button
     
     
    
    
  