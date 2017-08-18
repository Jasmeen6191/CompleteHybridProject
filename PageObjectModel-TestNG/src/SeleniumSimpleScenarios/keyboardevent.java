package SeleniumSimpleScenarios;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sun.jna.Function;
import com.sun.jna.platform.win32.WinDef.BYTE;
public class keyboardevent {
public static void main(String[] args) throws Exception {
WebDriver driver=new FirefoxDriver();
driver.get("https://www.facebook.com/");
driver.manage().window().maximize();
Actions act=new Actions(driver);

driver.manage().timeouts().implicitlyWait(3, TimeUnit.MILLISECONDS);

act.contextClick(driver.findElement(By.id("u_0_m"))).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
System.out.println("jasmeen kaur ");
WebDriverWait wait = new WebDriverWait(driver, 20);

WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("lastname")));
System.out.println("jasmeen kaur bhullar");

Wait<WebDriver> wait1 = new FluentWait<WebDriver>(driver).withTimeout(60, TimeUnit.SECONDS).pollingEvery(2, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
 //WebElement foo = wait1.until(new Function<WebDriver, WebElement>();
}
}
