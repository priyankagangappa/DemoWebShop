package GenericLibrary;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {
	public WebDriver driver;
	
	@BeforeClass
	public void BrowserSetup() {
		WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demowebshop.tricentis.com/");
		
	}
	@AfterMethod
	public void ClosingBrowser() {
		driver.quit();
	}
}
