package org.day8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hdfcbank7 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sowmi\\eclipse-workspace\\Seleniumtask\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		
		List<WebElement> total = driver.findElements(By.tagName("iframe"));
		int size = total.size();
		System.out.println(size);
		
		driver.switchTo().frame(0);
		
		WebElement username = driver.findElement(By.name("fldLoginUserId"));
		username.sendKeys("sowmiya");
		
		WebElement click = driver.findElement(By.xpath("//a[text()='CONTINUE']"));
		click.click();
		
		WebElement pass = driver.findElement(By.name("fldPassword"));
		pass.click();
		
		
	}

}
