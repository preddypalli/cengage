package com.cengage.qa.assignment.smoketests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import com.cengage.qa.assignment.pages.AwardsGivenPage;
import com.cengage.qa.assignment.pages.AwardsRewardedPage;
import com.cengage.qa.assignment.pages.HomePage;

public class AwardsReceivedPageTest {

	protected AwardsRewardedPage awardsRewardedPage;
	protected HomePage homePage;
	protected AwardsGivenPage awardsGivenPage;

	@Before
	public void setUp() {
		homePage = new HomePage();
		awardsRewardedPage = homePage.gotoAwardsReceivedPage();
	}

	@After
	public void tearDown() {
		homePage.closeSession();
	}

	//@Test
	public void verifyAwardsReceivedPageDisplayed() {
		assertThat(awardsRewardedPage.getTitle(),
				is("Awards Received | Cengage Learning"));
	}

	//@Test
	public void verifyAwardsGivenTabIsProvidedAndReturnsExpectedPage() {
		awardsGivenPage = homePage.gotoAwardsGivenPage();
		assertThat(awardsGivenPage.getTitle(),
				is("Awards Given | Cengage Learning"));
	}

	@Test
	public void verifyNumberOfColumnsInAwardsGivenTable() {
		awardsGivenPage = homePage.gotoAwardsGivenPage();
		assertEquals(6, awardsGivenPage.countMainTableColumnHeaders());

	}

}
