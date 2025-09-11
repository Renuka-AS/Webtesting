package mouse_hover_Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Open_cart_MouseHover_Actions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
		options.setExperimentalOption("useAutomationExtension", false);
		WebDriver driver = new ChromeDriver(options);*/

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cloudflare.com/en-gb/?utm_source=challenge&utm_campaign=j");
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//WebElement desktop = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Desktops']")));

		//WebElement desktop = driver.findElement(By.xpath("//a[text()='Desktops']"));
		//WebElement mac = driver.findElement(By.xpath("//a[text()='Mac (1)']"));
		WebElement platform = driver.findElement(By.xpath("//span[text()='Platform']"));
		WebElement cloud = driver.findElement(By.xpath("//span[text()='Connectivity cloud']"));
		Actions act = new Actions(driver);
		//act.moveToElement(platform).moveToElement(cloud).click().build().perform();
		act.moveToElement(platform).moveToElement(cloud).click().perform();  //perform() itself is creating action default

		System.out.println("Action performed");
		driver.quit();
	}

}
