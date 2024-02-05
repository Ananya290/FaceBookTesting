package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Registration {
	
	
	@FindBy(xpath= "//a[@data-testid='open-registration-form-button']")
	public static WebElement CREATE_Account;
	
	@FindBy(name="firstname")
	public static WebElement FIRST_Name;
	
	@FindBy(name="lastname")
	public static WebElement LAST_Name;
	
	@FindBy(id="password_step_input")
	public static WebElement pass;
	
	@FindBy(xpath="//input[@name='reg_email__']")
	public static WebElement email;
	
	@FindBy(xpath="//input[@name='reg_email_confirmation__']")
	public static WebElement reemail;
	
	@FindBy(id="day")
	public static WebElement Day;
	
	@FindBy(id="month")
	public static WebElement Month;
	
	@FindBy(id="year")
	public static WebElement Year;
	
	@FindBy(xpath="//input[@name='sex' and @value='1']")
	public static WebElement gender;
	
	@FindBy(xpath="//button[@name=\'websubmit\']")
	public static WebElement SignUp;
	
	
	
	
	
	

	public Registration(WebDriver driver) {

		PageFactory.initElements(driver, this);
		// driver can now work with your elements and methods of this class
	
}

	
	public void clickonlink() throws InterruptedException {
		
		CREATE_Account.click();
		
		
	}
	
	public void credential(String Fname,String Lname) throws InterruptedException {
		 FIRST_Name.sendKeys(Fname);
		 LAST_Name.sendKeys(Lname);
		 
		 pass.sendKeys("love");
		 email.sendKeys("manya@.com");
		 reemail.sendKeys("manya@.com");
		 pass.sendKeys("lovely");
		 gender.click();
		 Thread.sleep(7000);
		 
		
	}
	
	public void dob() {
		
		Select daydropdown = new Select(Day);
		Select monthdropdown = new Select(Month);
		Select yeardropdown = new Select(Year);
		
		daydropdown.selectByVisibleText("7");
		monthdropdown.selectByVisibleText("Apr");
        yeardropdown.selectByVisibleText("2000");

		

		
	}
	

	
	public void signup() throws InterruptedException {
		
		SignUp.click();
		Thread.sleep(2000);
		
	}

}
