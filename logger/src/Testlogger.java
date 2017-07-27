import java.awt.Toolkit;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.junit.Assert.*;
public class Testlogger {	
	 private static final long SECONDS = 0;
	static WebDriver driver;	
	Logger log = Logger.getLogger("deloyinglogeer");
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
		log.debug("Browser Launched");
	}	
    if(str =="Safari")		
	{
		this.driver = new SafariDriver();	
		java.awt.Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	//	Point position = new Point(0, 0);
		//driver.manage().window().setPosition(new Point(100, 0));
		//Dimension maximizedScreenSize =
	//	new Dimension((int) screenSize.getWidth(), (int) screenSize.getHeight());
	//	driver.manage().window().setSize(maximizedScreenSize);
		}
	}		
	@Test
	public void openURL(String url,String titleofURL){
		this.driver.get(url);
		log.debug("URL Opened");
		String title = this.driver.getTitle();
		Assert.assertEquals(title, titleofURL);
		log.assertLog( true, "sucessful page");
		}
	public void serach(String Searhfor){
		WebElement SearchTab = this.driver.findElement(By.xpath("//input[@type= 'search']"));
	SearchTab.sendKeys(Searhfor);
	log.debug("Able to see search tab and enetered the required input");
	 driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//*a/span[text() ,’Bengaluru’]")); 
		WebElement SearchButton = this.driver.findElement(By.xpath("//input[@class= 'three blue']"));
		 driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		SearchButton.click();
		System.out.print("searchedclicked");
	}
	public void selectvideo(String video){
	}
	public static void main(String[] args) {
		Testlogger obj1= new Testlogger();
		obj1.LaunchBroswer(driver, "Safari");
		 driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        obj1.openURL("https://www.timeanddate.com/weather/","World Temperatures — Weather Around The World");
   	 driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
       obj1.serach("Bengaluru");
	}

}
