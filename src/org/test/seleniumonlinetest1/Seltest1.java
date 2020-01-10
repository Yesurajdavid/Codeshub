package org.test.seleniumonlinetest1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Seltest1 {
public static void main(String[] args) {
	System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Suraj\\eclipse-workspace\\SeleniumTest1\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.trivago.in/");
	
}
}

