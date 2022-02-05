package com.ha.stepdefination;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


public class LoginStep {
	WebDriver driver;

	@Given("I have browser with OpenEMR page")
	public void i_have_browser_with_open_emr_page() {
		// Write code here that turns the phrase above into concrete actions
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://demo.openemr.io/b/openemr/");
	}

	@When("I enter username as {string}")
	public void i_enter_username_as(String username) {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("authUser")).sendKeys(username);

	}

	@When("I enter password as {string}")
	public void i_enter_password_as(String password) {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("clearPass")).sendKeys(password);
	}

	@When("I select language as {string}")
	public void i_select_language_as(String language) {
		// Write code here that turns the phrase above into concrete actions
		Select lan = new Select(driver.findElement(By.name("languageChoice")));

		lan.selectByVisibleText(language);
	}

	@When("I click on login")
	public void i_click_on_login() {
		// Write code here that turns the phrase above into concrete actions
		WebElement login=driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		login.submit();
	}

	@Then("I should get access to portal with title as {string}")
	public void i_should_get_access_to_portal_with_title_as(String expectedTitle) {
		// Write code here that turns the phrase above into concrete actions
		String actualTitle=driver.getTitle();
		Assert.assertEquals(expectedTitle,actualTitle);
		driver.quit();
	}
	@Then("I should get the error {string}")
	public void i_should_get_the_error(String expectedError) {
	    // Write code here that turns the phrase above into concrete actions
	    String actualError=driver.findElement(By.xpath("//div[contains(text(),'Invalid')]")).getText();
	   Assert.assertEquals(expectedError,actualError);
	   driver.quit();
	}
	

}
