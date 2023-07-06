package myseleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumLocators {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
//		ChromeOptions co = new ChromeOptions();
//		co.addArguments("--remote-allow-origins=*");
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHYAM\\APIAutomation\\SeleniumSession\\chromedriver.exe");
		
		io.github.bonigarcia.wdm.WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		//driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login"); //Enter UR
		driver.get("https://www.orangehrm.com/hris-hr-software-demo/");
		//2.name:
//		driver.findElement(By.name("email")).sendKeys("test@gmail.com");
//		driver.findElement(By.name("password")).sendKeys("test123");
		
//		By emailid = By.name("email");
//		String email_name = "email";
//		String email_password = "password";
//		
//		ElementUtil eleutil = new ElementUtil(driver);
//		eleutil.dosendkeys(emailid, "syam@gmal.com");
//		eleutil.dosendkeys("name", email_password, "test@123");
		
		
		//3.classname : look in feel of the element, classname can be duplicate fo rmultiple element ... use only when it is unique for the single element.
		
		//4.Xpath: xpath is not an attribute.
		//it is an address of th elemment in the HTML DOM
		
//		driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("syam@kumar@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("sam@123");
//		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
		
		
//		By emailId = By.xpath("//*[@id=\"input-email\"]");
//		String password = "//*[@id=\"input-password\"]";
//		By loginBtn = By.xpath("//*[@id=\\\"content\\\"]/div/div[2]/div/form/input");
//		
//		ElementUtil eleutil = new ElementUtil(driver);
//		eleutil.dosendkeys(emailId, "test@gmail.com");
//		eleutil.dosendkeys("xpath", password, "test@123");
//		eleutil.doClick(loginBtn);
		
//		doClick(loginBtn);
		
		//5.CSS Selector : Its not an attribute. 
		driver.findElement(By.cssSelector("#Form_getForm_FullName")).sendKeys("Jerr Syamkumar");
		driver.findElement(By.cssSelector("#Form_getForm_Email")).sendKeys("syam@rbbn.com");
		driver.findElement(By.cssSelector("#Form_getForm_Contact")).sendKeys("9582151759");
		driver.findElement(By.cssSelector("#Form_getForm_action_submitForm")).click();

	}
	
	public static void doClick(By locator) {
		getElement(locator).click();
		
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
