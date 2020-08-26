package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import base.TestBase;

public class Test_Search_Item_Page extends TestBase {

	@BeforeMethod
	static void Search_Furniture() {
		SendKeys(By.xpath(or.getProperty("SEARCH_FURNITURE")), ("Furniture"));
		pressEnter(By.xpath(or.getProperty("SEARCH_FURNITURE")), (Keys.ENTER));
	}

	@Test
	void Searched_Item_Elements_is_Active() {
		Click(By.xpath(or.getProperty("ITEM_CLICKED")));

		boolean favorite_icon_is_Displayed = isDisplayed(By.xpath(or.getProperty("FAVORITE_ICON")));
		Assert.assertEquals(favorite_icon_is_Displayed, true);

		boolean favorite_icon_is_Enabled = isEnabled(By.xpath(or.getProperty("FAVORITE_ICON")));
		Assert.assertEquals(favorite_icon_is_Enabled, true);

		log.debug("Verified Favorite Icon is Active");

		boolean hide_icon_is_Displayed = isDisplayed(By.xpath(or.getProperty("HIDE_ICON")));
		Assert.assertEquals(hide_icon_is_Displayed, true);

		boolean hide_icon_is_Enabled = isEnabled(By.xpath(or.getProperty("HIDE_ICON")));
		Assert.assertEquals(hide_icon_is_Enabled, true);

		log.debug("Verified Hide Icon is Active");

		boolean flag_icon_is_Displayed = isDisplayed(By.xpath(or.getProperty("FLAG_ICON")));
		Assert.assertEquals(flag_icon_is_Displayed, true);

		boolean flag_icon_is_Enabled = isEnabled(By.xpath(or.getProperty("FLAG_ICON")));
		Assert.assertEquals(flag_icon_is_Enabled, true);

		log.debug("Verified Flag Icon is Active");

		boolean map_is_Displayed = isDisplayed(By.xpath(or.getProperty("MAP")));
		Assert.assertEquals(map_is_Displayed, true);

		boolean map_is_Enabled = isEnabled(By.xpath(or.getProperty("MAP")));
		Assert.assertEquals(map_is_Enabled, true);

		log.debug("Verified Map is Active");

	}// Searched_Item_Elements_is_Active

}// class
