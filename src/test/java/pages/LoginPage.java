package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginPage {
	
	
	@FindBy(id="email")
	public static WebElement Txtbox_Username;
	
	@FindBy(id="pass")
	public static WebElement Txtbox_Password;
	
	@FindBy(name="login")
	public static WebElement Btn_login;

	
	


	public LoginPage(WebDriver driver) {

		PageFactory.initElements(driver, this);
		// driver can now work with your elements and methods of this class
	
}
	
	


	    public void enterLoginDetails(String number, String password) {
	    	Txtbox_Username.sendKeys(number);
	    	Txtbox_Password.sendKeys(password);
	    	
	    	
	    		    	
	    }
	    
	   public void loginkaro() {
	    	
	    	Btn_login.click(); 

	    	
	    }
	    
	    
}