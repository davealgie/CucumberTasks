package com.qa.search.page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BingPage {
	
	public final String url = "https://www.bing.com/";
	
	@FindBy(id="sb_form_q")
	public WebElement searchBox;
	
	
	//this doesn't seem to want to work, pressing enter instead
	@FindBy(xpath="//*[@id=\"search_icon\"]/svg/circle")
	public WebElement searchButton;
	
	public void search(String input) {
		searchBox.sendKeys(input);
	}
	
	public void clickBtn() {
		searchBox.sendKeys(Keys.ENTER);
	}

}
