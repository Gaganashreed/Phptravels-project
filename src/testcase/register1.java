package testcase;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import source.launch;
import source.register;

public class register1 {
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
		
		register r1 = new register(driver);
		r1.Myaccount().click();
		r1.signin().click();
		r1.fristname().sendKeys(prop.getProperty("fristname"));
		r1.lastname().sendKeys(prop.getProperty("lastname"));
		r1.Mobilenumber().sendKeys(prop.getProperty("Mobilenumber"));
		r1.email().sendKeys(prop.getProperty("email"));
		r1.password().sendKeys(prop.getProperty("password"));
	    r1.confirmpassword().sendKeys(prop.getProperty("confirmpassword"));
	    r1.cookie().click();
		r1.submit().click();
		
		
	}

}
