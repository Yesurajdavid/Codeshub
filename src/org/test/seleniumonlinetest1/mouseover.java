package org.test.seleniumonlinetest1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseover{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Suraj\\eclipse-workspace\\SeleniumTest1\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://mrbool.com/");
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.className("menulink"))).build().perform();
		Thread.sleep(3000);
			driver.findElement(By.xpath("//ul[@class='submenu']//li//a[text()='Articles']")).click();
	}
}
	