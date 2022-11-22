package POMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@href='/apparel-shoes']")
	private WebElement Apparelandshoes_Link;
	public WebElement getApparelandshoes_Link() {
		return Apparelandshoes_Link;
	}
	@FindBy(xpath="//div[@class='page-title']")
	private WebElement Apparelandshoes_Text;
	public WebElement getApparelandshoes_Text() {
		return Apparelandshoes_Text;
	}
	
}
