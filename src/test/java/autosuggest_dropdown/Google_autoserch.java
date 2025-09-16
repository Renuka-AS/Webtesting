package autosuggest_dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_autoserch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	  WebDriver	driver=new ChromeDriver();
	  driver.get("https://www.google.com");
	  driver.manage().window().maximize();
	  System.out.println("opened url");
	  //driver.findElement(By.name("q")).sendKeys("selenium");
	  driver.findElement(By.xpath("//textarea[@aria-label=\"Search\"]")).sendKeys("selenium");
	  Thread.sleep(5000);
	  System.out.println("passed value");
	  driver.findElement(By.xpath("//div[@id='jZ2SBf']//div[1]//span[1]")).click();
	  System.out.println("clicked autosuggetion");
	  driver.quit();

	}

}
