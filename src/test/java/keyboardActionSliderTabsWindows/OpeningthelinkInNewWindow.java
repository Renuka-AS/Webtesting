package keyboardActionSliderTabsWindows;

import java.awt.Window;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpeningthelinkInNewWindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	WebDriver driver=	new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.nopcommerce.com/");
	WebElement Register_link = driver.findElement(By.xpath("//a[@class=\"ico-register\"]"));
	Actions act = new Actions(driver);
	act.keyDown(Keys.CONTROL).click(Register_link).keyUp(Keys.CONTROL).perform();
	ArrayList ids = new ArrayList(driver.getWindowHandles());
	;
	driver.switchTo().window((String) ids.get(1));
	System.out.println("switched to register page ");
	driver.findElement(By.xpath("//input[@name=\"FirstName\"]")).sendKeys("Adam");
	Thread.sleep(2000);
	System.out.println("Entered firstname in register page");
	driver.switchTo().window((String) ids.get(0));
	driver.findElement(By.xpath("//input[@name=\"q\"]")).sendKeys("mobile");
	Thread.sleep(5000);
	
	driver.quit();
	}

}
