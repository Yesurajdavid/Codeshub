package org.test.seleniumonlinetest1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolldowntest1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Suraj\\eclipse-workspace\\SeleniumTest1\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement off = driver.findElement(By.xpath("//h2[text()='Up to 50% off | Beds']"));
		js.executeScript("arguments[0].scrollIntoView(true)", off);
		Thread.sleep(3000);
		WebElement triple = driver.findElement(By.xpath("//h2[text()='Triple camera smartphones | Starting ₹8,990']"));
		js.executeScript("arguments[0].scrollIntoView(false)", triple);
		Thread.sleep(5000);
		
	}

}
