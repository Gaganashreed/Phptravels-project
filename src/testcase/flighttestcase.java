package testcase;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import source.Flight;
import source.Tours;

public class flighttestcase {
	@Test
	public void flighttestcase() throws IOException, InterruptedException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Online Test\\Desktop\\rajiv\\testphp\\src\\source\\data.properties");
		prop.load(fis);
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Online Test\\Desktop\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(200,TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(200,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		Flight F1 = new Flight(driver);
		F1.Flight().click();
		F1.Fpickuplocation().click();
		/*F1.FPicklocation1().sendKeys(prop.getProperty("FPicklocation1"));
		F1.FDroplocation().click();
		F1.FDroplocation1().sendKeys(prop.getProperty("FDroplocation1"));
		F1.Flightcheckin().click();
		Thread.sleep(1000);
		
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
		driver.findElement(By.xpath("//div[15]//tr//td[contains(text(),"+prop.getProperty("Date")+")]")).click();
		
		F1.FGuests().click();
		Select s1=new Select (driver.findElement(By.xpath("//div[@class='col-md-1 form-group go-right col-xs-12']//input[@placeholder='0']")));
		s1.selectByIndex(1);
		
		F1.FAdults().click();
		Select s2=new Select (driver.findElement(By.xpath("//select[@id='madult']")));
		s2.selectByIndex(1);
		
		F1.FChildren().click();
		Select s3=new Select (driver.findElement(By.xpath("//select[@id='mchildren']")));
		s3.selectByIndex(1);
		
		F1.FInfant().click();
		Select s4=new Select (driver.findElement(By.xpath("//select[@id='minfant']")));
		s4.selectByIndex(1);*/
		
		F1.Fsearch().click();
	}
}
