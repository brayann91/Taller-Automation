package com.test.automation.steps;

import com.test.automation.pages.TallerPageObject;
import com.test.automation.utils.Actions;

import net.thucydides.core.annotations.Step;

public class TallerStep {

	TallerPageObject tallerPageObject;
	Actions actions;
	
	@Step
	public void startPage() {
		//actions.initializeDriver().get("https://inventario-billar.net/login.php");

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
