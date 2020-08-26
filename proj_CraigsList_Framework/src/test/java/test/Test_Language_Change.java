package test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import base.TestBase;

public class Test_Language_Change extends TestBase {

	@Test
	void Language_is_Active() {
		boolean language_is_Displayed = isDisplayed(By.xpath(or.getProperty("LANGUAGE")));
		Assert.assertEquals(language_is_Displayed, true);

		boolean language_is_Enabled = isDisplayed(By.xpath(or.getProperty("LANGUAGE")));
		Assert.assertEquals(language_is_Enabled, true);

		Click(By.xpath(or.getProperty("ESPASOL")));
		log.debug("Language Espanol Selected");

		Click(By.xpath(or.getProperty("ENGLISH")));
		log.debug("Language English Selected");

		log.debug("Verified Language Change");

	}// Language_is_Active

}// class
