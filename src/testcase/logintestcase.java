package testcase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import source.launch;


public class logintestcase {
	
	@Test
	public void login() throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Online Test\\Desktop\\rajiv\\testphp\\src\\source\\data.properties");
		prop.load(fis);
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Online Test\\Desktop\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(200,TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(200,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		launch l1 = new launch(driver);
		l1.Myaccount().click();
		l1.Login().click();
		l1.email().sendKeys(prop.getProperty("email"));
		l1.password().sendKeys(prop.getProperty("password"));
		l1.Loginbtn().click();
		
	}

}
