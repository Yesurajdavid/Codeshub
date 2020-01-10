package org.test.seleniumonlinetest1;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class windowshandle {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Suraj\\eclipse-workspace\\SeleniumTest1\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		Thread.sleep(5000);
		act.moveToElement(driver.findElement(By.linkText("Men"))).build().perform();
		driver.findElement(By.linkText("Jackets")).click();
		Thread.sleep(4000);
		driver.findElement(By.linkText("Campus Sutra")).click();
		String par=driver.getWindowHandle();
		Set <String> chn=driver.getWindowHandles();
		for (String x:chn) {
			if (!par.equals(x)) {
				driver.switchTo().window(x);
			}
		}
		driver.findElement(By.xpath("//div[text()='ADD TO BAG']")).click();
		
		
	}

}
