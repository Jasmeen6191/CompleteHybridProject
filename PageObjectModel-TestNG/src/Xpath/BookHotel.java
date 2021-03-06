package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BookHotel {
WebDriver driver;
	@FindBy(how =How.ID ,using ="adults")
	WebElement Adults ;
	@FindBy(how =How.ID ,using ="child")
	WebElement child ;
	@FindBy(how =How.CLASS_NAME ,using ="select2-chosen")
	WebElement Location ;
	@FindBy(how =How.CLASS_NAME ,using ="form input-lg dpd1")
	WebElement Checkin ;
	@FindBy(how =How.CLASS_NAME ,using ="form input-lg dpd2")
	WebElement Checkout ;
	@FindBy(how =How.XPATH ,using ="//div/form/div[6]/div/button")
	WebElement search ;
	
	public  BookHotel(WebDriver driver){
	this.driver = driver ;
	}
		public void search_hotel(){
	   // driver.findElement((By) Location);
			Location.sendKeys("Bangalore");
	   // Checkin.sendKeys("16/09/2017");
		//Checkout.sendKeys("17/09/2017");
		//Adults.sendKeys("1");
		//search.submit();
	}
	
}
