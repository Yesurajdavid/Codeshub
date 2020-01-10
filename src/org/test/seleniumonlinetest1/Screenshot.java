package org.test.seleniumonlinetest1;

import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Screenshot {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Suraj\\eclipse-workspace\\SeleniumTest1\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://v1.hdfcbank.com/");
		driver.manage().window().maximize();
		TakesScreenshot ts=(TakesScreenshot) driver;
		File s=ts.getScreenshotAs(OutputType.FILE);
		System.out.println(s);
		File d=new File("C:\\Users\\Suraj\\Desktop\\New folder (2).img");
		
	
	
	
	}
	
	
}
