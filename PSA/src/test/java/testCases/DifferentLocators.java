package testCases;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import commons.Base;
import utils.ConfigReader;
/*
 * Selenium has 8 types of locators.
 * id,name,classname,tagname,linkText,partialLinkText,xpath , cssSelector
 * 
 * In the below example, fetching different types of elements using all 8 locators of selenium
 * 
 */

public class DifferentLocators extends Base {

	@Test
	public void locatorsInSelenium() {
		String baseUrl = ConfigReader.readProperty("BaseURL");
		driver.get(baseUrl);
	

		WebElement byId = driver.findElement(By.id("email"));
		WebElement byname = driver.findElement(By.name("pass"));
		WebElement byclassname = driver.findElement(By.className("_41ug"));
		WebElement byTagName = driver.findElement(By.tagName("button"));
		WebElement byLinkText = driver.findElement(By.linkText("Log in"));
		WebElement byPartialLinkText = driver.findElement(By.partialLinkText("Log"));
		WebElement byxpath = driver.findElement(By.xpath("//a[contains(text(),'Forgotten')]"));
		WebElement byCssSelector = driver.findElement(By.cssSelector("[data-testid^='open']"));

		byId.isDisplayed();
		byname.isDisplayed();
		byclassname.isDisplayed();
		byTagName.isDisplayed();
		byLinkText.isEnabled();
		byPartialLinkText.isEnabled();
		byxpath.isEnabled();
		byCssSelector.isDisplayed();

	}

}
