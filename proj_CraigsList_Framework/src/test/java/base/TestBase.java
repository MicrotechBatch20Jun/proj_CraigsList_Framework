package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.ExtentManager;
import utilities.ExcelReader;
import org.apache.log4j.Logger;

public class TestBase {

	public static WebDriver driver;
	public static FileInputStream fis;
	public static Properties or;
	public static Properties config;
	public static String projectPath;
	public static ExcelReader excel;
	public static Logger log;
	public static WebDriverWait wait;
	public static ExtentTest test;
	public static ExtentReports rep;
	public static String browser;

	@BeforeSuite
	public void setup() throws IOException {

		System.setProperty("org.uncommons.reportng.escape-output", "false");

		log = Logger.getLogger("devpinoyLogger");

		rep = ExtentManager.getInstance();

		excel = new ExcelReader(System.getProperty("user.dir") + "\\src\\test\\resources\\data\\testdata.xlsx");

		projectPath = System.getProperty("user.dir");

		fis = new FileInputStream(projectPath + "\\src\\test\\resources\\properties\\OR.properties");
		or = new Properties();
		or.load(fis);

		fis = new FileInputStream(projectPath + "\\src\\test\\resources\\properties\\config.properties");
		config = new Properties();
		config.load(fis);

		if (config.getProperty("HEADLESS").contains("true")) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--headless");
			co.addArguments("disable-gpu");
			driver = new ChromeDriver(co);
		} else {

			driver = new ChromeDriver();
		}

	}// setup

	public static void Click(By locator) {
		driver.findElement(locator).click();
	}

	public static void SendKeys(By locator, String value) {
		driver.findElement(locator).sendKeys(value);
	}

	public static boolean isDisplayed(By locator) {
		boolean result = driver.findElement(locator).isDisplayed();
		return result;
	}

	public static String getText(By locator) {
		return driver.findElement(locator).getText();
	}

	public static boolean isEnabled(By locator) {
		return driver.findElement(locator).isEnabled();
	}

	public static boolean isSelected(By By) {
		return driver.findElement(By).isSelected();
	}

	public static boolean element_is_Clickable(By By) {
		driver.findElement(By).click();
		return true;
	}

	public static void pressEnter(By locator, Keys key) {
		driver.findElement(locator).sendKeys(Keys.ENTER);
	}

	public boolean isElementPresent(By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {

			return false;
		}

	}

	@BeforeClass
	public static void login() {

		driver.get(config.getProperty("BASE_URL"));

		driver.manage().window().maximize();

		Click(By.linkText(or.getProperty("MY_ACCOUNT")));

		SendKeys(By.xpath(or.getProperty("EMAIL_ADDRESS")), or.getProperty("EMAIL_ID"));

		SendKeys(By.xpath(or.getProperty("PASSWORD")), or.getProperty("PASS"));

		Click(By.xpath(or.getProperty("LOG_IN")));

		Click(By.linkText(or.getProperty("CRAIGSLIST")));

	}

	@AfterClass
	public static void logout() {
		driver.get(config.getProperty("URL"));
		Click(By.xpath(or.getProperty("LOG_OUT")));
		log.debug("successfully logout");
	}

	@AfterSuite
	public void tearDown() {
		driver.close();
		log.debug("Test is Completed");
	}

}// class