package sauceLabTesting;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class SauceNode2 {
	public static final String USERNAME = "sagun123";
	public static final String ACCESS_KEY = "52a381f5-ab5b-4d14-8e76-321f639abefe";
	public static final String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:443/wd/hub";

	WebDriver driver;

	@Test
	public void initialize() {
		try {
			DesiredCapabilities caps = DesiredCapabilities.chrome();
			caps.setCapability("platform", "Windows 10");
			caps.setCapability("version", "60.0");
			driver = new RemoteWebDriver(new java.net.URL(URL), caps);
			driver.get("https://facebook.com");
			System.out.println("title of page is: " + driver.getTitle());

			driver.findElement(By.id("email")).sendKeys("bholanath_aryal@yahoo.com");
			driver.findElement(By.id("pass")).sendKeys("Pokhara1");
			driver.findElement(By.xpath("//input[@type='submit']")).click();

			driver.getTitle();
			System.out.println("Title of the page: " + driver.getTitle());

		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

	}

	@Test
	public void closing() {
		System.out.println("We are closing the browser!!!");
		driver.close();
	}

}
