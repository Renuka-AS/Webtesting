package javaScriptExecuter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;import org.testng.internal.invokers.AbstractParallelWorker.Arguments;

//when we get element intursepted exception we can execute our script through JSExecutor

public class SendingData_Click_Action_By_JSE {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//WebDriver driver= new ChromeDriver();
		ChromeDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		//driver.findElement(By.id("name")).sendKeys("Allen");
		
		//Sending data through JavaScriptExecutor
		WebElement Inputbox = driver.findElement(By.id("name"));
		//Thread.sleep(5000);
		JavascriptExecutor Js=driver;
		Js.executeScript("arguments[0].setAttribute('value','Allen')", Inputbox);
		Thread.sleep(5000);
		
		WebElement radioBtn = driver.findElement(By.xpath("//input[@value='female']"));
		Js.executeScript("arguments[0].click",radioBtn);
		Thread.sleep(5000);
		System.out.println("Executed cliking by JSE");
		//Thread.sleep(5000);
		driver.quit();

	}

}
