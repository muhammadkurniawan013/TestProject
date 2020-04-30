package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.SendKeysAction;
import org.testng.annotations.Test;

public class Tests extends BaseClass{
	
	@Test
	public void testOne() {
		driver.get("https://google.com");
		driver.findElementByName("q").sendKeys("2359 Media");
		driver.findElementByName("q").sendKeys(Keys.ENTER);
		
//		driver.findElementByXPath('//input[@name="q"]').SendKeysAction("2359 Media");
//		driver.findElementByXPath('//input[@name="q"]').SendKeysAction(Keys.ENTER);
		
		System.out.println("Completed test one...");
		
	}
}
