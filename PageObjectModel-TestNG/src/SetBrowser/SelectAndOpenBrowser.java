package SetBrowser;

import static org.testng.Assert.assertEquals;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;
import org.testng.asserts.*;

public class SelectAndOpenBrowser {
	static WebDriver driver;

	static SoftAssert softassert = new SoftAssert();

	static Logger log = Logger.getLogger("deloyinglogeer");

	@Test
	public static void SelectBrowser(String BrowserName, String url, String Title) {
		{
			if (BrowserName.equalsIgnoreCase("Mozila")) {
				driver = new FirefoxDriver();
				System.out.print("Browser Launched");
			}
			if (BrowserName.equalsIgnoreCase("Chrome")) {
				driver = new ChromeDriver();
				System.out.print("Browser Launched");

			}
			if (BrowserName.equalsIgnoreCase("Safari")) {
				driver = new SafariDriver();
				System.out.print("Browser Launched");
			}
			driver.manage().window().maximize();
			log.debug("Browser Launched");
			driver.get(url);
			System.out.println("Application URL enetered");
			String ApplicationTitle = driver.getTitle();
			softassert.assertEquals(ApplicationTitle, Title, "Boss!! Yo are not at right page");

		}
	}
}
