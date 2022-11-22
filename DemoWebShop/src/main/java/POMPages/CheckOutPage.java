package POMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage {
	public CheckOutPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//input[@title='Continue']")
	private WebElement Continue_Billing;
	
	public WebElement getContinue_Billing() {
		return Continue_Billing;
	}
	@FindBy(id="PickUpInStore")
	private WebElement InStorePickup_CheckBox;

	public WebElement getInStorePickup_CheckBox() {
		return InStorePickup_CheckBox;
	}
	@FindBy(xpath="//input[@onclick='Shipping.save()']")
	private WebElement Continue_Shipping;

	public WebElement getContinue_Shipping() {
		return Continue_Shipping;
	}
	@FindBy(xpath="//input[@onclick='PaymentMethod.save()']")
	private WebElement Continue_PaymentMethod;

	public WebElement getContinue_PaymentMethod() {
		return Continue_PaymentMethod;
	}
	@FindBy(xpath="//input[@onclick='PaymentInfo.save()']")
	private WebElement Continue_PaymentInfo;

	public WebElement getContinue_PaymentInfo() {
		return Continue_PaymentInfo;
	}
	@FindBy(xpath="//input[@onclick='ConfirmOrder.save()']")
	private WebElement Confirm_Order;

	public WebElement getConfirm_Order() {
		return Confirm_Order;
	}
	
	
}
