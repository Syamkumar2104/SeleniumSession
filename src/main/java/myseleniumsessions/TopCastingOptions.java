package myseleniumsessions;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class TopCastingOptions {

	public static void main(String[] args) {

//		ChromeOptions co = new ChromeOptions();
//		co.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHYAM\\APIAutomation\\SeleniumSession\\chromedriver.exe");
		//1.Cross Browser ------------> Recommended 
		//local execution
//		WebDriver driver = new ChromeDriver();
//		WebDriver driver1 = new FirefoxDriver();
//		WebDriver driver2 = new SafariDriver();
//		
//		
//		//2.Only ChromeDriver ---------------- not recommened for cross browser
//		ChromeDriver d1 = new ChromeDriver();
//		
//		//3. RWD - CD  ------------------> Recommended 
//		RemoteWebDriver driverrem = new ChromeDriver();
//		driverrem.get("https://www.google.com");
//		driverrem.quit();
		
		//4.WD - RWD ---------------------> Recommmend for remote executions 
		//Remote execution :grid ,cloud,aws,docker grid
		//WebDriver driver = new RemoteWebDriver(remoteAddress, capabilites);
		
		//5.Search Context -- ChromeDriver ------------- > Not recommended
		//SearchContext driver = new ChromeDriver();
		

	}

}
