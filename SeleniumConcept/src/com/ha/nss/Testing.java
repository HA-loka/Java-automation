package com.ha.nss;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.internal.MouseAction.Button;
import org.openqa.selenium.support.ui.Select;

public class Testing {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\alokkumarh\\OneDrive - HealthAsyst Pvt. Ltd\\OneDrive\\Java training\\Components\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.goto.com/meeting/");
		
		driver.findElement(By.id("truste-consent-button")).click();
		
		driver.findElement(By.linkText("Try Free")).click();
		driver.findElement(By.id("first-name")).sendKeys("Alok");
		driver.findElement(By.id("last-name")).sendKeys("Hangari");
		driver.findElement(By.id("login__email")).sendKeys("Hangari@gmail.com");
		
		
		Select size=new Select(driver.findElement(By.id("CompanySize")));
		
		size.selectByVisibleText("100 - 249");
		
		
	}

}

