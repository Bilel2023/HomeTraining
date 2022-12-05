package browserStackSetup;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import browserStackPages.BrowserStackHomePage;
import browserStackPages.BrowserStackSignUpPage;

public class BrowserStackSetup {
	
		
	public static void main(String[] args) {
		
	WebDriver driver;
	BrowserStackSignUpPage objBrowserStackSignUpPage;
	BrowserStackHomePage objBrowserStackHomePage;
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium downloads\\chromedriver_win32\\chromedriver.exe");		
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://www.browserstack.com/");
	
	
	//Check home page
	objBrowserStackHomePage = new BrowserStackHomePage(driver);
	objBrowserStackHomePage.getHeaderTextHomePage();
	objBrowserStackHomePage.clickOnGetStarted();
	//Go to SIN UP page
	objBrowserStackSignUpPage = new BrowserStackSignUpPage(driver);
	objBrowserStackSignUpPage.getHeaderTextSignUpPage();
	//Enter USer Name
	objBrowserStackSignUpPage.enterFullName("Bilel Bemri");
	//Enter Business Email
	objBrowserStackSignUpPage.enterBusinessEmail("bilel.bemri@gmail.com");
	//Enter Password
	objBrowserStackSignUpPage.enterPassword("coucou23$$");
	
	driver.close();
	
		}

	
}