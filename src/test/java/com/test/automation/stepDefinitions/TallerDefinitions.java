package com.test.automation.stepDefinitions;

import com.test.automation.steps.TallerStep;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class TallerDefinitions {

	@Steps
	TallerStep tallerStep;
	
	@Given("Start invetory page")
	public void startInventoryPage() {
		tallerStep.startPage();
	}
	
	@When("I enter the user \"([^\"]*)\" and the password \"([^\"]*)\"")
	public void enterTheUserAndPassword(String user, String password) {
		tallerStep.enterTheUserAndPassword(user, password);
	}
	
	@When("I press the login button")
	public void pressTheLoginButton() {
		tallerStep.pressTheLoginButton();
	}
	
	@Then("I validate the succesful login with the user \"([^\"]*)\"")
	public void validateTheSuccesfulLogin(String user) {
		tallerStep.validateTheSuccesfulLogin(user);
	}
	
	
}
