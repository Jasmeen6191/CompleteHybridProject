package Screenshot;
import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SaveScreenShot {
	
	public void method(WebDriver driver) throws IOException{
	
	String actualtitle = driver.getTitle();
	System.out.println(actualtitle);	
		TakesScreenshot ts =(TakesScreenshot)driver;
		File source =  ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("./Users/jasmeenkaur/Documents/s1.png"));
		System.out.print("Screenshottaken");
		driver.quit();
	}
	@Test
	public static void main(String[] args) throws Exception {
		//WebDriver driver = new FirefoxDriver();
	
		//driver.manage().window().maximize();
	//	driver.get("https://www.google.co.in");
	//String actualtitle = driver.getTitle();
//System.out.println(actualtitle);	
//	TakesScreenshot ts =(TakesScreenshot)driver;
//	File source =  ts.getScreenshotAs(OutputType.FILE);
//	FileUtils.copyFile(source, new File("./Users/jasmeenkaur/Documents/s1.png"));
//	System.out.print("Screenshottaken");
	//driver.quit();
	
	
//	List <WebElement> element = driver.findElements(By.xpath("//input"));
}
}
