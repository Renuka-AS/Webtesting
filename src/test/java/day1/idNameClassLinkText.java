package day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class idNameClassLinkText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  WebDriver	driver=new ChromeDriver();
	  driver.get("https://www.amazon.in/");
	  driver.manage().window().maximize();
	  driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phone");
	  List<WebElement> list_a = driver.findElements(By.tagName("a"));
	System.out.println(list_a.size());

	  //driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	  
	 System.out.println("clicked and searched");
	}

}
