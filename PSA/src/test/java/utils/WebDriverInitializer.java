package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class WebDriverInitializer {

	/*This is where driver initialization is happeing.
	 * This will work for cross-browser testing.
	 * And headless mode option is also available.
	 */
	private WebDriver driver;

	/*
	 * Uncomment the System.setProperty statement for Selenium 3 versions. If
	 * selenium 4 is configured then we don't need to provide any path. It will take
	 * care of it internally.
	 */

	public WebDriverInitializer(String browserType, boolean headless) {

		if (browserType.equalsIgnoreCase("chrome")) {
			// System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

			ChromeOptions options = new ChromeOptions();

			if (headless) {
				options.addArguments("--headless");
			}

			driver = new ChromeDriver(options);
		} else if (browserType.equalsIgnoreCase("firefox")) {
			// System.setProperty("webdriver.gecko.driver", "path/to/geckodriver");

			FirefoxOptions options = new FirefoxOptions();

			if (headless) {
				options.addArguments("--headless");
			}

			driver = new FirefoxDriver();
		} else {
			throw new IllegalArgumentException("Unsupported browser type: " + browserType);
		}
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void closeDriver() {
		driver.quit();
	}
}
