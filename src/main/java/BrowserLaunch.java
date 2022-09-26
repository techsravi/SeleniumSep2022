import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLaunch {

	@Test
	public void browserLaunch() {
		WebDriverManager.chromedriver().setup(); //chrome driver setup
		//WebDriverManager.firefoxdriver().setup();
		//WebDriverManager.edgedriver().setup();
		//WebDriverManager.iedriver().setup();
		
		//Launching Chrome driver
		WebDriver driver = new ChromeDriver(); // chrome driver initialization
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); //Launch url
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		
		String pageURL = driver.getCurrentUrl();
		System.out.println(pageURL);
		
		String pageSourceCode = driver.getPageSource();
		System.out.println(pageSourceCode);
		
		//Launching Firefox driver
		//WebDriver driver = new FirefoxDriver(); // Firefox driver initialization
		//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); //Launch url
		
		//Launching Edge driver
		//WebDriver driver = new EdgeDriver(); // Edge driver initialization
		//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); //Launch url
		
		//Launching InternetExplorerDriver driver
		//WebDriver driver = new InternetExplorerDriver(); // InternetExplorer driver initialization
		//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); //Launch url
	}
}
