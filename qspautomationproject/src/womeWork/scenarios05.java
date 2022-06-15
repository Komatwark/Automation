package womeWork;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class scenarios05 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@id='denyBtn']")).click();
		WebElement target = driver.findElement(By.xpath("//li[@class='menuparent repb']/a[@title='Rings']"));
		Actions act = new Actions(driver);
		act.moveToElement(target).perform();
		driver.findElement(By.xpath("/html/body/header/div/div[2]/div/nav/ul/li[2]/div/ul/li[1]/div/ul/li[2]/a")).click();
		WebElement obj = driver.findElement(By.xpath("//section[@class='block sort-by pull-right']/span[@class='view-by-wrap title style-outline i-right']"));
		Actions acti = new Actions(driver);
		act.moveToElement(obj).perform();
		driver.findElement(By.xpath("//a[.='Price Low to High ']")).click();
		driver.close();
	}

}

