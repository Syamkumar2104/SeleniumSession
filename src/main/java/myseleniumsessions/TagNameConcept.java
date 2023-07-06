package myseleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TagNameConcept {
	
	static WebDriver driver;


	public static void main(String[] args) {
//		ChromeOptions co = new ChromeOptions();
//		co.addArguments("--remote-allow-origins=*");
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHYAM\\APIAutomation\\SeleniumSession\\chromedriver.exe");
		
		io.github.bonigarcia.wdm.WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		//driver.get("https://naveenautomationlabs.com/opencart/"); //Enter UR
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=product/product&product_id=43");
		
		String productname = driver.findElement(By.tagName("h1")).getText();
		System.out.println("Product Name is: " + productname);
		
		
		

	}
	

	public static String doElementGetText(By locator) {
		String eleText = getElement(locator).getText();
		return eleText;
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
