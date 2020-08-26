package test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;

public class Test_Safety_Footer extends TestBase {

	@Test
	void Safety_Footer_is_Active() {
		boolean safety_is_Displayed = isDisplayed(By.linkText(or.getProperty("SAFETY")));
		Assert.assertEquals(safety_is_Displayed, true);

		boolean safety_is_Enabled = isEnabled(By.linkText(or.getProperty("SAFETY")));
		Assert.assertEquals(safety_is_Enabled, true);

		Click(By.linkText(or.getProperty("SAFETY")));
		driver.navigate().back();

		log.debug("Verified Safety Footer is Active");

	}//Safety_Footer_is_Active

}// class
