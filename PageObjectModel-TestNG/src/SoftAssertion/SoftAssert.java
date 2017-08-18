package SoftAssertion;

import org.testng.annotations.Test;

public class SoftAssert {
	
	org.testng.asserts.SoftAssert aac = new org.testng.asserts.SoftAssert();
	@Test
	public void method1(){
		System.out.println("it sis started");
		aac.assertEquals("hello", "helllpp","not matched");
		aac.assertAll();
		System.out.println("it sis finished");
	}

}
