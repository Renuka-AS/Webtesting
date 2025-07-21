package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage2 {
WebDriver driver;
	
	//constructor
	
	public LoginPage2(WebDriver driver){
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//Locators
	@FindBy(xpath = "//input[@placeholder='Username']")
	WebElement txt_username;
	
	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement txt_password;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement btn_login;
	
	/*By text_username_loc=By.xpath("//input[@placeholder='Username']");
	By text_password_loc=By.xpath("//input[@placeholder='Password']");
	By text_login_loc=By.xpath("//button[@type='submit']");*/
	
// createb by selector hub generator
	/*By text_username_loc1 =By.xpath("//input[@placeholder='Username']");
	By text_password_loc2=By.xpath("//input[@placeholder='Password']");
	By text_login_loc2=By.xpath("//button[normalize-space()='Login']");*/
	
	
	//Action methods
	public void setUserName(String user)
	{
	txt_username.sendKeys(user);
		
	}
	public void setPassword(String pwd)
	{
		txt_password.sendKeys(pwd);
		
	}
	public void clickLogin()
	{
		btn_login.click();
		
	}
}
