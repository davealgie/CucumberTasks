package com.qa.search.steps;

import static org.junit.Assert.assertEquals;

import com.qa.search.hooks.CalculatorHooks;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CalcStepDefinitions {
	
	private Calculator calculator;
	private int num1;
	private int num2;
	private int actualResult;
	
	public CalcStepDefinitions(CalculatorHooks hooks) {
		this.calculator = hooks.getCalc();
	}
	
	@Given("the number {int}")
	public void theNumber(Integer int1) {
		num1 = int1;
	}

	@Given("the second number {int}")
	public void theSecondNumber(Integer int1) {
		num2 = int1;
	}

	@When("the numbers are added")
	public void theNumbersAreAdded() {
		actualResult = calculator.add(num1, num2);
	}

	@Then("the result should be {int}")
	public void theResultShouldBe(int expectedResult) {
		assertEquals(expectedResult, actualResult);
	}

}
