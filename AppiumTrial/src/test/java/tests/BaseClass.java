package tests;

import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {
	
	AppiumDriver<WebElement> driver;
	
	@BeforeTest
	public void setup() {
		
		try{
			DesiredCapabilities caps = new DesiredCapabilities();
			caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
			caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
			caps.setCapability(MobileCapabilityType.DEVICE_NAME, "SM-A530F/DS");
			caps.setCapability(MobileCapabilityType.UDID, "192.168.1.4:5555");
			caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
//			caps.setCapability(MobileCapabilityType.APP, "com.singaporegp.f1.staging");
			caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
			
			URL url = new URL("http://127.0.0.1:4723/wd/hub");
			driver = new AppiumDriver<WebElement>(url,caps);
			
		}catch (Exception e) {
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	@Test
	public void sampleTest() {
		System.out.println("We're set!!!");
	}
	
	@AfterTest
	public void teardown() {
		driver.close();
		driver.quit();
	}

}
