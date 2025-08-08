package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	
	//constructor
	
	public LoginPage(WebDriver driver){
		
		this.driver=driver;
	}
	//Locators
	By text_username_loc=By.xpath("//input[@placeholder='Username']");
	By text_password_loc=By.xpath("//input[@placeholder='Password']");
	By text_login_loc=By.xpath("//button[@type='submit']");
	
// createb by selector hub generator
	/*By text_username_loc1 =By.xpath("//input[@placeholder='Username']");
	By text_password_loc2=By.xpath("//input[@placeholder='Password']");
	By text_login_loc2=By.xpath("//button[normalize-space()='Login']");*/
	
	
	//Action methods
	public void setUserName(String user)
	{
		driver.findElement(text_username_loc).sendKeys(user);
		
	}
	public void setPassword(String pwd)
	{
		driver.findElement(text_password_loc).sendKeys(pwd);
		
	}
	public void clickLogin()
	{
		driver.findElement(text_login_loc).click();
		
	}

}
