package SetBrowser;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SelectAndOpenBrowser {
	static WebDriver driver;

	static Logger log = Logger.getLogger("deloyinglogeer");

	public static void SelectBrowser(String BrowserName, String url) {
		{
			if (BrowserName.equalsIgnoreCase("Mozila")) {
				driver = new FirefoxDriver();
			}
			if (BrowserName.equalsIgnoreCase("Chrome")) {
				driver = new ChromeDriver();
				
			}
			if (BrowserName.equalsIgnoreCase("Safari")) {
				driver = new SafariDriver();
			}
			driver.manage().window().maximize();
			log.debug("Browser Launched");
			driver.get(url);
			System.out.println("Application URL enetered");
		}
	}

}
