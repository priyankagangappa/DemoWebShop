package POMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='Register']")
	private WebElement Register_Link;
	
	public WebElement getRegister_Link() {
		return Register_Link;
	}
	@FindBy(xpath="//div[@class='page-title']")
	private WebElement Register_Text;
	
	public WebElement getRegister_Text() {
		return Register_Text;
	}
	@FindBy(id="gender-female")
	private WebElement Gender_Radiobutton;

	public WebElement getGender_Radiobutton() {
		return Gender_Radiobutton;
	}
	@FindBy(id="FirstName")
	private WebElement Firstname_Textfield;

	public WebElement getFirstname_Textfield() {
		return Firstname_Textfield;
	}
	@FindBy(id="LastName")
	private WebElement Lastname_Textfield;

	public WebElement getLastname_Textfield() {
		return Lastname_Textfield;
	}
	@FindBy(id="Email")
	private WebElement Email_Textfield;

	public WebElement getEmail_Textfield() {
		return Email_Textfield;
	}
	@FindBy(id="Password")
	private WebElement Password_Textfield;

	public WebElement getPassword_Textfield() {
		return Password_Textfield;
	}
	@FindBy(id="ConfirmPassword")
	private WebElement ConfirmPassword_Textfield;

	public WebElement getConfirmPassword_Textfield() {
		return ConfirmPassword_Textfield;
	}
	@FindBy(id="register-button")
	private WebElement Registe_Button;

	public WebElement getRegiste_Button() {
		return Registe_Button;
	}
}