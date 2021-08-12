package com.qa.cucumber.calculator;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CalculatorStepDefinitions {
	
	private float num1;
	private float num2;
	private float actualResult;
	private Calculator calculator;
	
	@Given("a calculator")
	public void aCalculator() {
		this.calculator = new Calculator();
	}

	@Given("the number {float}")
	public void theNumber(float float1) {
		this.num1=float1;
	}

	@Given("the second number {float}")
	public void theSecondNumber(float float1) {
		this.num2=float1;
	}

	@When("the numbers are added")
	public void theNumbersAreAdded() {
		this.actualResult=this.calculator.add(num1,num2);
	}
	
	@When("the numbers are subtracted")
	public void theNumbersAreSubtracted() {
		this.actualResult=this.calculator.subtract(num1,num2);
	}
	
	@When("the numbers are multiplied")
	public void theNumbersAreMultiplied() {
		this.actualResult=this.calculator.multiply(num1,num2);
	}
	
	@When("the numbers are divided")
	public void theNumbersAreDivided() {
		this.actualResult=this.calculator.divide(num1,num2);
	}

	@Then("the result should be {float}")
	public void theResultShouldBe(float expectedResult) {
		assertEquals(expectedResult,actualResult,Math.abs(expectedResult/1000));
	}
	


}
