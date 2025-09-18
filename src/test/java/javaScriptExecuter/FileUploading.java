package javaScriptExecuter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;import bsh.NameSource;

public class FileUploading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		System.out.println("Opened url");
		
		//Uploading sigle file
		/*driver.findElement(By.xpath("id('filesToUpload')")).sendKeys("C:\\Automation\\Selenium_notes.txt");
		if(driver.findElement(By.xpath("id('fileList')")).getText().equals("Selenium_notes.txt"))
		{
			System.out.println("File uploaded");
		}
		else {
			System.out.println("Upload failed");
		}
		*/
		//Multiple fileupload
		
		String file1="C:\\\\Automation\\\\Selenium_notes.txt";
		String file2="C:\\Automation\\Playwright.txt";
		
		driver.findElement(By.xpath("id('filesToUpload')")).sendKeys(file1+"\n"+file2);
		int NoOfFileUploaded = driver.findElements(By.xpath("//ul[@id='fileList']//li")).size();
		System.out.println(" No of files: "+NoOfFileUploaded);
		
		//Validate Number of files
		if(NoOfFileUploaded==2)
		{
			System.out.println("all file are uploaded");
		}
		else {
			System.out.println("All files are not uploaded");
		}
		
		//Validate filename
		if (driver.findElement(By.xpath("//ul[@id='fileList']//li[1]")).getText().equals("Selenium_notes.txt")&&
				driver.findElement(By.xpath("//ul[@id='fileList']//li[2]")).getText().equals("Playwright.txt"))
				{
			System.out.println("Filenames are matching");
		}
		else {
			{
				System.out.println("File names are not matching");
			}
		}
		driver.quit();
	}

}
