package day7_pagination_web_table;

import java.util.List;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import annotationsHirarcy.c2;

public class Static_web_table {

	public static void main(String[] args) throws InterruptedException {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://testautomationpractice.blogspot.com/?m=1");
	//1. find the total number of rows in table
	List<WebElement> No_rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
	System.out.println("Number of rows: "+No_rows.size());
	//2. find the total number of column
	List<WebElement> No_columns = driver.findElements(By.xpath("//table[@name='BookTable']//tr//th"));
	System.out.println(	"Number of columns "+No_columns.size());
	
	//read the data from the table
	Thread.sleep(5000);
	String Read_Data = driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td [1]")).getText();
	System.out.println(Read_Data);
	
	//4 Read data from all rows and columns
	for(int r=2;r<=No_rows.size();r++)
	{
		for(int c=1;c<=No_columns.size();c++)
		{
			String data = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
			System.out.print(data+"\t");
		}
		System.out.println();
	}
	//5. read the boolname who wrote Amit
	for(int r=2;r<=No_rows.size();r++)
	{
		String AuthorName = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
		if(AuthorName.equals("Amit"))
		{
			String Bookname = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
			System.out.println(Bookname+"\t"+AuthorName);
		}
	}
	
	//6. calculatin total price of book
	int total=0;
	for(int r=2;r<=No_rows.size();r++)
	{
		String price = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
		 total=total+Integer.parseInt(price);

	}
	 System.out.println(total);

	
	driver.quit();
	System.out.println("executed");

	}

}
