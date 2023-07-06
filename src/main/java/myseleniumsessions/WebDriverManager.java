package myseleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverManager {

	public static void main(String[] args) {
		
		
//		ChromeOptions co = new ChromeOptions();
//		co.addArguments("--remote-allow-origins=*");
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHYAM\\APIAutomation\\SeleniumSession\\chromedriver.exe");
		
		io.github.bonigarcia.wdm.WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com"); //Enter URL
		
		String Title = driver.getTitle();
		System.out.println("Title of the page: " + Title);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current Url is: " +currentUrl);
		
		//driver.quit();

	}

}
