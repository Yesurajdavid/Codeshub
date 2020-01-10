package org.test.seleniumonlinetest1;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrnshottest1 {

public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Suraj\\eclipse-workspace\\SeleniumTest1\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		TakesScreenshot ts=(TakesScreenshot) driver;
		File sou=ts.getScreenshotAs(OutputType.FILE);
		File ds=new File ("C:\\Users\\Suraj\\Desktop\\New folder (2).img");
		
		
		
	
	
	}
	
}
