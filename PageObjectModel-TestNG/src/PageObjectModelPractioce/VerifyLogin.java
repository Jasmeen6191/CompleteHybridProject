package PageObjectModelPractioce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
public class VerifyLogin {	
	@Test
	public void verifylogin() throws InterruptedException{	
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://wordpress.com/log-in?redirect_to=https%3A%2F%2Fwordpress.com%2F");		
		LoginPageOfAdsense loginn = new LoginPageOfAdsense(driver);
		Thread.sleep(2);
		loginn.Username();
		Thread.sleep(2);
		loginn.Password();
		Thread.sleep(2);
		loginn.Submit();
		Wordpress w = new Wordpress(driver);
		w.list();
		driver.quit();
	}

}
