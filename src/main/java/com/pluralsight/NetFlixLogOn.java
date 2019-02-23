package com.pluralsight;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NetFlixLogOn {
	
public static void main(String[] args) {

 System.setProperty("webdriver.chrome.driver", "/Users/bradleyboggs/dev/tools/chromedriver");
 WebDriver driver = new ChromeDriver();
 
 driver.get("http://www.netflix.com");

 WebElement logOnLink = driver.findElements(By.linkText("Sign In")).get(0);
 logOnLink.click();
 
 WebElement userNameField = driver.findElement(By.name("userLoginId"));
 userNameField.sendKeys("aubreylouise1593@yahoo.com");
 
 WebElement passwordField = driver.findElement(By.id("id_password"));
 passwordField.sendKeys("girlygirl");
 passwordField.submit();
 
 WebElement profileLink = driver.findElement(By.cssSelector("div[style=\"background-image:url(https://occ-0-436-92.1.nflxso.net/art/6c2c6/55e5b9ec503b1b2fc0e003da1a3027b746b6c2c6.png)\"]"));
 profileLink.click();
 
 
 
}
}
