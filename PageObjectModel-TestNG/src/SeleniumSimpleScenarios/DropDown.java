package SeleniumSimpleScenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String[] args) throws Exception {
	WebDriver driver=new FirefoxDriver();
	 driver.manage().window().maximize();
	driver.get("http://www.facebook.com");
	WebElement monthdropdown=driver.findElement(By.id("month"));
	Select month=new Select(monthdropdown);
	month.selectByIndex(4);
	month.selectByVisibleText("Jul");
	WebElement first_value=month.getFirstSelectedOption();
	 String value=first_value.getText();
	 List<WebElement> dropdown = month.getOptions();
	 System.out.println(dropdown.size());
	 for(int i=0;i<dropdown.size();i++)
	 { 
		 WebElement element =  dropdown.get(i);
	 String drop_down_values=dropdown.get(i).getText();
	 System.out.println("dropdown values are "+drop_down_values);
	 if(dropdown.contains("Jan")){
		 element.click();
	 }
    }
}
} 
