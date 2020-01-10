package org.test.seleniumonlinetest1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demochromelaunch {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Suraj\\eclipse-workspace\\SeleniumTest1\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.globalglaze.in/");
		WebElement username = driver.findElement(By.id("ctl00_ContentPlaceHolder1_usernm"));
		username.sendKeys("Kavan");
		WebElement password = driver.findElement(By.id("ctl00_ContentPlaceHolder1_adminpassword"));
		password.sendKeys("Openpassword");
		
	}

}
