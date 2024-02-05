package testcase;

import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.BaseTest;
import pages.Registration;




public class RegistrationTest extends BaseTest {
	
	
	@Test
	public void testlogin1() throws InterruptedException {
		
		Registration rg = new Registration(driver);
		rg.clickonlink();
		
	}

	
	@Test
	public void testlogin2() throws InterruptedException, IOException {
		
		Registration rg = new Registration(driver);
		String Fname = "Ananya";
		String Lname = "Shukla";
		rg.credential(Fname, Lname);
	/*	String expectedname = "Ananya";
		String actualname = "Manya";
		Assert.assertEquals(actualname, expectedname);
		assertTrue(true); */
		
		if(Fname.equals("Ananya") && Lname.equals("Shukla"))
		{
			System.out.println("Test Passed");
			Assert.assertTrue(true);
			System.out.println("test case pass");
		}
		else
		{
			//BaseTest test = new BaseTest();
			captureScreenShot(driver,"VerifyLogin");
			Assert.assertTrue(false);
		}
		
	}
	
	@Test
	public void testlogin3() throws InterruptedException {
		
		Registration rg = new Registration(driver);
		rg.dob();
		rg.signup();
		
		
	}
	
	
	
	
}
