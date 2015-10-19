package com.cengage.qa.assignment.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AwardsGivenPage extends BasePage{

	protected AwardsGivenPage(WebDriver driver) {
		super(driver);
	}
	
    public int countMainTableColumnHeaders() {
    	int count;
    	
    	//count = driver.findElement(By.xpath(".//*[@id='main-content']/table/tbody/tr[*]/td[*]")).size() 
    	//count = tableArticles.getSize().toString();

        count = (driver.findElements(By.xpath("//table/tbody/tr")).size());
    	
    	return count;
    }

	

}
