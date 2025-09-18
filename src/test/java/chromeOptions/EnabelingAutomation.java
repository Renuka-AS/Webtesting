package chromeOptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.NewSessionPayload;

public class EnabelingAutomation {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
		WebDriver driver= new ChromeDriver(options);
		
		driver.get("https://expired.badssl.com/");
		System.out.println("title of page "+driver.getTitle());
		System.out.println("Bad SSL is accepted");


	}

}
