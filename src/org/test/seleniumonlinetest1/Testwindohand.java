package org.test.seleniumonlinetest1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testwindohand {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Suraj\\eclipse-workspace\\SeleniumTest1\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("jbl headphones with mic", Keys.ENTER);
		WebElement jbl = driver.findElement(By.xpath("//span[text()='JBL C100SI In-Ear Headphones with Mic (Black)']"));
		jbl.click();
		String par = driver.getWindowHandle();
		System.out.println(par);
		Set<String> child = driver.getWindowHandles();
		System.out.println(child);
		for (String a : child) {
			if (!par.equals(a)) {
				driver.switchTo().window(a);
			}
		}
		WebElement add = driver.findElement(By.xpath("//span[text()='Add to Cart']"));
		add.click();
	}

}
                                   