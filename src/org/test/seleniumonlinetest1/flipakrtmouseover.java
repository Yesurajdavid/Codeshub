package org.test.seleniumonlinetest1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class flipakrtmouseover {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Suraj\\eclipse-workspace\\SeleniumTest1\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.homedepot.com/");
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//a[text()='Home Decor & Furniture']"))).build().perform();
		Thread.sleep(3000);
		driver.findElement(
				By.xpath("//div[@class='homeDecorFurnitureFlyout__shelf']//a[text()='                                Clocks                               ']"))
				.click();
	}

}
