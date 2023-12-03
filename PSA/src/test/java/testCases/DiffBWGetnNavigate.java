package testCases;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.io.File;

import org.junit.Test;
import org.openqa.selenium.By;
import commons.Base;
import utils.ConfigReader;

/*
 * Difference Between get() and navigate().to()
 * 
 * Here, at one place , using get() function to launch given url
 * then adding assertions.
 * After that using navigate().to() to launch the same URL.
 * navigate().to() has some additional features like refresh(), back(),forward().
 * Used all of them in below example.
 * 
 */

public class DiffBWGetnNavigate extends Base {

	@Test
	public void differenceBetweenGetAndNavigateTo() {

		String practiceUrl = ConfigReader.readProperty("PracticeURL");
		driver.get(practiceUrl);
		String windowName = driver.getCurrentUrl();
		assertTrue(windowName.contains("internet")); //Assertion

		// With the help of navigate commands, we can move forward , backward, do
		// refresh.
		driver.navigate().to(practiceUrl);
		driver.findElement(By.linkText("A/B Testing")).click();
		String aBText = driver.findElement(By.xpath("//h3")).getText();
		assertTrue(aBText.contains("A/B"));
		driver.navigate().back(); // go back to previous page
		driver.navigate().forward(); // move forward to the next page
		driver.navigate().refresh(); // refresh the page.

	}

}
