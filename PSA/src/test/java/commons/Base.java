package commons;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import utils.ConfigReader;
import utils.WebDriverInitializer;

/*
 * In this class, setUp and tearDown methods are initialized.
 * setUp method is used to initialize driver
 * tearDown is used to close all the instances of driver.
 */
public class Base {

	public WebDriverInitializer webDriverInitializer;
	public WebDriver driver;

	// setUp method is using WebDriverInitializer class.
	@Before
	public void setUp() {

		webDriverInitializer = new WebDriverInitializer(ConfigReader.readProperty("browserType"),
				Boolean.parseBoolean(ConfigReader.readProperty("headless")));
		driver = webDriverInitializer.getDriver();
	}

	// this method will be called once our execution is Done then it will close the
	// driver
	@After
	public void tearDown() {

		if (driver != null) {
			driver.quit();
		}
	}

}
