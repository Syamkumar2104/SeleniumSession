package myseleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LocatorsConcept {
	
	static WebDriver driver;

	public static void main(String[] args) {

 
//		ChromeOptions co = new ChromeOptions();
//		co.addArguments("--remote-allow-origins=*");
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHYAM\\APIAutomation\\SeleniumSession\\chromedriver.exe");
		
		io.github.bonigarcia.wdm.WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login"); //Enter UR
		
		//WebElement + actions(click,sendkeys,gettext, isDisplayed....)
		
		//To create a web elemenent we have two imp methods
		//1.Find element  -- single element
		//2.find elements -- to interact ith multiple elements 
		
		
		//1.id
		
		//1st approach:
//		driver.findElement(By.id("input-email")).sendKeys("syamkumarjerra@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("syam@123");
		
		//2nd approach
//		WebElement emailid = driver.findElement(By.id("input-email"));
//		WebElement passwd = driver.findElement(By.id("input-password"));
//		
//		emailid.sendKeys("syamkkuamr@gmail.com");
//		passwd.sendKeys("syam123");
		
		//3rd Approch:by locator approach : By + webelement + action   ----------> Object Repository(OR)
//		By emailId = By.id("input-email");
//		By passwrd = By.id("input-password");
//		
//		WebElement emailEle = driver.findElement(emailId);
//		WebElement passwdEle = driver.findElement(passwrd);
//		
//		emailEle.sendKeys("syamkkuamr@gmail.com");
//		passwdEle.sendKeys("syam123");
		
		//4th Approach: By locator + generic function
//		By emailId = By.id("input-email");
//		By passwrd = By.id("input-password");
//		
//		getElement(emailId).sendKeys("syam@gmail.com");
//		getElement(passwrd).sendKeys("syam@123");
		
		
		//5th Approach: generic fuction for element and actions
//		By emailId = By.id("input-email");
//		By passwrd = By.id("input-password");
//		
//		dosendkeys(emailId,"syam@gmail.com");
//		dosendkeys(passwrd,"syamkumar");
		
		//6th Approach: Bylocator ,generic fuctions for element and action sin som eutil class:
//		By emailId = By.id("input-email");
//		By passwrd = By.id("input-password");
//		
//		ElementUtil eleutil = new ElementUtil(driver);
//		eleutil.dosendkeys(emailId,"syam@gmail.com");
//		eleutil.dosendkeys(passwrd, "sam@123");
		
		//7th utils in a diiferent class
		
		//8th String Locator + generic fuctions for element and actions in some util class
		String email_id = "input-email";
		String passwd_id = "input-password";
		By email = By.id(email_id);
		By passwrd = By.id(passwd_id);
		
//		dosendkeys(getBy(email_id),"syam@123gmail.com");
//		dosendkeys(getBy(passwd_id), "sam@123");
	}
	
	
	
	public static By getBy(String locatorType , String selector) {
//		By locator = By.id(selector);
//		return locator;
		
		By locator = null;
		
		switch (locatorType.toLowerCase()){
			case "id":
				locator = By.id(selector);
				
				break;
				
			default:
				break;
		}
		
		return locator;
		
	}
	
	public static void dosendkeys(String locatorType,String selector,String value) {
		By locator = getBy(locatorType, selector);
		getElement(locator).sendKeys(value);
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
		
	}
	
	public static void dosendkeys(By locator, String value) {
		getElement(locator).sendKeys(value);
		
	}

}
