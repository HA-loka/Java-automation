package com.ha.advanced;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class advTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
			
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\alokkumarh\\OneDrive - HealthAsyst Pvt. Ltd\\OneDrive\\Java training\\Components\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		
		
		
		//driver.findElement(By.name("fldLoginUserId")).sendKeys("1234");
		
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='login_page']")));

		driver.findElement(By.xpath("//input[@name='fldLoginUserId']")).sendKeys("789788");

		driver.findElement(By.linkText("CONTINUE")).click();
		
		driver.close();
		
		
		

	}

}
