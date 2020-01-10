package org.test.seleniumonlinetest1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Suraj\\eclipse-workspace\\SeleniumTest1\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement txtbox = driver.findElement(By.id("twotabsearchtextbox"));
		txtbox.sendKeys("tees for men");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//span[text()='Mens Cotton Half Sleeve Plain Polo T Shirt with Collar']")).click();
		String par = driver.getWindowHandle();
		Set<String> chl = driver.getWindowHandles();
		for (String x : chl) {
			if (!par.equals(x)) {
				driver.switchTo().window(x);
			}
		}
		driver.findElement(By.id("add-to-cart-button")).click();

	}

}
