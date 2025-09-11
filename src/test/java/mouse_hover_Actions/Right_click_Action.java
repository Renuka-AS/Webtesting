package mouse_hover_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Right_click_Action {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
	
	WebElement button = driver.findElement(By.xpath("//span[text()='right click me']"));
	Actions act = new Actions(driver);
	// 1. right click on button
	act.contextClick(button).perform();
	
	//click on copy
	
	driver.findElement(By.xpath("//span[text()='Copy']")).click();
	
	//close alert box
	Thread.sleep(3000);
	driver.switchTo().alert().accept();
	
	System.out.println("performed right click action ");
	}

}
