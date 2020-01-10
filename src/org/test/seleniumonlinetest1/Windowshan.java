package org.test.seleniumonlinetest1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowshan {
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Suraj\\eclipse-workspace\\SeleniumTest1\\driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://study.com/academy/login.html");
			WebElement email=driver.findElement(By.id("emailAddress"));
			email.sendKeys("Kovam");
			WebElement pass=driver.findElement(By.id("pwd"));
			pass.sendKeys("Billa");
			WebElement chkbox=driver.findElement(By.xpath("//input[@type='checkbox']"));
			chkbox.click();
		
}
}