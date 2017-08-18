package PageObjectModelPractioce;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
public class LoginPageOfAdsense {
	WebDriver driver;
	By username = By.id("usernameOrEmail");
	 By password = By.xpath("//input[@id= 'password']");
	 By login =By.xpath("//button[@type= 'submit']");
	public LoginPageOfAdsense(WebDriver driver) {
		 this.driver= driver ;
	}
	public void Username(){
		driver.findElement(username).sendKeys("admin");
	}
	public void Password(){
		driver.findElement(password).sendKeys("123");
	}
public void Submit(){
	driver.findElement(login).click();
	}
}
//3 methons and 1 constructor class