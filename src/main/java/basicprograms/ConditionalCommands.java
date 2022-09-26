package basicprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ConditionalCommands {

	@Test
	public void statusofElements() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		WebElement male = driver.findElement(By.id("gender-male"));
		WebElement female = driver.findElement(By.id("gender-female"));
		//System.out.println(status.isSelected());
		Boolean selectState = male.isSelected();
		
		//male.click();
		//System.out.println(status.isSelected());
		
		if(selectState == false) {
			male.click();
			System.out.println("Male Selected");
		}else {
			female.isSelected();
			System.out.println("FeMale Selected");
		}
		
	}
}
