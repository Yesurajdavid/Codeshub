package org.test.seleniumonlinetest1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class flipkartwindowshanlde {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Suraj\\eclipse-workspace\\SeleniumTest1\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		Thread.sleep(4000);
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//span[text()='Electronics']"))).build().perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/ul/li[1]/ul/li/ul/li[1]/ul/li[4]/a")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Samsung Galaxy A50s (Prism Crush Black, 128 GB)")).click();
		String par=driver.getWindowHandle();
		Set <String> chn=driver.getWindowHandles();
		for (String z:chn) {
			if (!par.equals(z)) {
				driver.switchTo().window(z);
			}
		}
		driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
	
	
	}

}
