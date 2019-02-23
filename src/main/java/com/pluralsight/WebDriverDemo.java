package com.pluralsight;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverDemo {

	public static void main(String[] args) throws Exception {
		// It is better to set an environment variable here instead. Not sure how on Mac.
		// System.setProperty("webdriver.gecko.driver", "/Users/bradleyboggs/dev/tools/geckodriver");
		// System.setProperty("webdriver.chrome.driver", "/Users/bradleyboggs/dev/tools/chromedriver");
		 
		// WebDriver driver = new FirefoxDriver();
	    // WebDriver driver = new ChromeDriver();
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), 
				                                         DesiredCapabilities.chrome() );
		
		driver.get("http://google.com");
		
		/* Finding Elements:  
		 * Find by: 
		 * 	ClassName ID(Clearest) Name  TagName  CssSelector  
	        LinkText  PartialLinkText  XPath(most precise)
	    */
		
		// Finds Google Search Field
		WebElement searchField = driver.findElement(By.className("gLFyf"));
		
		// Types into the Search Field and presses 'submits'
		
		
		searchField.sendKeys("pluralsight");
		searchField.submit();
	
		
		// If using a page without a submit button you can use:
		// searchField.sendKeys(Keys.RETURN);

	    // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Images")));
		
		/* WebElement interface API - org.openqa.selenium
		 * clear
		 * click
		 * findElement
		 * findElements
		 * getAttribute
		 * getCssValue
		 * sendKeys
		 * submit
		 * isDisplayed
		 * isEnabled
		 * getLocation
		 * isSelected
		 * getSize
		 * getTagName
		 * getText
		 */
		
	    WebElement imagesLink = driver.findElements(By.linkText("Images")).get(0);
		imagesLink.click();
		
		/* If no id can be selected, you can use XPath or css selector (easier reading!)
		 * Use CSS selector online tester - try.jsoup.org
		 * fetch the URL; choose the selector your want. e.g. img[class="rg_ic rg_i"]
		 * then find the index of the particular item you want.
		 */
		
		WebElement imageLink = driver.findElement(By.cssSelector("img[data-src=\"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR6mAd5F67-6D7MdqkZ5-1J5M6VOOVIhBaZTjAInwod1oQ8KRC9\"]"));
		imageLink.click();
		
		// If you want a sort of assertion in WebDriver you can use this:
		// driver.getPageSource().contains("Whatever String you want") which returns a bool
		// However, this should be done instead with JUnit
	
				
	}

}
