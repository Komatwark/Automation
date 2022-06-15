package pageObject;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestActiTimeLogout extends BaseTest{


	public static void main(String[] args) throws IOException {

		BaseTest bt =new BaseTest();
		bt.setUp();
		//open the browser and launch the web app
		Flib flib = new Flib();

		//read the data from excel file by using generic reusable methods
		String validUsername = flib.readPropertyFile(PROP_PATH, "username");
		String validPassword = flib.readPropertyFile(PROP_PATH, "password");

		WebDriver driver = new ChromeDriver();
		LoginPage lp = new LoginPage(driver);
		//perform login
		lp.actiTimevalidLogin(validUsername, validPassword);

		HomePage hp = new HomePage(driver);
		hp.clicklogout();
	}
}