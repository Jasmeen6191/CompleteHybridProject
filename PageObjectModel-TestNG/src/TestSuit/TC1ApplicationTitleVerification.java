package TestSuit;

import org.testng.annotations.Test;
import org.apache.log4j.PropertyConfigurator;
import  org.apache.log4j.Logger;

import ListOfInputElements.InputFields;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import SetBrowser.SelectAndOpenBrowser;

public class TC1ApplicationTitleVerification {
	static WebDriver driver;
	static Logger log = Logger.getLogger("deloyinglogeer");
	
	


@Test
public void validatetittle() {
	SelectAndOpenBrowser.SelectBrowser("Mozila","https://www.google.com","Google");
	InputFields input = PageFactory.initElements(driver, InputFields.class);
	input.allElements();
	 }		
		}

