package browserStackPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BrowserStackSignUpPage {
	
	
	
WebDriver driver;
By header=By.xpath("//h1");
By userName=By.xpath("//*[@id='user_full_name']");
By businessEmail=By.xpath("//*[@id='user_email_login']");
By password=By.xpath("//*[@id='user_password']");

public BrowserStackSignUpPage (WebDriver driver) {
	
	this.driver=driver;
}



public void getHeaderTextSignUpPage() {
	
	String getHeaderText=driver.findElement(header).getText().trim();
if (getHeaderText.equals("Create a FREE Account")) {
	System.out.println("OK, Sign Up Page is loaded");
     }
else {
	System.out.println("KO, Sign Up Page is not loaded");
	
   }
}


public void enterFullName(String userName) {
	
	driver.findElement(this.userName).sendKeys(userName);
		
}	
public void enterBusinessEmail(String userBusinessEmail) {
	
	driver.findElement(businessEmail).sendKeys(userBusinessEmail);
		
}	
public void enterPassword(String userPassword) {
	
	driver.findElement(password).sendKeys(userPassword);
		
}	
	
	

}
