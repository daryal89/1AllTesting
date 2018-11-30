package localTestRun;

 import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FBLogin {
	WebDriver driver;

	@Test
	public void initialize() {
		System.setProperty("webdriver.chrome.driver", "C:\\Useful Softwares\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("https://facebook.com");
		System.out.println("title of page is: " + driver.getTitle());

		driver.findElement(By.id("email")).sendKeys("bholanath_aryal@yahoo.com");
		driver.findElement(By.id("pass")).sendKeys("Pokhara1");
		driver.findElement(By.xpath("//input[@type='submit']")).click();

		System.out.println("Title of the page: " + driver.getTitle());

		driver.switchTo().alert().dismiss();

		driver.close();

	}

	// @Test
	public void closing() {
		System.out.println("We are closing the browser!!!");
		driver.close();
	}

}
