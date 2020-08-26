package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;

public class Test_Newest_Menu extends TestBase {

	@BeforeMethod
	static void Search_Furniture() {
		SendKeys(By.xpath(or.getProperty("SEARCH_FURNITURE")), ("Furniture"));
		pressEnter(By.xpath(or.getProperty("SEARCH_FURNITURE")), (Keys.ENTER));
		log.debug("Furniture clicked");

	}

	@Test
	void Newest_Menu_is_Active() {
		Click(By.xpath(or.getProperty("NEWEST_MENU_CLICK")));

		boolean Newest_Menu_is_Displayed = isDisplayed(By.xpath(or.getProperty("NEWEST_MENU_LIST")));
		Assert.assertEquals(Newest_Menu_is_Displayed, true);

		boolean Newest_Menu_is_Enabled = isEnabled(By.xpath(or.getProperty("NEWEST_MENU_LIST")));
		Assert.assertEquals(Newest_Menu_is_Enabled, true);

		log.debug("Verified Newest Menu is Active");

	}//Newest_Menu_is_Active

}// class
