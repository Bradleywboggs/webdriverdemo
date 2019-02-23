package com.pluralsight;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverRadioButtons {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/bradleyboggs/dev/tools/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get("file:///Users/bradleyboggs/java/automated-testing-exploration/WebDriverDemo/src/main/webapp/RadioButton.html");
		
		List<WebElement> radioButtons = driver.findElements(By.name("color"));
		radioButtons.get(2).click();
		
		for(WebElement radioButton : radioButtons) {
			if(radioButton.isSelected()) {
				System.out.println(radioButton.getAttribute("value")); 
			}
		}


	}

}
