package test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import base.TestBase;

public class Test_Create_Posting extends TestBase {

	@Test
	void Create_a_Posting_is_Active() {
		boolean create_a_Postng_is_Displayed = isDisplayed(By.linkText(or.getProperty("CREATE_POSTING")));
		Assert.assertEquals(create_a_Postng_is_Displayed, true);

		boolean creat_a_Posting_is_Enabled = isEnabled(By.linkText(or.getProperty("CREATE_POSTING")));
		Assert.assertEquals(creat_a_Posting_is_Enabled, true);

		Click(By.linkText(or.getProperty("CREATE_POSTING")));
		driver.navigate().back();

		log.debug("Verified Create a Posting is Active");

	}// Create_a_Posting_is_Active

}// class
