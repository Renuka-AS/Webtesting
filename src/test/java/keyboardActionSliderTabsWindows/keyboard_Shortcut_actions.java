package keyboardActionSliderTabsWindows;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 import org.openqa.selenium.interactions.Actions;

public class keyboard_Shortcut_actions {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=	new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	driver.get("https://text-compare.com/");
	
	driver.findElement(By.id("inputText1")).sendKeys("Hi welcome to text compare. Executing by keyboard shortcut actions.");
	Actions keyboard_Action=new Actions(driver);
	
	//Cntrl A
	keyboard_Action.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
	
	
	//Ctrl C
	keyboard_Action.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();

	
	//TAB
	keyboard_Action.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();

	
	//Ctrl V
	
	keyboard_Action.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();
	
	Thread.sleep(5000);
	System.out.println("Keyboard action performed");
	
	keyboard_Action.keyDown(Keys.CONTROL).keyDown(Keys.SHIFT).sendKeys("A").keyUp(Keys.SHIFT).keyUp(Keys.CONTROL).perform();
	
	Thread.sleep(5000);
	//keyboard_Action.keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();
	driver.quit();
	}

}
