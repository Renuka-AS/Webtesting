package javaScriptExecuter;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZoomInZoomOutWindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		/*driver.manage().window().maximize();
		System.out.println("Maximizing window");
		Thread.sleep(5000);
		driver.manage().window().minimize();
		Thread.sleep(5000);
		System.out.println("minimizing window ");
		
		driver.manage().window().maximize();
		Thread.sleep(5000);*/
		
		//Now maximize and minimize window by JSE
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("document.body.style.zoom='50'");  //set zoom level 50%
		
		Thread.sleep(5000);
		js.executeScript("document.body.style.zoom='30%'"); //set zoom level 80%
		Thread.sleep(5000);
		js.executeScript("document.body.style.zoom='80%'"); //set zoom level 80%
		Thread.sleep(5000);
		System.out.println("Succefull set window size");
		
		
		driver.quit();
		
	}

}
