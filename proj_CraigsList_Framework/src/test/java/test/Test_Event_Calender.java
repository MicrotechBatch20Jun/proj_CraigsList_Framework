package test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import base.TestBase;

public class Test_Event_Calender extends TestBase {

	@Test
	void Event_Calender_is_Active() {
		boolean event_Calender_is_Displayed = isDisplayed(By.linkText(or.getProperty("EVENT_CALENDER")));
		Assert.assertEquals(event_Calender_is_Displayed, true);

		boolean event_Calender_is_Enabled = isEnabled(By.linkText(or.getProperty("EVENT_CALENDER")));
		Assert.assertEquals(event_Calender_is_Enabled, true);

		Click(By.linkText(or.getProperty("EVENT_CALENDER")));
		driver.navigate().back();

		log.debug("Verified Event Calender is Active");

	}// Event_Calender_is_Active

}// class
