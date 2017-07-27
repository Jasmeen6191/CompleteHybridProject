import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.junit.Assert.*;

public class Youtube {	
	 private static final long SECONDS = 0;
	static WebDriver driver;	
	public void LaunchBroswer(WebDriver driver , String str)
	{	
	if(str =="Mozila")
	{
		this.driver = new FirefoxDriver();	
	}
	if(str =="Chrome")	
	{
		this.driver = new ChromeDriver();
		driver.manage().window().maximize();		
	}	
    if(str =="Safari")		
	{
		this.driver = new SafariDriver();	
	}	
	}
	@SuppressWarnings("deprecation")
	@Test
	public void openURL(String url){
		this.driver.get(url);
		String youtubetitle = this.driver.getTitle();
		Assert.assertEquals(youtubetitle, "YouTube");}
		

	public void serach(String Searhfor){
		WebElement SearchTab = this.driver.findElement(By.cssSelector("#masthead-search-term"));
		SearchTab.sendKeys(Searhfor);
		WebElement SearchButton = this.driver.findElement(By.xpath("//*[@id='search-btn']/span"));
		SearchButton.click();
	
	}
	public void selectvideo(String video){
	//List <WebElement> E1=  this.driver.findElement(By.xpath(xpathExpression))
	}
	public static void main(String[] args) {
		Youtube obj1= new Youtube();
		obj1.LaunchBroswer(driver, "Safari");
		 driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        obj1.openURL("https://www.youtube.com");
   	 driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        obj1.serach("Hindi funny Movie Clips");
	}

}