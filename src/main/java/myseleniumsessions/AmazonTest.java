package myseleniumsessions;

public class AmazonTest {

	public static void main(String[] args) {
		
		BrowserUtil brutil = new BrowserUtil();
		brutil.initDriver("opera");
		brutil.lunchUrl("https://www.amazon.com/");
		if(brutil.isurlFractionExists("amazon")) {
			System.out.println("Url is correct with amazon....Test Pass");
		}
		else {
			System.out.println("Url is not correct with amazon ...Test failed");
		}
		
		if(brutil.isInfoExistInPageSource("https://completion.amazon.com")){
			System.out.println("String is present in source....Test Passs");
		}
		else {
			System.out.println("Url is not correct with source ...Test failed");
		}
		
		if(brutil.getpagetitle().contains("Amazon.com. Spend less. Smile more.")) {
			System.out.println("correct title...PASS");
		}
		else {
			System.out.println("title is worng.... Faild");
		}
		
		brutil.quitBrowser();

	}

}
