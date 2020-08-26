package test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import base.TestBase;

public class Test_Feedback_Footer extends TestBase {

	@Test
	void Feedback_Footer_is_Active() {
		boolean feedback_is_Displayed = isDisplayed(By.linkText(or.getProperty("FEEDBACK")));
		Assert.assertEquals(feedback_is_Displayed, true);

		boolean feedback_is_Enabled = isEnabled(By.linkText(or.getProperty("FEEDBACK")));
		Assert.assertEquals(feedback_is_Enabled, true);

		Click(By.linkText(or.getProperty("FEEDBACK")));
		driver.navigate().back();

		log.debug("Verified Feedback Footer is Active");

	}// Feedback_Footer_is_Active

}// class
