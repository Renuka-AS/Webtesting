package chromeOptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//secure socet layer
public class HandelSSL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options=new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		WebDriver driver= new ChromeDriver(options);
		driver.get("https://expired.badssl.com/");
		System.out.println("title of page "+driver.getTitle());
		System.out.println("Bad SSL is accepted");
	}

}
