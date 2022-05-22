package org.day8;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Onlinesbi6 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sowmi\\eclipse-workspace\\Seleniumtask\\Driver\\chromedriver.exe ");
		WebDriver driver = new ChromeDriver(); 

		driver.get(" https://retail.onlinesbi.com/retail/login.htm");
		WebElement click = driver.findElement(By.xpath("(//a[text()='CONTINUE TO LOGIN'])[1]"));
		click.click();
		
		WebElement btn = driver.findElement(By.id("Button2"));
		btn.click();
		
		Thread.sleep(3000);
		
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		
		
	}

}
