package org.test.seleniumonlinetest1;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrolldown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Suraj\\eclipse-workspace\\SeleniumTest1\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		JavascriptExecutor tgc=(JavascriptExecutor) driver;
		tgc.executeScript("Window.scrollBy(0,500)");
		Thread.sleep(4000);
		
		
		
		
	}
	
	
}
