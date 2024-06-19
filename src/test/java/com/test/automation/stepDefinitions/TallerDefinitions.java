package com.test.automation.stepDefinitions;

import com.test.automation.steps.TallerStep;

import com.test.automation.utils.constants.LoginData;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import sun.rmi.runtime.Log;

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

	@When("The user admin log into the app")
	public void logIntoTheAppWithAdminUser() {
		String userAdmin = LoginData.USER_ADMIN;
		String adminPassword = LoginData.ADMIN_PASSWORD;
		tallerStep.logIntoTheApp(userAdmin, adminPassword);
	}

	@When("The user cash log into the app")
	public void LogIntoTheAppWithCashUser() {
		String userCash = LoginData.CASH_USER;
		String cashPassword = LoginData.CASH_PASSWORD;
		tallerStep.logIntoTheApp(userCash, cashPassword);
	}
	
	@Then("I validate the successful login with the user \"([^\"]*)\"")
	public void validateTheSuccessfulLogin(String user) {
		tallerStep.validateTheSuccesfulLogin(user);
	}

	@Then("I validate the successful admin login")
	public void validateTheSuccessfulLoginWithAdminUser() {
		String userAdmin = LoginData.USER_ADMIN;
		tallerStep.validateTheSuccessfulAdminLogin(userAdmin);
	}

	@Then("I validate the successful cash login")
	public void validateTheSuccessfulLoginWithCashUser() {
		String userCash = LoginData.CASH_USER;
		tallerStep.validateTheSuccessfulCashLogin(userCash);
	}
	
	
}
