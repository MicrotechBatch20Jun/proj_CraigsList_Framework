package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import base.TestBase;

public class Test_Pagination extends TestBase {

	@BeforeMethod
	static void Search_Furniture() {
		SendKeys(By.xpath(or.getProperty("SEARCH_FURNITURE")), ("Furniture"));
		pressEnter(By.xpath(or.getProperty("SEARCH_FURNITURE")), (Keys.ENTER));
		log.debug("Furniture clicked");

	}

	@Test
	void Pagination_is_Active() {
		boolean back_Arrow_is_Displayed = isDisplayed(By.xpath(or.getProperty("BACK_ARROW")));
		Assert.assertEquals(back_Arrow_is_Displayed, true);

		boolean back_Arrow_is_Enabled = isEnabled(By.xpath(or.getProperty("BACK_ARROW")));
		Assert.assertEquals(back_Arrow_is_Enabled, true);

		boolean page_number_is_Displayed = isDisplayed(By.xpath(or.getProperty("PAGE_NUMBER")));
		Assert.assertEquals(page_number_is_Displayed, true);

		boolean page_number_is_Enabled = isEnabled(By.xpath(or.getProperty("PAGE_NUMBER")));
		Assert.assertEquals(page_number_is_Enabled, true);

		boolean next_Arrow_is_Displayed = isDisplayed(By.linkText(or.getProperty("NEXT_ARROW")));
		Assert.assertEquals(next_Arrow_is_Displayed, true);

		boolean next_Arrow_is_Enabled = isEnabled(By.linkText(or.getProperty("NEXT_ARROW")));
		Assert.assertEquals(next_Arrow_is_Enabled, true);

		log.debug("Verified Pagination is displayed");

	}//Pagination_is_Active

}// class
