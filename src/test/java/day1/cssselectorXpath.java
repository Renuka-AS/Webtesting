package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssselectorXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver	driver=new ChromeDriver();
		  driver.get("https://www.amazon.in/");
		  driver.manage().window().maximize();
		  //CSS selector tag#id
		 // driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("ribbon");
		  
		  
		  //CSS selector tag[attribute name='attribute value']
		  //driver.findElement(By.cssSelector("input[class='nav-input nav-progressive-attribute']")).sendKeys("pen");
	}

}
