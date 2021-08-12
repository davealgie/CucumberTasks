@Search
Feature: Bing search
  I want to search bing for results so that I can use those results


  Scenario Outline: Search
    When I request bing
    And I type <input> into the search bar
    And I click search
		Then the results page should feature <input>
		
		Examples:
			| input   |
			| "doge"  |
			| "cat"   |
			| "lorry" |


