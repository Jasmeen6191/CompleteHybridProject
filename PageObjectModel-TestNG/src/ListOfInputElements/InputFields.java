package ListOfInputElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class InputFields {
	 static WebDriver driver;	
	
	public static void allElements(){

		System.out.println("I am 2nd class");
		List<WebElement> txtfields = driver.findElements(By.id("//input"));
		System.out.println(txtfields.size()+"These may input elements");
		for(WebElement el:txtfields){
			System.out.println(el.getText());
			
		}
		
	}

}
