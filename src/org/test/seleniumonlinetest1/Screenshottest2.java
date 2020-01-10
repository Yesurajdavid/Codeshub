package org.test.seleniumonlinetest1;

import java.io.File;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Screenshottest2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Suraj\\eclipse-workspace\\SeleniumTest1\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement all = driver.findElement(By.id("searchDropdownBox"));
		Select sel = new Select(all);
		sel.selectByVisibleText("Alexa Skills");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("samsung watches for men");
		driver.findElement(By.xpath("//input[@value='Go']")).click();
		driver.findElement(By.xpath("//span[text()='Samsung Galaxy 42 MM Smartwatch (Midnight Black)']")).click();
		String par=driver.getWindowHandle();
		Set <String> chld=driver.getWindowHandles();
		for (String x:chld) {
			
			if (!par.equals(x))
				
			{
			
				driver.switchTo().window(x);
			
			}
	
			
			}
		
		driver.findElement(By.xpath("//input[@title='Add to Shopping Cart']")).click();
		
		

	}

}
