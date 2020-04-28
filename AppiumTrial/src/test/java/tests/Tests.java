package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class Tests extends BaseClass{
	
	@Test
	public void testOne() {
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("2359 Media");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
		System.out.println("Completed test one...");
		
	}
}
