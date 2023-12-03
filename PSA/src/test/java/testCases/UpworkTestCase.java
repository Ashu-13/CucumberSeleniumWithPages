package testCases;

import java.time.Duration;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.ConfigReader;

import commons.Base;

public class UpworkTestCase extends Base {

	@Test
	public void signInUpwork() {
		
		String baseURL = ConfigReader.readProperty("BaseURL");
		driver.get(baseURL);
		WebElement signUpBtn = driver.findElement(By.cssSelector("#nav-main a[href*='signup']"));
		signUpBtn.click();
		
		//--------------------------------------------
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		   
		
		WebElement freelancingWork= driver.findElement(By.cssSelector("div[data-qa=\"work\"]"));
		 wait.until(ExpectedConditions.visibilityOf(freelancingWork));
		freelancingWork.click();
		
		WebElement applyButton= driver.findElement(By.cssSelector("button[data-qa=\"btn-apply\"]"));
	    applyButton.click();
	    
	    //--------------------------------------------------------
	    
	    
		
		
	}

		

	
}
