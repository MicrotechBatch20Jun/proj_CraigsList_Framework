package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import base.TestBase;

public class Test_Gallery_Menu extends TestBase {

	@BeforeMethod
	static void Search_Furniture() {
		SendKeys(By.xpath(or.getProperty("SEARCH_FURNITURE")), ("Furniture"));
		pressEnter(By.xpath(or.getProperty("SEARCH_FURNITURE")), (Keys.ENTER));

		log.debug("Furniture clicked");
	}

	@Test
	void Gallery_Menu_is_Active() {
		Click(By.xpath(or.getProperty("GALLERY_MENU_CLICK")));

		boolean Gallery_Menu_is_Displayed = isDisplayed(By.xpath(or.getProperty("GALLERY_MENU_LIST")));
		Assert.assertEquals(Gallery_Menu_is_Displayed, true);

		boolean Gallery_Menu_is_Enabled = isEnabled(By.xpath(or.getProperty("GALLERY_MENU_LIST")));
		Assert.assertEquals(Gallery_Menu_is_Enabled, true);

		log.debug("Verified Gallery Menu is Active");

	}//Gallery_Menu_is_Active

}// class
