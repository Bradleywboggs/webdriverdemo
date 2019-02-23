package com.pluralsight;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCheckbox {

	public static void main(String[] args) {
	    System.setProperty("webdriver.chrome.driver", "/Users/bradleyboggs/dev/tools/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get("file:///Users/bradleyboggs/java/automated-testing-exploration/WebDriverDemo/src/main/webapp/CheckBoxTest.html");
	
		List<WebElement> checkboxes = driver.findElements(By.cssSelector("input[type=\"checkbox\"]"));
		for (WebElement checkbox : checkboxes) {
			if(checkbox.getAttribute("id").contentEquals("lettuce") ||
			   checkbox.getAttribute("id").contentEquals("turkey")) {
				checkbox.click();
			}
				
		}
	}

}
