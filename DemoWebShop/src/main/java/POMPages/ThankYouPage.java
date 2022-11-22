package POMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ThankYouPage {
	public ThankYouPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//div[@class='page-title']")
	private WebElement ThankYou_Text;
	
	public WebElement getThankYou_Text() {
		return ThankYou_Text;
	}
	@FindBy(xpath="//input[@class='button-2 order-completed-continue-button']")
	private WebElement Continue_Thankyou;

	public WebElement getContinue_Thankyou() {
		return Continue_Thankyou;
	}
	@FindBy(xpath="//img[@alt='Tricentis Demo Web Shop']")
	private WebElement Tital_Homepage;

	public WebElement getTital_Homepage() {
		return Tital_Homepage;
	}
	
	
	
}
