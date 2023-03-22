package com.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import BaseDetails.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition extends Base {

	@Given("User is on facebook page")
	public void user_is_on_facebook_page() {

		browserLaunch("https://www.facebook.com/");

	}

	@When("User enter the {string} and {string}")
	public void user_enter_the_and(String username, String password) {
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
	}

	@When("User clicks on loginpage")
	public void user_clicks_on_loginpage() {

		driver.findElement(By.xpath("//*[@type = 'submit']")).click();

		// driver.quit();
	}

	@When("User print the pagetitle")
	public void user_print_the_pagetitle() {
		System.out.println(driver.getTitle());
		// driver.quit();
	}

	@When("User get current url")
	public void user_get_current_url() {
		System.out.println(driver.getCurrentUrl());
		// driver.quit();
	}

	@Then("User verify the error message")
	public void user_verify_the_error_message() {

		Assert.assertTrue(false);

		System.out.println("Successfully...");

	}

	@Given("User is on Adactin page")
	public void user_is_on_Adactin_page() {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(option);
		driver.get("http://adactinhotelapp.com/");

	}

}