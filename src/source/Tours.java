package source;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Tours {
	WebDriver driver;
	public Tours(WebDriver driver) {
	
		this.driver = driver;
	}
	By Tours = By.xpath("//a[@title='Tours']");
	By Tourssearch = By.xpath("//div[@id='s2id_autogen3']//a[@class='select2-choice select2-default']");
	By Tpickupkeys = By.xpath("/html[1]/body[1]/div[6]/section[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/a[1]");
	By Tpickupbox = By.xpath("/html[1]/body[1]/div[20]/ul[1]/li[1]/ul[1]/li[1]/div[1]");
	By Tcheckin = By.xpath("//div[@id='tchkin']//input[@placeholder='Check in']");
	By Guests = By.xpath("//select[@id='adults']");
	By Select = By.xpath("//select[@id='tourtype']");
	By Search = By.xpath("//div[@class='col-md-2 form-group go-right col-xs-12 search-button']//button[@class='btn-primary btn btn-lg btn-block pfb0 loader'][contains(text(),'Search')]");
	
	public WebElement Tours()
	  {
	  	return driver.findElement(Tours);
	  }
	
	public WebElement Tourssearch()
	  {
	  	return driver.findElement(Tourssearch);
	  }
	
	public WebElement Tpickupkeys()
	  {
	  	return driver.findElement(Tpickupkeys);
	  }
	
		public WebElement Tpickupbox()
	  {
	  	return driver.findElement(Tpickupbox);
	  }
	
	public WebElement Tcheckin()
	  {
	  	return driver.findElement(Tcheckin);
	  }
	
	public WebElement Guests()
	  {
	  	return driver.findElement(Guests);
	  }
	
	public WebElement Search()
	  {
	  	return driver.findElement(Search);
	  }
	

	public WebElement Select()
	  {
	  	return driver.findElement(Select);
	  }

	
	

}
