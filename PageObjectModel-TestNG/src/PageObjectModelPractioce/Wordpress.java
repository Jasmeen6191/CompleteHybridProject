package PageObjectModelPractioce;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class Wordpress {
	WebDriver driver;	
	By inputElements = By.xpath("//input");
public Wordpress(WebDriver driver){
	this.driver = driver;
}
public void list(){
	List<WebElement> lis = driver.findElements(inputElements);
	System.out.println(lis.size());
	for(WebElement el :lis){
		System.out.println(el.getTagName());
	}
}
}
