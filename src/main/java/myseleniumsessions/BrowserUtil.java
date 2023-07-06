package myseleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserUtil {
	
	private WebDriver driver; //Default value is always null
	
	/**
	 * This method is used to intialize the driver on the basis of given browser name
	 * @param browserName
	 * @return this retunrs driver
	 */
	
	public WebDriver initDriver(String browserName) {
		
		System.out.println("Browser Name: " + browserName);
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		if(browserName.equalsIgnoreCase("chrome")) {
			io.github.bonigarcia.wdm.WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(co);			
		}
		
		else if(browserName.equalsIgnoreCase("firefox")) {
			io.github.bonigarcia.wdm.WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();	
		}
		
		else if(browserName.equalsIgnoreCase("safari")) {
			driver = new SafariDriver();
		}
		
		else if(browserName.equalsIgnoreCase("edge")) {
			io.github.bonigarcia.wdm.WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();	
		}
		
		else {
			System.out.println("Please pass the correct browser Name: " + browserName);
		}
		
		return driver;			
	}
	
	/**
	 * 
	 * This method is used to launch the url
	 * @param url
	 */
	public void lunchUrl(String url) {
		if(url == null) {
			System.out.println("url is null...........");
			return;
		}
		if(url.indexOf("http") == -1) {
			System.out.println("url is not having http");
			return;
		}
		
		if(url.indexOf("https") == -1) {
			System.out.println("url is not having https");
		}
	
		driver.get(url);
	}
	
	/**
	 * This method is used to get the title
	 * @return
	 */
	public String getpagetitle() {
		
		String title = driver.getTitle();
		System.out.println("Page Title is: " + title);
		return title;
		
	}
	
	public String getpageurl() {
		String url = driver.getCurrentUrl();
		System.out.println("Page url is: " + url);
		return url;
	}
	
	public boolean isurlFractionExists(String urlFraction) {
		if(getpageurl().contains(urlFraction)) {
			return true;
		}
		return false;
	}
	
	public String getpagesource() {
		String pagesource = driver.getPageSource();
		//System.out.println("Page url is: " + pagesource);
		return pagesource;
	}
	
	public boolean isInfoExistInPageSource(String info) {
		if(getpagesource().contains(info)) {
			return true;
		}
		return false;
	}
		
	public void closeBrowser() {
		driver.close();
		System.out.println("Browser got closed using close");
	}
		
	public void quitBrowser() {
		driver.quit();
		System.out.println("Browser got closed using quit");
	}

	

}
