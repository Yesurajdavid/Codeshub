package org.test.seleniumonlinetest1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class snapdealmouseover {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Suraj\\eclipse-workspace\\SeleniumTest1\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.switchTo().frame(0);
		WebElement id = driver.findElement(By.name("fldLoginUserId"));
		id.sendKeys("71019027");
		WebElement click=driver.findElement(By.xpath("/html/body/form/table[2]/tbody/tr/td[2]/table/tbody/tr[1]/td[1]/table/tbody/tr[3]/td[2]/table/tbody/tr[6]/td[2]/a/img"));
		click.click();
		Thread.sleep(5000);
		driver.findElement(By.name("fldPassword")).sendKeys("Rogers@74");
		driver.findElement(By.id("chkrsastu")).click();
		driver.findElement(By.xpath("//td[@class='login_tab1']//a[@ondblclick='return fLogon()']//img[@border='0']")).click();
		
		
		
		

	}

}
