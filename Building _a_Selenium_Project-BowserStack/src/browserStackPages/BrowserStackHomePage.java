package browserStackPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BrowserStackHomePage {
	
	
WebDriver driver;
By header=By.xpath("//h1");
By getStarted=By.xpath("//a[@id='signupModalButton']");

public BrowserStackHomePage (WebDriver driver) {
	
	this.driver=driver;
}



public void getHeaderTextHomePage() {
	
	String getHeaderText=driver.findElement(header).getText();
if ("App & Browser Testing Made Easy" == getHeaderText)
	System.out.println("OK, page is loaded");

}


public void clickOnGetStarted() {
	
	driver.findElement(getStarted).click();
		
}

}
