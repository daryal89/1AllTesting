package sauceLabTesting;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class SauceNode1 {

	public static final String USERNAME = "sagun123";
	public static final String ACCESS_KEY = "52a381f5-ab5b-4d14-8e76-321f639abefe";
	public static final String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:443/wd/hub";
	WebDriver driver;

	@Test
	public void initialize() throws MalformedURLException {
		DesiredCapabilities caps = DesiredCapabilities.firefox();
		caps.setCapability("platform", "macOS 10.13");
		caps.setCapability("version", "44.0");

		driver = new RemoteWebDriver(new java.net.URL(URL), caps);

		driver.get("https://www.amazon.com/");
		System.out.println("title of page is: " + driver.getTitle());

	}

	@Test
	public void tearDown(WebDriver driver) {
		System.out.println("We are closing the browser!!!");
		driver.close();
	}

}
