package org.day8;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Canarabank5 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sowmi\\eclipse-workspace\\Seleniumtask\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(" https://netbanking.canarabank.in/entry/ENULogin.jsp");
		WebElement click = driver.findElement(By.xpath("(//input[@class='btn btn-default'])[1]"));
		click.click();
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
	}
		
	}