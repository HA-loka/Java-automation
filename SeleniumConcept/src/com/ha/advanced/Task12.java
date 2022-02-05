package com.ha.advanced;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\alokkumarh\\OneDrive - HealthAsyst Pvt. Ltd\\OneDrive\\Java training\\Components\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/");
		
		driver.findElement(By.name("UserFirstName")).sendKeys("Alok");
		driver.findElement(By.name("UserLastName")).sendKeys("Kumar");
		
		driver.findElement(By.name("UserEmail")).sendKeys("Alok@gmail.com");
		Select Title=new Select(driver.findElement(By.name("UserTitle")));
		
		Title.selectByVisibleText("IT Manager");
		Select size=new Select(driver.findElement(By.name("CompanyEmployees")));
		size.selectByVisibleText("101 - 500 employees");
		
		Select country=new Select(driver.findElement(By.name("CompanyCountry")));
		country.selectByVisibleText("United Kingdom");
	}

}
