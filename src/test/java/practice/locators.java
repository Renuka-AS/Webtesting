package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		//driver.quit();
		driver.get("https://www.opencart.com/index.php?route=cms/demo");
		//driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.xpath("//*[@id=\"navbar-collapse-header\"]/div/a[2]")).click();
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("Renuka AS");
		driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("Renuka");
		driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("AS");
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("abcd@gmail.com");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("Abc123");

	}

}
