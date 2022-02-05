package com.ha.advanced;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\alokkumarh\\OneDrive - HealthAsyst Pvt. Ltd\\OneDrive\\Java training\\Components\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://github.com/");
		driver.findElement(By.xpath("//a[normalize-space()='Sign in']")).click();
		driver.findElement(By.id("login_field")).sendKeys("Admin");
		driver.findElement(By.id("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@name='commit']")).click();
	}

}
