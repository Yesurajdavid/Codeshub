package org.test.seleniumonlinetest1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertconcept{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Suraj\\eclipse-workspace\\SeleniumTest1\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/form/table[2]/tbody/tr/td[2]/table/tbody/tr[1]/td[1]/table/tbody/tr[3]/td[2]/table/tbody/tr[6]/td[2]/a/img")).click();
		Alert alrt = driver.switchTo().alert();
		String al=alrt.getText();
		System.out.println(al);
		alrt.accept();

	}

}
