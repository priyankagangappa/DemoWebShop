package Test;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

import GenericLibrary.BasePage;
import POMPages.ApparelAndShoesPage;
import POMPages.CartPage;
import POMPages.CheckOutPage;
import POMPages.HomePage;
import POMPages.LoginPage;
import POMPages.RegisterPage;
import POMPages.ShoppingCartPage;
import POMPages.ThankYouPage;

public class ApparelAndShoesTest extends BasePage {


	@Test
	public void Apparelandshoes() throws InterruptedException {
		LoginPage login = new LoginPage(driver);
		// Login Link
		login.getLogin_Link().click();
		Reporter.log("Login page is displayed", true);
		assertTrue(login.getLogin_Text().isDisplayed(), "Welcome, sign in text should not be displayed");

		// Email id
		login.getEmail_TextField().sendKeys("pinkypriya@123gmail.com");
		Reporter.log("Email id is entered", true);
		// Password
		login.getPassword_Textfiled().sendKeys("PinkyPriya@123");
		Reporter.log("Password is entered", true);
		// Login button
		login.getLogin_Button().click();
		Reporter.log("Clicked on Login button",true);

		HomePage home = new HomePage(driver);
		Reporter.log("Homepage is displayed", true);
		
		home.getApparelandshoes_Link().click();
		Reporter.log("apparel and shoes page is diplayed", true);
		assertTrue(home.getApparelandshoes_Text().isDisplayed(), "apparel and shoes page is not displayed");
		//Apparel and shoes page
		ApparelAndShoesPage apparel = new ApparelAndShoesPage(driver);
		//Sort by dropdown
		Reporter.log("By default position option should be displyed in sort by dropdown", true);
		assertTrue(apparel.getSortby_Dropdown().isDisplayed(), "By default position should not be displayed in sort by dropdown");
		//View as dropdown
		Reporter.log("By default grid option should be diplayed in view as dropdown", true);
		assertTrue(apparel.getViewas_Dropdown().isDisplayed(), "By default grid should not be displayed in view as dropdown");
		//Display dropdown
		Reporter.log("By default 8 should be diplayed in display dropdown", true);
		//assertTrue(apparel.getViewas_Dropdown().isDisplayed(), "By default 8 should not be displayed in display dropdown");
		//Selecting product
		apparel.getProduct_Link().click();
		Reporter.log("product is displayed", true);
		assertTrue(apparel.getProduct_Text().isDisplayed(), "Product is not displayed");
		//CartPage
		//Product name
		CartPage cart=new CartPage(driver);
		Reporter.log("Product name should be displayed", true);
		assertTrue(cart.getProduct_Name().isDisplayed(), "Product name is not displayed");
		//Size dropdown
		Reporter.log("By default small should be displaed in size dropdown", true);
		assertTrue(cart.getSize_Dropdown().isDisplayed(), "By default small is not displayed i size dropdown");
		//Qty Textfield
		Reporter.log("By default 1 should be displayed in qty textfield", true);
		assertTrue(cart.getQty_Textfield().isDisplayed(), "By default 1 is not displayed in qty textfield");
		//Cart Button
		cart.getAddtocart_Button().click();
		Thread.sleep(2000);
		Reporter.log("Product is added to cart  msg should be displayed", true);
		assertTrue(cart.getProductAdded_Notification().isDisplayed(), "Product is added msg is not diplayed");		
		}
	@Test
	public void shopping() throws InterruptedException {
		ShoppingCartPage shop = new ShoppingCartPage(driver);
		//Shopping cart page
		shop.getShoppingCart_Link().click();
		Reporter.log("Shopping cart text should be displayed", true);
		assertTrue(shop.getShoppingcart_Text().isDisplayed(), "Shopping cart text is not diplayed");
		//Country Dropdown
		Select country=new Select(shop.getCountry_Dropdown());
		country.selectByVisibleText("India");
		Reporter.log("Country is selected", true);
		//Zip/Postal code
		shop.getZip_code().clear();
		shop.getZip_code().sendKeys("560085");
		Reporter.log("Zip postel code is entered", true);
		//Terms and conditions checkbox
		shop.getCheck_Box().click();
		Reporter.log("Checkbox is checked", true);
		//Checkout Button
		shop.getCheckout_Button().click();
		Reporter.log("check out page is diplayed", true);
		//assertTrue(shop.getCheckout_Text().isDisplayed(), "check out  page is not diplayed");
	//	Thread.sleep(2000);
		
		//Checkout page
		CheckOutPage checkout=new CheckOutPage(driver);
		Reporter.log("checkout page is displayed", true);
		
		checkout.getContinue_Billing().click();
		Reporter.log("Billing address is successfull", true);
		
		checkout.getInStorePickup_CheckBox().click();
		Reporter.log("clicked on instore pick up", true);
		
		checkout.getContinue_Shipping().click();
		Reporter.log("Shipping is successfull", true);
		
		checkout.getContinue_PaymentMethod().click();
		Reporter.log("Payment methodn is successfull", true);
		
		checkout.getContinue_PaymentInfo().click();
		Reporter.log("Payment info is successfull", true);
		
		checkout.getConfirm_Order().click();
		Reporter.log("Ordfer is confirm", true);
		
		
		
		//ThankYouPage
		ThankYouPage thankyou=new ThankYouPage(driver);
		Reporter.log("Thank you page is displayed", true);
		assertTrue(thankyou.getThankYou_Text().isDisplayed(), "Thank you page is not displayed");
		
		thankyou.getContinue_Thankyou().click();
		Reporter.log("home page should be displayed", true);
		assertTrue(thankyou.getTital_Homepage().isDisplayed(), "Tital page is not displayed");
		//Reporter.log("Thank you page is displayed", true);
		
	
		
		
//		ApparelAndShoesPage apparel = new ApparelAndShoesPage(driver);
//		apparel.getImage_Link().click();
//		Reporter.log("sort by dropdown", true);
////		assertTrue(apparel.getSortby_Dropdown().isDisplayed(), "By default position should not  be displayed");
//
//		Reporter.log("Viewas dropdown", true);
////		assertTrue(apparel.getViewas_Dropdown().isDisplayed(), "By default grid should not displayed");
//
//		Reporter.log("Display dropdown", true);
////		assertTrue(apparel.getDisplay_Dropdown().isDisplayed(), "By default 8 should not displayed");
//
//		apparel.getImage_Link().click();
//		Reporter.log("Product is clicked");
//		assertTrue(apparel.getImage_Link().isDisplayed(), "Product shold not be displayed");
//		Thread.sleep(2000);
//	}
//
//	@Test
//	public void Cart() throws InterruptedException {
//		CartPage cart = new CartPage(driver);
//		Reporter.log("Product text should be diplyed");
//		assertTrue(cart.getProduct_Text().isDisplayed(), "Product text is not dispayed");
//
//		Reporter.log("Product name should be diplayed");
//		assertTrue(cart.getProduct_Name().isDisplayed(), "Product name not displayed");
//
//		Reporter.log("By default size dropdown should be diplayed as small");
//		assertTrue(cart.getSize_Dropdown().isDisplayed(), "By default size dropdown should not be displayed as small");
//
//		Reporter.log("By default Qty text field is diplayed as 1");
//		assertTrue(cart.getQty_Textfield().isDisplayed(), "By default qty textfield should not be diplayed as 1");
//
//		cart.getCart_Button().click();
//		assertTrue(cart.getPopUp_msg().isDisplayed(), "popup msg is not displayed");
//
//		cart.getShoppingCart_Link().click();
//		Reporter.log("Shopping cart page is displayed");
//		assertTrue(cart.getShoppingCart_Text().isDisplayed(), "Shopping cart page is not displayed");
//	}
//
//	@Test
//	public void ShoppingCart() {
//		ShoppingCartPage shoppingcart = new ShoppingCartPage(driver);
//		Select sel = new Select(shoppingcart.getCountry_Dropdown());
//		sel.selectByVisibleText("India");
//		Reporter.log("Country is selected");
//
//		shoppingcart.getZip_code().sendKeys("560085");
//		Reporter.log("Zip cod eis entered");
//
//		shoppingcart.getCheck_Box().click();
//		Reporter.log("terms and conditions checkbox is checked");
//
//		shoppingcart.getCheckout_Button().click();
//		Reporter.log("Chekout button is clicked");
//		//assertTrue(shoppingcart.getCheckout_Text().isDisplayed(), "Checkoutpage is not displayed");
//	
//		
//		CheckOutPage check=new CheckOutPage(driver);
//		Select select=new Select(check.getCountry_dropdown());
//		select.selectByVisibleText("India");
//		check.getCity_textfield().sendKeys("Bengaluru");
//		check.getContinue_Billing().click();
//		
//		check.getPickup_Instore().click();
//		
//		check.getContinue_Shipping().click();
//		
//		check.getContinue_Payment().click();
//		
//		check.getContinue_PaymentInformation().click();
//		
//		check.getConfirm_Button().click();
//	
//		check.getContinue_ThankYouPage().click();
	}
}
