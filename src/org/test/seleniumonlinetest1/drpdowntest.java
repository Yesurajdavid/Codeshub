package org.test.seleniumonlinetest1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class drpdowntest {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Suraj\\eclipse-workspace\\SeleniumTest1\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		WebElement commnds=driver.findElement(By.id("selenium_commands"));
		Select d=new Select(commnds);
		d.selectByIndex(2);
		d.selectByIndex(3);
		d.selectByVisibleText("WebElement Commands");
		d.deselectAll();
		boolean ik=d.isMultiple();
		System.out.println(ik);
		}
		
	}

