package testinggridsaucelab;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GridTest {

	public WebDriver driver;
	String nodeUrl = "";

	@Test
	public void login() throws MalformedURLException, InterruptedException {

		String url = "https://www.priceline.com";
		nodeUrl = "http://192.168.28.1:5558/wd/hub";

		DesiredCapabilities dc = DesiredCapabilities.firefox();
		dc.setBrowserName("firefox");
		dc.setPlatform(Platform.WINDOWS);

		driver = new RemoteWebDriver(new URL(nodeUrl), dc);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get(url);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		Thread.sleep(2000L);
		

	}

}
