package org.test.seleniumonlinetest1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Suraj\\eclipse-workspace\\SeleniumTest1\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/");
		WebElement as = driver.findElement(By.xpath("//*[@id=\"identifierId\"]"));
		as.sendKeys("rajayesu03@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/span/span")).click();
		Thread.sleep(5000);
		WebElement df = driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input"));
		df.sendKeys("christtheking");
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/span/span")).click();

	}
}
