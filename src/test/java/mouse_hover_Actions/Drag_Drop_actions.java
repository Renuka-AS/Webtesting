package mouse_hover_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop_actions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html5_draganddrop.asp");
		WebElement drag = driver.findElement(By.id("img1"));
		WebElement drop = driver.findElement(By.id("div2"));
		
		Actions dragDropAction = new Actions(driver);
		dragDropAction.dragAndDrop(drag, drop).perform();
		Thread.sleep(5000);
		System.out.println("Drag and drop action perfoemed");
		

	}

}
