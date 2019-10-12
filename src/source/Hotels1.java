package source;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Hotels1 {
	WebDriver driver;
	public Hotels1(WebDriver driver) {
	
		this.driver = driver;
	}
  By HotelSearch = By.xpath("//li[@class='active text-center']//a[@class='text-center']");
  By Hotelname = By.xpath("//div[@id='s2id_location']//a[@class='select2-choice select2-default']");
  By Pickupkeys = By.xpath("//div[@id='s2id_location']//a[@class='select2-choice select2-default']");
  By Pickupbox = By.xpath("//div[contains(text(),', India')]");
  By Hotelcheckin = By.xpath("//div[@id='dpd1']//input[@placeholder='Check in']");
  By Quest = By.xpath("//input[@id='htravellersInput']");
  By Adult = By.xpath("//button[@id='hadultPlusBtn']");
  By children = By.xpath("//button[@id='hchildPlusBtn']");
  By Search = By.xpath("//button[@class='btn btn-lg btn-block btn-primary pfb0 loader']");
  
  public WebElement HotelSearch()
  {
  	return driver.findElement(HotelSearch);
  }
  
  public WebElement Hotelname()
  {
  	return driver.findElement(Hotelname);
  }
  
  public WebElement Pickupkeys()
  {
  	return driver.findElement(Pickupkeys);
  }
  
  public WebElement Pickupbox()
  {
  	return driver.findElement(Pickupbox);
  }
  
  public WebElement Hotelcheckin()
  {
  	return driver.findElement(Hotelcheckin);
  }
  
  public WebElement Quest()
  {
  	return driver.findElement(Quest);
  }
  
  public WebElement Adult()
  {
  	return driver.findElement(Adult);
  }
  
  public WebElement children()
  {
  	return driver.findElement(children);
  }
  
  public WebElement Search()
  {
  	return driver.findElement(Search);
  }
}
