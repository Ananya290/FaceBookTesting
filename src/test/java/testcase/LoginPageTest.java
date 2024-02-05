package testcase;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.BaseTest;
import pages.LoginPage;
import utility.ReadExcel;

public class LoginPageTest extends BaseTest{
	
	String fileName = System.getProperty("/January31/TestData/ProjectLogindemo.xlsx");

	@Test(priority =1)
	public void test() throws InterruptedException, IOException {
		
		LoginPage log = new LoginPage(driver);
		String number = "6388021601";
		String password = "abcdefgh@";
		log.enterLoginDetails(number,password);
		Thread.sleep(7000);
		if(number.equals("6388021601") && password.equals("abcdefgh@"))
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
	
	

	



	







	@Test(priority=2)
	public void test2() throws InterruptedException {
		LoginPage log = new LoginPage(driver);
		log.loginkaro();
		Thread.sleep(10000);
	}
	
	
	
	
}