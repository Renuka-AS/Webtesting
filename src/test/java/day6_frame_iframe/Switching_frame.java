package day6_frame_iframe;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switching_frame {
	
	public static void main(String[] args) {
	WebDriver	driver =new ChromeDriver();
	driver.get("https://ui.vision/demo/webtest/frames/");

	driver.manage().window().maximize();
	
	//frame1
	
	WebElement frame1 = driver.findElement(By.xpath("/html/frameset/frame[1]"));
	driver.switchTo().frame(frame1);
	driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("welcome");
	System.out.println("executed frame1");
	driver.switchTo().defaultContent();
	
	//frame2
	WebElement frame2 = driver.findElement(By.xpath("/html/frameset/frameset/frame[1]" ));
	driver.switchTo().frame(frame2);
	driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("selenium");
	driver.switchTo().defaultContent();
	
	///frame 3
	
	WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
	driver.switchTo().frame(frame3);
	driver.findElement(By.xpath("//*[@id=\"id3\"]/div/input")).sendKeys("I am frame3");
	driver.switchTo().frame(0);
	driver.findElement(By.xpath("//*[@id=\"i9\"]/div[3]/div")).click();
	driver.findElement(By.xpath("//*[@id=\"i21\"]/div[2]")).click();
	driver.switchTo().defaultContent();
	
	System.out.println("executed inner iframe");
	
	//frame5 assignment
	
	WebElement frame5 = driver.findElement(By.xpath("//frame[@src='frame_5.html']"));
	driver.switchTo().frame(frame5);
	driver.findElement(By.xpath("/html/body/center/a")).click();
	
	driver.findElement(By.xpath("//img[@alt='Ui.Vision by a9t9 software - Image-Driven Automation']"));
	System.out.println("logo is present");
	
	
	
	
	}

}
