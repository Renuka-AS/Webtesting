package day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testing {
//1. Identifying the element
// 2. what kind of actions we perform
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver1 = new ChromeDriver();
		//EdgeDriver driver1 = new EdgeDriver(); //througing error
		//WebDriver driver=new ChromeDriver();
		
		//Launch the browser
		//FirefoxDriver driver1 = new FirefoxDriver();
		
		//Open the URL
		driver1.get("https://www.opencart.com/index.php?route=cms/demo");
		
		// validate the title should be "Your Store"
		String act_title = driver1.getTitle();
		
		System.out.println(act_title);
		if(act_title.equals("OpenCart - Demo"))
		{
			System.out.println("Test passed in chrome");
		}
		else {
			System.out.println("Test failed");
		}
		
		// 4. Close/quit the browser
		driver1.quit();
		}
	
	
	

}
