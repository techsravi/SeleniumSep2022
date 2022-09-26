package basicprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementFindElements {

	@Test
	public void fidElementsvsFineElements() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://demo.nopcommerce.com/");
		WebElement ele = driver.findElement(By.id("small-searchterms"));
		ele.sendKeys("Tech Sravi");
		
		
		
	}
}
