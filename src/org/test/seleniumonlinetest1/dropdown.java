package org.test.seleniumonlinetest1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Suraj\\eclipse-workspace\\SeleniumTest1\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement month = driver.findElement(By.id("month"));
		Select a = new Select(month);
		List<WebElement> sel = a.getOptions();
		for (int i = 0; i < sel.size(); i++) {
			WebElement ele = sel.get(i);
			String op = ele.getText();
			System.out.println(op);
		}
		for (WebElement element : sel) {
			String ak = element.getText();
			System.out.println(ak);
		}
		WebElement oi = a.getFirstSelectedOption();
		String text = oi.getText();
		System.out.println(text);
		List <WebElement>as=a.getAllSelectedOptions();
		for (WebElement zx:as) {
			String zv=zx.getText();
			System.out.println(zv);
		}
		
		boolean bn=a.isMultiple();
		System.out.println(bn);
		System.out.println("Only selc options");
	
	}
}