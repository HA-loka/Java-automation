package com.ha.stepdefination;
import com.ha.stepdefination.LoginStep;
import java.time.Duration;
import java.util.List;
import java.util.Map;

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

public class patientStep {
	@When("I click on patient-client")
	public void i_click_on_patient_client() {
	    // Write code here that turns the phrase above into concrete actions
		
	}

	@When("I click on patient")
	public void i_click_on_patient() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("I click on Add New Patient")
	public void i_click_on_add_new_patient() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("I fill in the form")
	public void i_fill_in_the_form(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    List<Map<String, String>> lists= dataTable.asMaps();
	    System.out.println(lists.get(0));
	    System.out.println(lists.get(0).get("firstname"));
	}

	@When("I click on create new patient")
	public void i_click_on_create_new_patient() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("I click on confirm create new patient")
	public void i_click_on_confirm_create_new_patient() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("I store the text and handle the alert box")
	public void i_store_the_text_and_handle_the_alert_box() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("I click on happy birthday if available")
	public void i_click_on_happy_birthday_if_available() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("the alert text should contains {string}")
	public void the_alert_text_should_contains(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("I should get the added patient name {string}")
	public void i_should_get_the_added_patient_name(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

}
