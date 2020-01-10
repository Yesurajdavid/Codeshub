package org.test.seleniumonlinetest1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Suraj\\eclipse-workspace\\SeleniumTest1\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		Actions act=new Actions(driver);
	driver.switchTo().frame(0);
	WebElement sourceele=driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
	WebElement targetele=driver.findElement(By.xpath("//p[text()='Drop here']"));
	act.clickAndHold(sourceele).moveToElement(targetele).release().build().perform();
	
	}
}
