package POMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage {
	public ShoppingCartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//span[@class='cart-label']")
	private WebElement ShoppingCart_Link;
	
	public WebElement getShoppingCart_Link() {
		return ShoppingCart_Link;
	}
	@FindBy(xpath="//div[@class='page-title']")
	private WebElement Shoppingcart_Text;
	
	
	public WebElement getShoppingcart_Text() {
		return Shoppingcart_Text;
	}
	@FindBy(id="CountryId")
	private WebElement Country_Dropdown;
	public WebElement getCountry_Dropdown() {
		return Country_Dropdown;
	}
	@FindBy(xpath="//input[@class='zip-input']")
	private WebElement Zip_code;
	public WebElement getZip_code() {
		return Zip_code;
	}
	@FindBy(id="termsofservice")
	private WebElement Check_Box;
	public WebElement getCheck_Box() {
		return Check_Box;
	}
	@FindBy(id="checkout")
	private WebElement Checkout_Button;
	public WebElement getCheckout_Button() {
		return Checkout_Button;
	}
	@FindBy(xpath="//div[@class='page-title']")
	private WebElement Checkout_Text;
	public WebElement getCheckout_Text() {
		return Checkout_Text;
	}

}
