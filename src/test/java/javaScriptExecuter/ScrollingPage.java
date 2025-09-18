package javaScriptExecuter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//Scroll down page till element is visible, check why this condition is not working
public class ScrollingPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
		JavascriptExecutor Js=(JavascriptExecutor) driver;
		
		//Scroll down page by pixel
		Js.executeScript("window.scrollBy(0,1500)", "");
		System.out.println(Js.executeScript("return window.pageYOffset;"));  //1500
		Thread.sleep(5000);
		System.out.println("done");
		//Scroll down page till element is visible
		/*WebElement ele = driver.findElement(By.xpath("//div//div[6]//div[1]//strong[1]"));
		Js.executeAsyncScript("arguments[0].scrollIntoView;", ele);
		System.out.println(Js.executeScript("return window.pageYOffset;"));
		*/
		
		//Scroll the page till end of the page
		Js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		System.out.println(Js.executeScript("return window.pageYOffset;")); // 2451.199951171875
		
		Thread.sleep(5000);
		
		System.out.println("Scrolling done till the end ");
		
		//scrolling up to initial position
		Js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		System.out.println("Scrolled back to top");
		
		driver.quit();
		
	}

}
