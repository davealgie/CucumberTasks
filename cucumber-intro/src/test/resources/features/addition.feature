Feature: Calculator addition
  Testing if a calculator can succesfully add numbers
  
  As a user I want to add two numbers together so that I can use the result for further calculations
	Background: Setup calculator: 
		Given a calculator
		
	  Scenario Outline: Floating addition
	    And the number <num1>
	    And the second number <num2>
	    When the numbers are added
	    Then the result should be <result>
	    
	    Examples: values
	    |num1|num2|result|
	    |7.1 |4.4 |11.5  |
	    |21  |5   |26    |
	    |1000000.3|1000000.1|2000000.4|
	    |-6.3|-2  |-8.3  |
	    
  

