package org.day8;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automationtexting3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sowmi\\eclipse-workspace\\Seleniumtask\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
driver.get(" http://demo.automationtesting.in/Alerts.html");
WebElement click = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));

click.click();

WebElement btn = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
btn.click();



		
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("sowmiya");
		alert.accept();
	}

}
