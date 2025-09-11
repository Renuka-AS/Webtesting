package mouse_hover_Actions;

import java.text.AttributedCharacterIterator.Attribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick_Action {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		driver.switchTo().frame("iframeResult");
		WebElement box1 = driver.findElement(By.xpath("//input[@id='field1']"));
		WebElement box2 = driver.findElement(By.xpath("//input[@id='field2']"));
		WebElement botton = driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
		box1.clear();
		box1.sendKeys("HeyWelcome");
		Actions act = new Actions(driver);
		act.doubleClick(botton).perform();
		String text = box1.getAttribute("value");
		 
		Thread.sleep(2000);
		if(text.equals("HeyWelcome"))
		{
			System.out.println("text copied");
		}
		else {
			System.out.println("text not copied properly");
		}
		driver.quit();
		

	}

}
