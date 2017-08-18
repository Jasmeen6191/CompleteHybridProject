package PageObjectModelPractioce;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

/**
 * @author jasmeenkaur
 *date ,format ,random number
 *screenshot
 *mouseover
 */
public class SetExample {
	Date d1 = new Date();
	SimpleDateFormat f1 = new  SimpleDateFormat("yyMMddHHmmss");
	WebDriver driver;
By signin = By.xpath("//div/a");
By Moreoptions = By.xpath("//div[contains(text(),'More options')]");
By learnmore = By.xpath("//div/p/a[contains(text(),'Learn more')]");
By smallbox = By.xpath("//div/content");
By createacc = By.xpath("//content/div/div");
Actions ac = new Actions(driver);

	@Test
public void getwindow() throws IOException, AWTException, InterruptedException{
String str = "f1.format(d1)";
System.out.println(str);
driver = new FirefoxDriver();
driver.manage().window().maximize();
driver.get("https://www.google.com/");  
Thread.sleep(30);
driver.findElement(signin).click();;
driver.findElement(Moreoptions).click();
Thread.sleep(30);
TakesScreenshot screenshot =  (TakesScreenshot)driver;
File Source = screenshot.getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(Source , new File("./Users/jasmeenkaur/Documents/workspace/PageObjectModel-TestNG/"+f1.format(d1)+".png"));
ac.moveToElement(driver.findElement(smallbox)).moveToElement(driver.findElement(createacc)).click().build().perform();
Thread.sleep(60);
System.out.println("I am here ");
 driver.close();
}

}
