package keyboardActionSliderTabsWindows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	WebDriver driver=	new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.automationtesting.in/Slider.html");
	Actions Slide_action = new Actions(driver);
	WebElement slider = driver.findElement(By.xpath("//div[@id='slider']//a[@href='#']"));
	System.out.println("Inital Location of slider: "+slider.getLocation()); //(414, 282)
	//Only increase x axis value y axis value should be zero then only action will be performed
	Slide_action.dragAndDropBy(slider, 500, 0).perform();
	System.out.println("moved slide");
	System.out.println("After slider action location: "+slider.getLocation()); //(912, 282)
	
	driver.navigate();
	//Check on this why this script is not working for color slider
	driver.get("https://www.globalsqa.com/demo-site/sliders/");
	System.out.println("Navigated different website");
	//WebElement red_color_slider = driver.findElement(By.xpath("//div[@id='red']//span"));
	WebElement red_color_slider = driver.findElement(By.xpath("(//div[contains(@class,'slider-wrapper')]//span[contains(@class,'ui-slider-handle')])[1]"));
	System.out.println("located element");
	System.out.println("before sliding location of red color slider: "+red_color_slider.getLocation());
	Slide_action.dragAndDropBy(red_color_slider, 100, 0);
	System.out.println("After sliding location of red color slider"+red_color_slider.getLocation());
	
	driver.quit();
	}

}
