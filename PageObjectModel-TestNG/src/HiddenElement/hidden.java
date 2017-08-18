package HiddenElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class hidden {
	
	
	public static void main(String[] args) {
WebDriver driver = new FirefoxDriver();
driver.manage().window().maximize();
driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-automate-radio-button-in.html");
//int x =driver.findElements(By.id("male")).getLocation().getX();
//int y =driver.findElement(By.id("male")).getLocation().getY();
//System.out.print(" x cordinate "+x);
//System.out.print("y cordinate "+y);
List<WebElement> ele =driver.findElements(By.id("male"));
{for(int i=0;i<ele.size();i++)
{
	int x =ele.get(i).getLocation().getX();
	if(x != 0){
		ele.get(i).click();
		break;
	}
}
	}
	}
}
