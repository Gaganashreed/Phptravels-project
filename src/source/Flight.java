package source;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Flight {
	
		WebDriver driver;
		public Flight(WebDriver driver) {
		
			this.driver = driver;
		}
		By cookie=By.xpath("//button[@id='cookyGotItBtn']");
		By Flight=By.xpath("/html[1]/body[1]/div[6]/section[1]/div[2]/div[1]/div[1]/div[2]/ul[1]/li[2]/a[1]");
		By Fpickuplocation=By.xpath("/html[1]/body[1]/div[6]/section[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[3]/form[1]/div[1]/div[1]/div[2]/a[1]");
		By FPicklocation1=By.xpath("/html[1]/body[1]/div[6]/section[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[3]/form[1]/div[1]/div[1]/div[2]/a[1]/span[1]");
		By FDroplocation=By.xpath("//div[@id='s2id_destination']//span[@class='select2-chosen'][contains(text(),'Enter Location')]");
		By FDroplocation1=By.xpath("//div[@id='s2id_destination']//a[@class='select2-choice select2-default']");
		By Flightcheckin=By.xpath("//input[@id='departure']");
		By FGuests=By.xpath("//div[@class='col-md-1 form-group go-right col-xs-12']//input[@placeholder='0']");
		By FAdults=By.xpath("//select[@id='madult']");
		By FChildren=By.xpath("//select[@id='mchildren']");
		By FInfant=By.xpath("//select[@id='minfant']");
		By Fsearch=By.xpath("//button[@class='btn-primary btn btn-lg btn-block pfb0']");
		
		  public WebElement cookie()
		  {
		  	return driver.findElement(cookie);
		  }
		
		  public WebElement Flight()
		  {
		  	return driver.findElement(Flight);
		  }
		
		  public WebElement Fpickuplocation()
		  {
		  	return driver.findElement(Fpickuplocation);
		  }
		
		  public WebElement FPicklocation1()
		  {
		  	return driver.findElement(FPicklocation1);
		  }
		
		  public WebElement FDroplocation()
		  {
		  	return driver.findElement(FDroplocation);
		  }
		
		  public WebElement FDroplocation1()
		  {
		  	return driver.findElement(FDroplocation1);
		  }
		
		  public WebElement Flightcheckin()
		  {
		  	return driver.findElement(Flightcheckin);
		  }
		
		  public WebElement FGuests()
		  {
		  	return driver.findElement(FGuests);
		  }
		  
		  public WebElement FAdults()
		  {
		  	return driver.findElement(FAdults);
		  }
		  
		  public WebElement FChildren()
		  {
		  	return driver.findElement(FChildren);
		  }
		  
		  public WebElement FInfant()
		  {
		  	return driver.findElement(FInfant);
		  }
		  
		  
		  public WebElement Fsearch()
		  {
		  	return driver.findElement(Fsearch);
		  }
		
}
