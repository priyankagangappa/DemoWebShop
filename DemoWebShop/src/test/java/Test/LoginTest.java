package Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.Reporter;
import org.testng.annotations.Test;

import GenericLibrary.BasePage;
import POMPages.LoginPage;

public class LoginTest extends BasePage {
	@Test
	public void login() {
		LoginPage login=new LoginPage(driver);
		login.getLogin_Link().click();
		Reporter.log("Login page is displayed", true);
		
		//Email id
		login.getEmail_TextField().sendKeys("Priyagm123@gmail.com");
		Reporter.log("Email id is entered");
		//Password
		login.getPassword_Textfiled().sendKeys("Priyagm@123");
		Reporter.log("Password is entered");
		//Login button
		login.getLogin_Button().click();
		Reporter.log("Clicked on Login button");
	}

}
