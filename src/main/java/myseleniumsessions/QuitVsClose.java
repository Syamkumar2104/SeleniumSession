package myseleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class QuitVsClose {

	public static void main(String[] args) {
		
		
//		ChromeOptions co = new ChromeOptions();
//		co.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHYAM\\APIAutomation\\SeleniumSession\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/"); //Enter URL
		//driver.get("www.google.com"); //Enter URL Exception in thread "main" org.openqa.selenium.InvalidArgumentException: invalid argument
		String Title = driver.getTitle();
		System.out.println("Title of the page: " + Title);
				
//		//Verification point/checkpoint/assertion/actual vs expected value
//		if(Title.equals("Your Store")) {
//			
//			System.out.println("Correct title: " + Title);
//		}
//		else {
//			System.out.println("Incorrect Title: " + Title);
//		}
		
		//Automation steps + Verification point(Checkpoint) == Automation Testing
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current Url is: " +currentUrl);
		
		//String pagesource = driver.getPageSource();
		//System.out.println("Page Source: " + pagesource.contains(pagesource)));
		
		//driver.quit(); //session ID will be closed here 
		//System.out.println(driver.getTitle());//Exception in thread "main" org.openqa.selenium.NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?
		
//		driver = new ChromeDriver(co); // new Session ID will be created in case of this scenario sid:456
//		driver.get("https://naveenautomationlabs.com/opencart/"); //Enter URL
//		System.out.println(driver.getTitle());
		
		driver.close();
		//System.out.println(driver.getTitle()); //Exception in thread "main" org.openqa.selenium.NoSuchSessionException: invalid session id (Same session id will be present
		
		driver = new ChromeDriver(); // new Session ID will be created in case of this scenario sid:456
		driver.get("https://naveenautomationlabs.com/opencart/"); //Enter URL
		System.out.println(driver.getTitle());
	}

}
