package PopUps;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Uploadpopups {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://smallpdf.com/word-to-pdf");
Thread.sleep(4000);
driver.findElement(By.xpath("//span[contains(.,\"Got it\")]")).click();
Thread.sleep(4000);

driver.findElement(By.xpath("//span[contains(.,'Choose Files') and(@class=\"sc-1tuk0d4-5 lhzxxm\")]")).click();
File abs =new File ("./autoitscript/Ph.exe");

String Abpath=abs.getAbsolutePath();
Runtime.getRuntime().exec(Abpath);
Thread.sleep(4000);




	}

}
