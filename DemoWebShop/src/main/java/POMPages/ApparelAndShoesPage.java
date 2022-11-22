package POMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApparelAndShoesPage {
	public ApparelAndShoesPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//option[text()='Position']")
	private WebElement Sortby_Dropdown;
	
	public WebElement getSortby_Dropdown() {
		return Sortby_Dropdown;
	}
	@FindBy(xpath="//option[text()='Grid']")
	private WebElement Viewas_Dropdown;

	public WebElement getViewas_Dropdown() {
		return Viewas_Dropdown;
	}
	@FindBy(xpath="//select[@name='products-pagesize']")
	private WebElement Display_Dropdown;

	public WebElement getDisplay_Dropdown() {
		return Display_Dropdown;
	}
	@FindBy(xpath="//img[@src='https://demowebshop.tricentis.com/content/images/thumbs/0000018_50s-rockabilly-polka-dot-top-jr-plus-size_125.jpg']")
	private WebElement Product_Link;

	public WebElement getProduct_Link() {
		return Product_Link;
	}
	@FindBy(xpath="//strong[@class='current-item']")
	private WebElement Product_Text;

	public WebElement getProduct_Text() {
		return Product_Text;
	}
	
	
	
	
//	@FindBy(xpath="//div[@class='page-title']")
//	private  WebElement Apparelandshoes_page;
//	public WebElement getApparelandshoes_page() {
//		return Apparelandshoes_page;
//	}
//	@FindBy(xpath="//option[text()='Position']")
//	private WebElement Sortby_Dropdown;
//	public WebElement getSortby_Dropdown() {
//		return Sortby_Dropdown;
//	}
//	@FindBy(xpath="//option[text()='Grid']")
//	private WebElement Viewas_Dropdown;
//	public WebElement getViewas_Dropdown() {
//		return Viewas_Dropdown;
//	}
//	@FindBy(xpath="//option[text()='8']")
//	private WebElement Display_Dropdown;
//	public WebElement getDisplay_Dropdown() {
//		return Display_Dropdown;
//	}
//	@FindBy(xpath="//img[@src='https://demowebshop.tricentis.com/content/images/thumbs/0000018_50s-rockabilly-polka-dot-top-jr-plus-size_125.jpg']")
//	private WebElement Image_Link;
//	public WebElement getImage_Link() {
//		return Image_Link;
//	}
//	@FindBy(xpath="//strong[@class='current-item']")
//	private WebElement Image_Text;
//	public WebElement getImage_Text() {
//		return Image_Text;
//	}
//	
//	
	
}
