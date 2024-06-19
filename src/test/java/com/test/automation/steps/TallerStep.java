package com.test.automation.steps;

import com.test.automation.pages.TallerPageObject;

import net.thucydides.core.annotations.Step;

public class TallerStep {

	TallerPageObject tallerPageObject;
	
	@Step
	public void startPage() {
		tallerPageObject.open();
	}
	
	@Step
	public void enterTheUserAndPassword(String user, String password) {
		tallerPageObject.insertUser(user);
		tallerPageObject.insertPassword(password);
	}
	
	@Step
	public void pressTheLoginButton() {
		tallerPageObject.pressLogin();
	}
	
	@Step
	public void validateTheSuccesfulLogin(String user) {
		tallerPageObject.validateUser(user);
	}

	@Step
	public void logIntoTheApp(String user, String password) {
		tallerPageObject.insertUser(user);
		tallerPageObject.insertPassword(password);
		tallerPageObject.pressLogin();
	}

	@Step
	public void validateTheSuccessfulAdminLogin(String user) {
		tallerPageObject.validateAdminUser(user);
	}

	@Step
	public void validateTheSuccessfulCashLogin(String user) {
		tallerPageObject.validateCashUser(user);
	}
}
