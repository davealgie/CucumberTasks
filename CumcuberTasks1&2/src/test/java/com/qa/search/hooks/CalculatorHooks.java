package com.qa.search.hooks;

import com.qa.search.steps.Calculator;

import io.cucumber.java.Before;

public class CalculatorHooks {
	
	private Calculator calculator;
	
	@Before("@Calculator")
	public void setup() {
		this.calculator = new Calculator();
	}
	
	public Calculator getCalc() {
		return this.calculator;
	}

}
