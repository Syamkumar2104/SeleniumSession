package myseleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverBasics {

	public static void main(String[] args) {
		
//		ChromeOptions co = new ChromeOptions();
//		co.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHYAM\\APIAutomation\\SeleniumSession\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com"); //Enter URL
		//driver.get("www.google.com"); //Enter URL Exception in thread "main" org.openqa.selenium.InvalidArgumentException: invalid argument
		String Title = driver.getTitle();
		System.out.println("Title of the page: " + Title);
				
		//Verification point/checkpoint/assertion/actual vs expected value
		if(Title.equals("Google")) {
			
			System.out.println("Correct title: " + Title);
		}
		else {
			System.out.println("Incorrect Title: " + Title);
		}
		
		//Automation steps + Verification point(Checkpoint) == Automation Testing
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current Url is: " +currentUrl);
		
		//String pagesource = driver.getPageSource();
		//System.out.println("Page Source: " + pagesource.contains(pagesource)));
		
		driver.quit();
	}

}
