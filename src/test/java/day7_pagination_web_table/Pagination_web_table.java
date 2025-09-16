package day7_pagination_web_table;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pagination_web_table {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/?m=1");
		
		//1. we need to check how many pages are present
		
		
		
		int totalPages = driver.findElements(By.xpath("//ul[@id='pagination']/li")).size();

		 /*List<WebElement> page_count = driver.findElements(By.xpath("//ul[@id=\"pagination\"]/li"));
		page_count.size();*/
		System.out.println("passed page count: "+totalPages);
		//2. we should able click that pages
		for(int i=1;i<=totalPages;i++)
		{
			if(i>1)
			{
				
			WebElement	current_page=driver.findElement(By.xpath("//ul[@id='pagination']//a[text()="+i+"]"));
						current_page. click();
			}
			Thread.sleep(1000);
			//3. we should be readable that page data

			//Reading data from the page
			int total_No_rows = driver.findElements(By.xpath("//table[@id='productTable']/tbody/tr")).size();
			System.out.println("total number of rows "+total_No_rows);
			for(int r=1;r<=total_No_rows;r++)
			{
				Thread.sleep(1000);
				String product_id = driver.findElement(By.xpath("//table[@id='productTable']/tbody/tr["+r+"]/td[1]")).getText();
				String name_product = driver.findElement(By.xpath("//table[@id='productTable']/tbody/tr["+r+"]/td[2]")).getText();
				String product_price = driver.findElement(By.xpath("//table[@id='productTable']/tbody/tr["+r+"]/td[3]")).getText();
				WebElement product_checkbox = driver.findElement(By.xpath("//table[@id='productTable']/tbody/tr["+r+"]/td[4]"));
				product_checkbox.click();
				System.out.println(product_id+"\t"+name_product+"\t"+product_price+"\t");
				System.out.println("read data from page");
			}
		}
		System.out.println("clicked all pages");
		
		
		
		
		driver.quit();
		
	}
}
