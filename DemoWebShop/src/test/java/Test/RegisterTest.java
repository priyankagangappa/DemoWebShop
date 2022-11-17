package Test;

import static org.testng.Assert.assertTrue;

import org.testng.Reporter;
import org.testng.annotations.Test;

import GenericLibrary.BasePage;
import POMPages.RegisterPage;

public class RegisterTest extends BasePage{
	@Test
	public void Register() {
		RegisterPage register=new RegisterPage(driver);
		//Register link
		register.getRegister_Link().click();
		Reporter.log("Clicked on Register link", true);
	
		//Gender radiobutton
		register.getGender_Radiobutton().click();
		Reporter.log("Clicked on radiobutton");
		//Firstname textfield
		register.getFirstname_Textfield().sendKeys("Priya");
		Reporter.log("Entered firstrname");
		//Lastname textfiled
		register.getLastname_Textfield().sendKeys("Malapur");
		Reporter.log("Entered Last name");
		//Email textfield
		register.getEmail_Textfield().sendKeys("Priyagm123@gmail.com");
		Reporter.log("Entered Email");
		//Password textfield
		register.getPassword_Textfield().sendKeys("Priyagm@123");
		Reporter.log("Password Entered");
		//Confirmpassword textfield
		register.getConfirmPassword_Textfield().sendKeys("Priyagm@123");
		Reporter.log("password is confirmed");
		//Register button
		register.getRegiste_Button().click();
		Reporter.log("clicked on register button");
	}
	

}
