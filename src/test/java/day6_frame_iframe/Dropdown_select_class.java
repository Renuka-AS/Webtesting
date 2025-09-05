package day6_frame_iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_select_class {

	public static void main(String[] args) {
	WebDriver	driver=new ChromeDriver();
	driver.get("https://testautomationpractice.blogspot.com/");
	driver.manage().window().maximize();
	WebElement dropdowm = driver.findElement(By.xpath("//label[@for='country']"));
	System.out.println("passed");
		Select sel = new Select(dropdowm);
		//sel.selectByVisibleText("India");
		sel.selectByIndex(1);
		//sel.selectByValue("India");
		System.out.println("Dropdown selction passed");
	}

}
