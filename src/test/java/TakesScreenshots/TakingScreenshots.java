package TakesScreenshots;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.TakesScreenshot;

public class TakingScreenshots {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless=new");
		WebDriver driver= new ChromeDriver(options);
		
		//full page screenshot
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		TakesScreenshot ts=(TakesScreenshot)driver;
		File sourceFile=ts.getScreenshotAs(OutputType.FILE);
		File targetfile = new File(System.getProperty("user.dir")+"\\screenshots\\fullpage1.png");
		sourceFile.renameTo(targetfile);
		System.out.println("Fullpage Screenshot taken successfully");
		
		//Capture the screenshot of specific section
		/*WebElement featureproduct = driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
		File sourcefile=featureproduct.getScreenshotAs(OutputType.FILE);
		File targetfile = new File(System.getProperty("user.dir")+"\\screenshots\\SectionScreenshot.png");
		sourcefile.renameTo(targetfile);
		System.out.println("Section Screenshot taken successfully");*/
		
		/*WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		File sourcefile=logo.getScreenshotAs(OutputType.FILE);
		File targetfile = new File(System.getProperty("user.dir")+"\\screenshots\\logo_webelement.png");
		sourcefile.renameTo(targetfile);
		System.out.println("logo webelement Screenshot taken successfully");*/
		System.out.println("headless mode executed");
		driver.quit();
	}

}
