package com.pluralsight;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverTable {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/bradleyboggs/dev/tools/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get("file:///Users/bradleyboggs/java/automated-testing-exploration/WebDriverDemo/src/main/webapp/TableTest.html");
		
		WebElement outerTable = driver.findElement(By.tagName("table"));
		WebElement innerTable = outerTable.findElement(By.tagName("table"));
		WebElement row = innerTable.findElements(By.tagName("td")).get(1);
		System.out.println(row.getText()); 
	
	}

}
