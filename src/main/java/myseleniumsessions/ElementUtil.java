package myseleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtil {
	
	private WebDriver driver; 
	
	public By getBy(String locatorType , String selector) {
		
		By locator = null;
		
		switch (locatorType.toLowerCase()){
			case "id":
				locator = By.id(selector);
				break;
				
			case "name":
				locator = By.name(selector);
				break;
			
			case "class":
				locator = By.className(selector);
				break;
				
			case "xpath":
				locator = By.xpath(selector);
				break;
				
			case "cssselector":
				locator = By.cssSelector(selector);
				break;
				
			case "linktext":
				locator = By.linkText(selector);
				break;
				
			case "partiallinktext":
				locator = By.partialLinkText(selector);
				break;
				
			case "tagname":
				locator = By.tagName(selector);
				break;
				
			default:
				break;
		}
		
		return locator;
		
	}
	
	public ElementUtil(WebDriver driver) {
		this.driver = driver;
	}
		
	public WebElement getElement(By locator) {
		return driver.findElement(locator);		
	}
	
	public List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
	public void dosendkeys(String locatorType,String selector,String value) {
		By locator = getBy(locatorType, selector);
		getElement(locator).sendKeys(value);
	}
	
	public void dosendkeys(By locator, String value) {
		getElement(locator).sendKeys(value);		
	}
	
	public void doClick(By locator) {
		getElement(locator).click();	
	}
	
	public void doClick(String locatorType,String selector) {
		By locator = getBy(locatorType, selector);
		getElement(locator).click();	
	}
	
	public String doElementGetText(By locator) {
		String eleText = getElement(locator).getText();
		return eleText;
	}
	
	public String doGetAttributeValue(By locator, String attrName) {
		return getElement(locator).getAttribute(attrName);
	}
	
	public int getEmptyEletextList(By locator) {
		int totallinks = getPageLinksCount(locator);
		int totalNonEmptyLinks = getElmentsTextCount(locator);
		return totallinks - totalNonEmptyLinks;
	}
	
	
	public int getElmentsTextCount(By locator) {
		return getElementsTextList(locator).size();
	}
	
	/**
	 * This will get the link text values with help of locators
	 * 2.Non blank text list
	 * @param locator
	 * @return
	 */
	public List<String> getElementsTextList(By locator) {
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
	public int getPageLinksCount(By locator) {
		return getElements(locator).size();
	}
	
	public List<String> getAttributelist(By locator, String attrName) {
		List<WebElement> eleList =getElements(locator);
		List<String> eleattrvalue = new ArrayList<String>();
		for(WebElement e : eleList) {
			String attrvalue = e.getAttribute(attrName);
			eleattrvalue.add(attrvalue);
		}
		return eleattrvalue;	
		
	}

}
