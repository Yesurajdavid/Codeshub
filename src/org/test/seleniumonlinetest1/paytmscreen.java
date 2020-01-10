package org.test.seleniumonlinetest1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class paytmscreen {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Suraj\\eclipse-workspace\\SeleniumTest1\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://paytm.com/");
		driver.manage().window().maximize();
	driver.findElement(By.xpath("//div[text()='Log In/Sign Up']")).click();
	Thread.sleep(4000);
	driver.switchTo().frame(0);
	Thread.sleep(4000);
	driver.findElement(By.xpath("//span[text()='Login/Signup with mobile number and password']")).click();
	driver.findElement(By.xpath("//li[@class='menu-btn-pos ng-binding ng-scope']")).click();
	Thread.sleep(3000);
	driver.findElement(By.name("mobileNumber")).sendKeys("8278272828");
	Thread.sleep(3000);	
	driver.findElement(By.name("loginPassword")).sendKeys("yahayah");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("kakaka");
	
		
		
		
	}
}
 	