package POMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
	public CartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div[@class='product-name']")
	private WebElement Product_Name;
	
	public WebElement getProduct_Name() {
		return Product_Name;
	}
	@FindBy(xpath="//select[@name='product_attribute_5_7_1']")
	private WebElement Size_Dropdown;

	public WebElement getSize_Dropdown() {
		return Size_Dropdown;
	}
	@FindBy(xpath="//input[@id='addtocart_5_EnteredQuantity']")
	private WebElement Qty_Textfield;

	public WebElement getQty_Textfield() {
		return Qty_Textfield;
	}
	@FindBy(id="add-to-cart-button-5")
	private WebElement Addtocart_Button;

	public WebElement getAddtocart_Button() {
		return Addtocart_Button;
	}
	@FindBy(xpath="//div[@id='bar-notification']")
	private WebElement ProductAdded_Notification;

	public WebElement getProductAdded_Notification() {
		return ProductAdded_Notification;
	}
	
}
