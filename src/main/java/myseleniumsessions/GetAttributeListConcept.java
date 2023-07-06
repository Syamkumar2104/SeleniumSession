package myseleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetAttributeListConcept {
	
	static WebDriver driver;

	public static void main(String[] args) {
//		ChromeOptions co = new ChromeOptions();
//		co.addArguments("--remote-allow-origins=*");
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHYAM\\APIAutomation\\SeleniumSession\\chromedriver.exe");
		
		io.github.bonigarcia.wdm.WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		//driver.get("https://naveenautomationlabs.com/opencart/"); //Enter UR
		driver.get("https://www.amazon.com");
		List<WebElement> linksList = driver.findElements(By.tagName("a"));
		
//		for(WebElement e : linksList) {
//			String hrefval = e.getAttribute("href");
//			System.out.println(hrefval);
//		}
		
		
		By links = By.tagName("a");
		By imgs = By.tagName("img");
		
		System.out.println(getAttributelist(links,"href"));
		System.out.println(getAttributelist(imgs,"alt"));
	}
	
	
	public static List<String> getAttributelist(By locator, String attrName) {
		List<WebElement> eleList =getElements(locator);
		List<String> eleattrvalue = new ArrayList<String>();
		for(WebElement e : eleList) {
			String attrvalue = e.getAttribute(attrName);
			eleattrvalue.add(attrvalue);
		}
		return eleattrvalue;
		
	}
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}


}
