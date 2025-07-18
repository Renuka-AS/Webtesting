package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.google.j2objc.annotations.OnDealloc;

public class locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		/*ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");*/
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.opencart.com/index.php?route=cms/demo");
		System.out.println("opened url");
		Thread.sleep(20);
		driver.findElement(By.xpath("//a[@class='btn btn-black navbar-btn']")).click(); 
		System.out.println("clicked on register link");
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("Renuka AS");
		System.out.println("entered username");
		driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("Renuka");
		driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("AS");
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("abcd@gmail.com");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("Abc123");

	}

}
