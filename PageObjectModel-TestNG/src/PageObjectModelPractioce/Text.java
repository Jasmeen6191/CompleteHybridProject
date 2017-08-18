package PageObjectModelPractioce;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Text {

	public static void main(String[] args)
	{
		WebDriver driver  = new FirefoxDriver();
		Actions actionobject = new Actions(driver); 
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/SignUp?continue=https%3A%2F%2Fwww.google.co.in%2F&hl=en");
		String parentWindow = driver.getWindowHandle();
	System.out.println(parentWindow);
		driver.findElement(By.xpath("//div/p/a")).click();
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> traverse = s1.iterator();
		while(traverse.hasNext())
		{
			String childWindow = traverse.next();
			if(!parentWindow.equalsIgnoreCase(childWindow));
			{
			driver.switchTo().window(childWindow);
			System.out.println(driver.getTitle());
			}
	}
driver.switchTo().window(parentWindow);
}
}
