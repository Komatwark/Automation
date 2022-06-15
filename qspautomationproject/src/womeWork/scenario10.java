package womeWork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scenario10 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	
		driver.get("https://www.bluestone.com");
		Thread.sleep(6000);
		driver.findElement(By.xpath("//span[@id='denyBtn']")).click();
		Thread.sleep(15000);
		driver.findElement(By.xpath("//p[.='CHAT with our experts !']")).click();

	}

}
