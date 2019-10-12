package source;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class launch {
	WebDriver driver;
	public launch(WebDriver driver) {
	
		this.driver = driver;
	}
	By Myaccount=By.xpath("//ul[@class='nav navbar-nav navbar-right hidden-sm go-left']//a[@class='dropdown-toggle go-text-right'][contains(text(),'My Account')]");
	By Login=By.xpath("//ul[@class='nav navbar-nav navbar-right hidden-sm go-left']//ul[@class='nav navbar-nav navbar-side navbar-right sidebar go-left user_menu']//li[@id='li_myaccount']//ul[@class='dropdown-menu']//li//a[@class='go-text-right'][contains(text(),'Login')]");
	By email=By.xpath("//input[@placeholder='Email']");
	By password=By.xpath("//input[@placeholder='Password']");
    By Loginbtn=By.xpath("//button[@class='btn btn-action btn-lg btn-block loginbtn']");
    
    public WebElement Myaccount()
    {
    	return driver.findElement(Myaccount);
    }
    public WebElement Login()
    {
    	return driver.findElement(Login);
    }
    public WebElement email()
    {
    	return driver.findElement(email);
    }
    public WebElement password()
    {
    	return driver.findElement(password);
    }
    public WebElement Loginbtn()
    {
    	return driver.findElement(Loginbtn);
    }
	
	
	

}
