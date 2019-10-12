package testcase;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import source.Hotels1;

public class Hotels {
	@Test
	public void Hotels() throws IOException, InterruptedException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Online Test\\Desktop\\rajiv\\testphp\\src\\source\\data.properties");
		prop.load(fis);
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Online Test\\Desktop\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(200,TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(200,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		Hotels1 H1 = new Hotels1(driver);
		H1.HotelSearch().click();
		H1.Hotelname().click();
		H1.Pickupkeys().sendKeys(prop.getProperty("Pickupkeys"));
		H1.Pickupbox().click();
		H1.Hotelcheckin().click();
		Thread.sleep(1000);
		
		while(true)
		{
			String str=driver.findElement(By.xpath("//div[14]//div[1]//tr[1]//th[2]")).getText();
			if(str.equalsIgnoreCase(prop.getProperty("Month")))
			{
				break;
			}
			
			else
			{
				driver.findElement(By.xpath("//div[14]//div[1]//tr[1]//th[3]")).click();
			}
		}
		driver.findElement(By.xpath("//div[14]//tr//td[contains(text(),"+prop.getProperty("Date")+")]")).click();
				
		while(true)
		{
			String str=driver.findElement(By.xpath("//div[15]//div[1]//tr[1]//th[2]")).getText();
			if(str.equalsIgnoreCase(prop.getProperty("Month")))
			{
				break;
			}
			
			else
			{
				driver.findElement(By.xpath("//div[15]//div[1]//tr[1]//th[3]")).click();
			}
		}
		driver.findElement(By.xpath("//div[15]//tr//td[contains(text(),"+prop.getProperty("Date1")+")]")).click();
		
		H1.Quest().click();
		H1.Adult().click();
		Thread.sleep(1000);
		H1.children().click();
		H1.Search().click();
		
			}
	
			
			
		}
		
