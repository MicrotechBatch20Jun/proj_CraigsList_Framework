package test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import base.TestBase;

public class Test_Search_Box extends TestBase {

	@Test
	void Search_Box_is_Active() {
		boolean search_box_is_Displayed = isDisplayed(By.xpath(or.getProperty("SEARCH_BOX")));
		Assert.assertEquals(search_box_is_Displayed, true);

		boolean search_box_is_Enabled = isEnabled(By.xpath(or.getProperty("SEARCH_BOX")));
		Assert.assertEquals(search_box_is_Enabled, true);

		log.debug("Verified Search Box is Active");

	}// Search_box_is_Active

}// class
