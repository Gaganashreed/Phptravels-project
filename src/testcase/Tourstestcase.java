package testcase;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import javax.print.DocFlavor.STRING;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import source.Tours;

public class Tourstestcase {
	@Test
	public void Tourstestcase() throws IOException, InterruptedException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Online Test\\Desktop\\rajiv\\testphp\\src\\source\\data.properties");
		prop.load(fis);
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Online Test\\Desktop\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(200,TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(200,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		Tours T1 = new Tours(driver);
		T1.Tours().click();
		T1.Tourssearch().click();
		T1.Tpickupkeys().sendKeys(prop.getProperty("Tpickupkeys"));
		T1.Tpickupbox().click();
		T1.Tcheckin().click();
		Thread.sleep(1000);
		
		while(true)
		{
			String str=driver.findElement(By.xpath("//div[11]//div[1]//tr[1]//th[2]")).getText();
			if(str.equalsIgnoreCase(prop.getProperty("Month")))
			{
				break;
			}
			
			else
			{
				driver.findElement(By.xpath("//div[11]//div[1]//tr[1]//th[3]")).click();
			}
		}
		driver.findElement(By.xpath("//div[11]//tr//td[contains(text(),"+prop.getProperty("Date")+")]")).click();
		
	

	T1.Guests().click();
	Select s1=new Select (driver.findElement(By.xpath("//select[@id='adults']")));
	s1.selectByIndex(1);
	
	T1.Select().click();
	Select s2=new Select (driver.findElement(By.xpath("//select[@id='tourtype']")));
	s2.selectByIndex(1);
			
	Thread.sleep(1000);
	T1.Search().click();
	
	}
		

}
