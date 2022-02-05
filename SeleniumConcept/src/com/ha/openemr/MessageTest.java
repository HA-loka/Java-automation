package com.ha.openemr;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.internal.MouseAction.Button;
import org.openqa.selenium.support.ui.Select;



public class MessageTest {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\alokkumarh\\OneDrive - HealthAsyst Pvt. Ltd\\OneDrive\\Java training\\Components\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://demo.openemr.io/b/openemr");
		
		//user id="authUser"
		//password id="clearPass"
		//Language name="languageChoice"
		//Login button -- class="btn btn-login btn-lg"
		
		
		//WebElement ele=driver.findElement((By.id("authUser")));
		//ele.sendKeys("admin");
		
		driver.findElement(By.id("authUser")).sendKeys("admin");
		driver.findElement(By.id("clearPass")).sendKeys("pass");
		
		Select lan=new Select(driver.findElement(By.name("languageChoice")));
		
		lan.selectByVisibleText("English (Indian)");
		
		
		WebElement login=driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		login.submit();
		
		String actualTitle=driver.getTitle();
		System.out.println(actualTitle);
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		//WebElement logout=driver.findElement(By.xpath("//li[@data-bind=\"click: logout\"]"));
		
		//logout.click();
		
		WebElement user=driver.findElement(By.id("username"));
		
		user.click();
		//driver.findElement(By.linkText("Logout")).click();
		
		//ul[@id="userdropdown"]
		
		WebElement logout=driver.findElement(By.xpath("//ul[@id=\"userdropdown\"]//li[@data-bind=\"click: logout\"]"));
		logout.click();
		
		
		//driver.close();
		

	}

}
