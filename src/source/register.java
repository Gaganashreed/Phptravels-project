package source;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class register {
	WebDriver driver;
	public register(WebDriver driver) {
	
		this.driver = driver;
	}
	By Myaccount=By.xpath("//ul[@class='nav navbar-nav navbar-right hidden-sm go-left']//a[@class='dropdown-toggle go-text-right'][contains(text(),'My Account')]");
	By signin=By.xpath("//ul[@class='nav navbar-nav navbar-right hidden-sm go-left']//ul[@class='nav navbar-nav navbar-side navbar-right sidebar go-left user_menu']//li[@id='li_myaccount']//ul[@class='dropdown-menu']//li//a[@class='go-text-right'][contains(text(),'Sign Up')]");
	By fristname=By.xpath("//input[@placeholder='First Name']");
	By lastname=By.xpath("//input[@placeholder='Last Name']");
    By Mobilenumber=By.xpath("//input[@placeholder='Mobile Number']");
    By email=By.xpath("//input[@placeholder='Email']");
    By password=By.xpath("//input[@placeholder='Password']");
    By confirmpassword=By.xpath("//input[@placeholder='Confirm Password']");
    By cookie=By.xpath("//button[@id='cookyGotItBtn']");
    By submit=By.xpath("//button[@class='signupbtn btn_full btn btn-action btn-block btn-lg']");
    
    public WebElement Myaccount()
    {
    	return driver.findElement(Myaccount);
    }
    public WebElement signin()
    {
    	return driver.findElement(signin);
    }
    public WebElement fristname()
    {
    	return driver.findElement(fristname);
    }
    public WebElement lastname()
    {
    	return driver.findElement(lastname);
    }
    public WebElement Mobilenumber()
    {
    	return driver.findElement(Mobilenumber);
    }
    public WebElement email()
    {
    	return driver.findElement(email);
    }
    public WebElement password()
    {
    	return driver.findElement(password);
    }
    public WebElement confirmpassword()
    {
    	return driver.findElement(confirmpassword);
    }
    public WebElement cookie()
    {
    	return driver.findElement(cookie);
    }
	public WebElement submit() {
		// TODO Auto-generated method stub
		return driver.findElement(submit);
	}
	
	

}
