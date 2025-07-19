package day2;

import java.awt.Window;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverMethods {

	public static void main(String[] args) throws InterruptedException {
	WebDriver	driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	Thread.sleep(5000);
	driver.manage().window().maximize();
	//System.out.println(driver.getCurrentUrl());  //https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
	//System.out.println(driver.getPageSource());
	
	//String windowid =driver.getWindowHandle();
	//System.out.println("Window id is: "+windowid);

	/*driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
	System.out.println(driver.getCurrentUrl());
	
	Thread.sleep(10000);
	Set<String> window_ids = driver.getWindowHandles();
	System.out.println("Window ids are: "+window_ids);*/
	
	WebElement logo = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[2]/img"));
	System.out.println("enable satus is: "+logo.isDisplayed());
	
	WebElement user_name = driver.findElement(By.xpath("//input[@placeholder='Username']"));
	System.out.println("is enabled: "+user_name );
	
	driver.quit();
	

	}

}
