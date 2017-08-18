package TestSuit;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.apache.log4j.PropertyConfigurator;

import java.io.IOException;

import  org.apache.log4j.Logger;
import ListOfInputElements.InputFields;
import Screenshot.SaveScreenShot;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import SetBrowser.SelectAndOpenBrowser;
public class TC1ApplicationTitleVerification {
WebDriver driver;
@Test
public void validatetittle() throws IOException {
	
	SelectAndOpenBrowser br = new SelectAndOpenBrowser(driver);
	br.SelectBrowser("Mozila","https://www.google.com","Google");
	InputFields in = new InputFields(driver);
	in.allElements();
	
//	SelectAndOpenBrowser browser = new SelectAndOpenBrowser(driver);
//	SelectAndOpenBrowser sm = new SelectAndOpenBrowser(driver);
// sm.SelectBrowser("Mozila","https://www.google.com","Google");
//	InputFields Sc = new InputFields();
	// InputFields Sc = PageFactory.initElements(driver, InputFields.class);
//	Sc.allElements();
	 }		
		}

