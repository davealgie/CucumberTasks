Feature: Subtraction calculator
  Testing if a calculator can succesfully subtract numbers
  
  As a user I want to subtract two numbers together so that I can use the result for further calculations

	Background: Setup calculator: 
		Given a calculator
		
	  Scenario Outline: Floating subtraction
	    And the number <num1>
	    And the second number <num2>
	    When the numbers are subtracted
	    Then the result should be <result>
	    
	    Examples: values
	    |num1|num2|result|
	    |7   |4   |3     |
	    |2   |8   |-6    |
	    |10.3|4.1 |6.2   |
	    |-3.4|-1.3|-2.1  |
	    
	    
	  #Can have another scenario/scenario outline here



