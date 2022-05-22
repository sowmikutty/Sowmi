package org.day6;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Greens5 {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sowmi\\eclipse-workspace\\Seleniumtask\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		WebElement click = driver.findElement(By.id("heading201"));
		click.click();
		
		WebElement clickbtn = driver.findElement(By.xpath("//a[text()='Resume Model-4 ']"));
		
		Actions acc = new Actions(driver);
		acc.moveToElement(clickbtn).perform();
		acc.contextClick().perform();
		Robot robot = new Robot();
		
		for (int i = 0; i < 4; i++) {
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);
			}
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		
		
	}

}
