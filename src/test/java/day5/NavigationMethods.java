package day5;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMethods {
	public static void main(String[] args) throws InterruptedException {
	WebDriver	driver =new ChromeDriver();
	driver.navigate().to("https://tutorialsninja.com/demo/");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	driver.navigate().back();
	System.out.println("backed page");
	
	driver.navigate().forward();
	Thread.sleep(5000);

	System.out.println("forword page");
	Thread.sleep(5000);

	driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	System.out.println("opened different window");
	
	}

}
