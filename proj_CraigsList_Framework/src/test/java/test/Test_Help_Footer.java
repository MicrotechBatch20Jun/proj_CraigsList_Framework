package test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import base.TestBase;

public class Test_Help_Footer extends TestBase {

	@Test
	void Help_Footer_is_Active() {
		boolean help_is_Displyed = isDisplayed(By.linkText(or.getProperty("HELP")));
		Assert.assertEquals(help_is_Displyed, true);

		boolean help_is_Enabled = isEnabled(By.linkText(or.getProperty("HELP")));
		Assert.assertEquals(help_is_Enabled, true);

		Click(By.linkText(or.getProperty("HELP")));
		driver.navigate().back();

		log.debug("Verified Help Footer is Active");

	}// Help_Footer_is_Active

}// class
