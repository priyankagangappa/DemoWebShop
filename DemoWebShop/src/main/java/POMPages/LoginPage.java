package POMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='Log in']")
	private WebElement Login_Link;
	
	public WebElement getLogin_Link() {
		return Login_Link;
	}
	@FindBy(id="Email")
	private WebElement Email_TextField;

	public WebElement getEmail_TextField() {
		return Email_TextField;
	}
	@FindBy(id="Password")
	private WebElement Password_Textfiled;

	public WebElement getPassword_Textfiled() {
		return Password_Textfiled;
	}
	@FindBy(id="RememberMe")
	private WebElement RememeberMe_Checkbox;

	public WebElement getRememeberMe_Checkbox() {
		return RememeberMe_Checkbox;
	}
	@FindBy(xpath="//input[@class='button-1 login-button']")
	private WebElement Login_Button;

	public WebElement getLogin_Button() {
		return Login_Button;
	}
}
