package com.ha.cloudadmin;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cloudadmin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\alokkumarh\\OneDrive - HealthAsyst Pvt. Ltd\\OneDrive\\Java training\\Components\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://qawebsrv.healthasyst.com:20032/CloudAdmin/ ");
		
		
		driver.findElement(By.id("UserName")).sendKeys("Admin@healthasyst.com");
		driver.findElement(By.id("Password")).sendKeys("Rece@1234");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.id("selectedOrganizationName")).sendKeys("IntergyP13");
		
		driver.findElement(By.xpath("//a[normalize-space()='IntergyP13']")).click();
		driver.findElement(By.id("btnSubmit")).click();
	}

}
