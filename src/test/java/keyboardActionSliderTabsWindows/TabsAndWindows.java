package keyboardActionSliderTabsWindows;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabsAndWindows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		
		
		driver.get("https://demo.nopcommerce.com/");
		Thread.sleep(5000);
		//1. Opening links in same tab same window
		driver.get("https://www.opencart.com/index.php?route=cms/demo");
		
		//2. Opening links in different tabs
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("https://www.opencart.com/index.php?route=cms/demo");
		
		// 3. Opening 2 different links in different window
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.opencart.com/index.php?route=cms/demo");
		System.out.println("All done Okay");
		
		driver.quit();
		

	}

}
