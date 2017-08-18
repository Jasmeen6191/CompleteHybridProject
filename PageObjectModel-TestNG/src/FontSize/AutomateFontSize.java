package FontSize;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class AutomateFontSize {
		public static void main(String[] args) throws Exception {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();	
		driver.get("https://www.flipkart.com/");
	WebElement el=	driver.findElement(By.className("_2k0gmP"));		
	el.getCssValue("font-size"); 
System.out.println(el.getCssValue("font-size"));
System.out.println(el.getAttribute("fontattr"));
System.out.println(el.getLocation()+"location ");
System.out.println(el.getText()+"   Text ");
String Expected_Text = "Sell on Flipkart";
Assert.assertEquals(Expected_Text, el.getText(),"matches");// matches will only come in console when this condition fail

//acc.assertAll();
driver.quit();
		
	}
	

}
