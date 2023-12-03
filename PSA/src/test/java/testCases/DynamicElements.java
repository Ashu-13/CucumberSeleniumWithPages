package testCases;

import static org.junit.Assert.assertTrue;

import java.time.Duration;
import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import commons.Base;
import utils.ConfigReader;
/*
 * Given user go to "https://the-internet.herokuapp.com/dynamic_loading/1"
 * When user clicks on START button
 * Then a loader will come
 * Then wait for HELLO WORLD Text
 * 
 * Via this way in this below example, we can manage dynamic loading
 * 
 */


public class DynamicElements extends Base {
	
	@Test
	public void dynamicElementContent() {

	String practiceUrl = ConfigReader.readProperty("PracticeURL");

	String dynamicLoadUrl = practiceUrl+"dynamic_loading/1";
	System.out.println(dynamicLoadUrl);
	driver.get(dynamicLoadUrl);
	driver.manage().window().fullscreen();
    WebElement startButton=	driver.findElement(By.cssSelector("div>button"));
    startButton.click();
    //WebDriverWait is used for dynamic wait and it will poll after every 500ms
    //It will max wait for 30seconds
    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
    WebElement helloTextEle = driver.findElement(By.id("finish"));
    wait.until(ExpectedConditions.visibilityOf(helloTextEle));
    
     
     String helloText =helloTextEle.getText();
     assertTrue(helloText.contains("Hello"));
     
     
         //Dynamic Dropdown/Bootstrap dropdown
     
		/*
		 * List<WebElement> options =
		 * driver.findElements(By.cssSelector("cssSelector")); //will get all the values
		 * in options
		 * 
		 * String ourOption = "TestDrop";
		 * 
		 * //iteration -- size of List named as options for(WebElement ele : options) {
		 * String currOption= ele.getText();
		 * 
		 * if(currOption.equals(ourOption)) { 
		 * ele.click(); 
		 * break;
		 *  }
		 *  }
		 * 
		 */
    
    
	
	}
	
}
