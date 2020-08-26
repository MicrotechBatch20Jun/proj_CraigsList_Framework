package test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import base.TestBase;

public class Test_Privacy_Footer extends TestBase {

	@Test
	void Privacy_Footer_is_Active() {
		boolean privacy_is_Displayed = isDisplayed(By.linkText(or.getProperty("PRIVACY")));
		Assert.assertEquals(privacy_is_Displayed, true);

		boolean privacy_is_Enabled = isEnabled(By.linkText(or.getProperty("PRIVACY")));
		Assert.assertEquals(privacy_is_Enabled, true);

		Click(By.linkText(or.getProperty("PRIVACY")));
		driver.navigate().back();

		log.debug("Verified Privacy Footer is Active");

	}// Privacy_Footer_is_Active

}// class
