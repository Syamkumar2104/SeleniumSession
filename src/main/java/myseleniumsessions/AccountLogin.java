package myseleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AccountLogin {

	public static void main(String[] args) {
		
		
//		ChromeOptions co = new ChromeOptions();
//		co.addArguments("--remote-allow-origins=*");
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHYAM\\APIAutomation\\SeleniumSession\\chromedriver.exe");
		
		io.github.bonigarcia.wdm.WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/"); //Enter URL
		
		String Title = driver.getTitle();
		System.out.println("Title of the page: " + Title);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current Url is: " +currentUrl);
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		String accounttitle = driver.getTitle();
		System.out.println("Title of the page: " + accounttitle);
		
		
		driver.quit();

	}

}
