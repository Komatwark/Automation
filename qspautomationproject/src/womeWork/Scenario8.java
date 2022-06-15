package womeWork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario8 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@id='denyBtn']")).click();
		WebElement tager = driver.findElement(By.xpath("//li[@class='menuparent']/a[@title='Jewellery']"));
		Actions act = new Actions(driver);
		act.moveToElement(tager).perform();
		
		driver.findElement(By.xpath("//span[.='Kadas']")).click();
		driver.findElement(By.xpath("//img[@alt='The Ranveer Kada for Him']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='size-box-overlay']")).click();
		driver.findElement(By.xpath("//span[@class='size']")).click();
		driver.findElement(By.xpath("//input[@id='buy-now']")).click();
		driver.close();
		

	}

}
