package myseleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandleLinksElement {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		
		
//		ChromeOptions co = new ChromeOptions();
//		co.addArguments("--remote-allow-origins=*");
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHYAM\\APIAutomation\\SeleniumSession\\chromedriver.exe");
		
		io.github.bonigarcia.wdm.WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		//driver.get("https://naveenautomationlabs.com/opencart/"); //Enter UR
		driver.get("https://www.orangehrm.com/hris-hr-software-demo/");
		//driver.findElement(By.linkText("macBook")).click();
		
//		By maclink = By.linkText("MacBook");
//		ElementUtil eleutil = new ElementUtil(driver);
//		eleutil.doClick(maclink);
		
		//driver.findElement(By.linkText("Contact Sales")).click();

		
//		String contactsales_text = "CONTACT SALES";
//		ElementUtil eleutil = new ElementUtil(driver);
//		eleutil.doClick(contactsales_text,"linktext");
		
		//2.partial Linktext
				
	}

}

//Linktext and partial linktext will only work for links 