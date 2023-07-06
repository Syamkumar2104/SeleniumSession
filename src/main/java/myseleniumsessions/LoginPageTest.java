package myseleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageTest {

	public static void main(String[] args) {
		
		
		BrowserUtil brutil = new BrowserUtil();
		WebDriver driver = brutil.initDriver("chrome");
		brutil.lunchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		System.out.println(brutil.getpagetitle());
		System.out.println(brutil.getpageurl());
		
		By emailId = By.id("input-email");
		By passwrd = By.id("input-password");
		
		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.dosendkeys(emailId, "syam@123gmail.com");
		eleUtil.dosendkeys(passwrd, "syam");
		
		brutil.closeBrowser();

	}

}
