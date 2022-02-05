package com.ha.MutipleTabs;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiTab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\alokkumarh\\OneDrive - HealthAsyst Pvt. Ltd\\OneDrive\\Java training\\Components\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.db4free.net");
		
		
		driver.findElement(By.xpath("//b[contains(text(),'phpMy')]")).click();
		
		List<String> windows=new ArrayList<String>(driver.getWindowHandles());
		
		driver.switchTo().window(windows.get(1));
		
		driver.findElement(By.id("input_username")).sendKeys("Bill");
		

	}

}
