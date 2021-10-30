Feature: AI valuation of properties

	@Register @One	
	Scenario: Verify if user is able to valuate the property using Zoopla link
		Given I take a new sales property URL from Zoopla 
		And I go to AI valuation page
		When I provide Zoopla link for valuation
		Then I should get AI valuation for the property
		
		@Register @Two
		Scenario: Verify if user is able to search ptoperties
		Given I Launch the Landing page
		When I give location Mortgare and yeild
		Then I should get a search result
		
		
	