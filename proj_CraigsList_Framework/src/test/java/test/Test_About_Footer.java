package test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import base.TestBase;

public class Test_About_Footer extends TestBase {

	@Test
	void About_Footer_is_Active() {
		boolean about_is_Displayed = isDisplayed(By.linkText(or.getProperty("ABOUT")));
		Assert.assertEquals(about_is_Displayed, true);

		boolean about_is_Enabled = isEnabled(By.linkText(or.getProperty("ABOUT")));
		Assert.assertEquals(about_is_Enabled, true);

		Click(By.linkText(or.getProperty("ABOUT")));
		driver.navigate().back();

		log.debug("Verified About Footer is Active.......... Tracked Project");

	}// About_Footer_is_Active

}// class
