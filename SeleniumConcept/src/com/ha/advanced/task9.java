package com.ha.advanced;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class task9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\alokkumarh\\OneDrive - HealthAsyst Pvt. Ltd\\OneDrive\\Java training\\Components\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://nasscom.in/");
		
		driver.findElement(By.partialLinkText("New User")).click(); 
		
		
		driver.findElement(By.id("edit-field-fname-reg")).sendKeys("Admin");
		driver.findElement(By.id("edit-field-lname")).sendKeys("pass");
		driver.findElement(By.id("edit-mail")).sendKeys("Help@gmail.com");
		driver.findElement(By.id("edit-field-company-name-registration")).sendKeys("Google");
		
		
		Select Buss=new Select(driver.findElement(By.id("edit-field-business-focus-reg")));
		
		Buss.selectByVisibleText("IT Consulting");
		
		
		
		driver.findElement(By.id("edit-submit--2")).click();
	}

}
