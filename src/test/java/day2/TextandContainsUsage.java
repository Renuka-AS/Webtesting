package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextandContainsUsage {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		WebElement inner_text = driver.findElement(By.xpath("//span[contains(text(),'Cypress ')]"));
		System.out.println("Used contains method to fetch inner text : "+inner_text);
	}

}
