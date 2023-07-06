package myseleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TotalLinks {
	/**
	 * 1.Total Number links 
	 * 2.print the text of each link on the console
	 * 3.print only links which are having text with their index number
	 * 4.find out the blank or broken links 
	 */
	static WebDriver driver;

	public static void main(String[] args) {
//		ChromeOptions co = new ChromeOptions();
//		co.addArguments("--remote-allow-origins=*");
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHYAM\\APIAutomation\\SeleniumSession\\chromedriver.exe");
		
		io.github.bonigarcia.wdm.WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		//driver.get("https://naveenautomationlabs.com/opencart/"); //Enter UR
		driver.get("https://www.amazon.com/");
		
		//When we are using findelements we will not do any actions
		//len() is used afor array
		//size is used for list of webelements
		
		List<WebElement> linksList = driver.findElements(By.tagName("a"));
//		System.out.println("total links: " + linksList.size());
//		
//		for(int i=0; i<linksList.size(); i++) {
//			String text = linksList.get(i).getText();
//		    	if(!text.isEmpty()) {
//		    		System.out.println(i + ":" +text);
//		    	
//		    	}
//		}
		
//		int count = 0;
//		for(WebElement e : linksList) {
//			String text = e.getText();
//			if(!text.isEmpty()) {
//	    		System.out.println(count + ":" +text);	    	    
//	    	}
//			count++;
//		}
//
//	}
	
		By links = By.tagName("a");
		By imags = By.tagName("img");
		By links_xpath = By.xpath("//a[@href]");
		
		int totalLinks = getPageLinksCount(links);
		System.out.println("page links : " + totalLinks);
		
		int totalimgs = getPageLinksCount(imags);
		System.out.println("Imags: " + totalimgs);
		
		int linksxpath = getPageLinksCount(links_xpath);
		System.out.println("totallinks: "+ linksxpath);
		
		List<String> linkstextlist = getElementsTextList(links);
		if(linkstextlist.contains("Careers")) {
			System.out.println("PASS");
		}
		
		System.out.println("Non blank list: "+ getElmentsTextCount(links));
		System.out.println("Blank links: "+ getEmptyEletextList(links));
		
	}
	
	public static int getEmptyEletextList(By locator) {
		int totallinks = getPageLinksCount(locator);
		int totalNonEmptyLinks = getElmentsTextCount(locator);
		return totallinks - totalNonEmptyLinks;
	}
	
	/*
	 * Non blank list count
	 */
	public static int getElmentsTextCount(By locator) {
		return getElementsTextList(locator).size();
	}
	
	/**
	 * This will get the link text values with help of locators
	 * 2.Non blank text list
	 * @param locator
	 * @return
	 */
	public static List<String> getElementsTextList(By locator) {
		List<WebElement> eleList = getElements(locator);
		List<String> eleTextlist = new ArrayList<String>();
		for(WebElement e : eleList) {
			String text = e.getText();
			if(!text.isEmpty()) {
				eleTextlist.add(text);
			}
		}
		return eleTextlist;
	}
	
	/**
	 * Total Number of a links on a page
	 * @return 
	 */
	public static int getPageLinksCount(By locator) {
		return getElements(locator).size();
	}
	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

}
