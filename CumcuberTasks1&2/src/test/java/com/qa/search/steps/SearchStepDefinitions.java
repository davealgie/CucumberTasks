package com.qa.search.steps;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.qa.search.hooks.SeleniumHooks;
import com.qa.search.page.BingPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class SearchStepDefinitions {
	
	private WebDriver driver;
	private BingPage page;
	

	
	
	public SearchStepDefinitions(SeleniumHooks hooks) {
		this.driver = hooks.getDriver();
		this.page = PageFactory.initElements(driver, BingPage.class);
	}
	
	
	@When("I request bing")
	public void iRequestBing() {
		driver.get("https://www.bing.com");
	}
	
	@When("I type {string} into the search bar")
	public void iTypeIntoTheSearchBar(String string) {
		page.search(string);
	}

	@When("I click search")
	public void iClickSearch() {
		page.clickBtn();
	}

	@Then("the results page should feature {string}")
	public void theResultsPageShouldFeature(String string) {
		assertEquals(string + " - Bing", driver.getTitle());
	}

}
