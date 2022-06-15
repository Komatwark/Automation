package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocator {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.xpath("//input[@xname='txtUsername']")).sendKeys("Admin",Keys.ENTER);
		driver.findElement(By.xpath("//input[@xname='txtPassword']")).sendKeys("admin123",Keys.ENTER);
		driver.findElement(By.xpath("//input[@xid='btnLogin']")).click();
		
				
	}

}
