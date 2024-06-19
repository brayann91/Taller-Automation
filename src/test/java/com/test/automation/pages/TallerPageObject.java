package com.test.automation.pages;

import com.test.automation.utils.constants.HomeData;
import net.serenitybdd.core.annotations.findby.FindBy;
import org.openqa.selenium.WebElement;

import com.test.automation.utils.Actions;

import junit.framework.Assert;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://inventario-billar.net/login.php")

public class TallerPageObject extends PageObject {

	Actions actions;

	@FindBy(id = "usuario")
	public static WebElement txtUser;

	@FindBy(id = "password")
	public static WebElement txtPassWord;

	@FindBy(xpath = "//button[@class='btn btn-primary']")
	public static WebElement btnLogin;

	@FindBy(xpath = "//h1[contains(text(), 'Bienvenido')]")
	public static WebElement lblWelcome;

	@FindBy(id = "id_sede")
	public static WebElement listCampus;

	@FindBy(xpath = "//button[@class='btn btn-success']")
	public static WebElement btnUpdateCampus;

	@FindBy(xpath = "//button[@aria-controls='nav-productos']")
	public static WebElement tabProducts;

	public void insertUser(String user) {
		actions.waitObject(txtUser, 10);
		txtUser.sendKeys(user);
	}

	public void insertPassword(String password) {
		txtPassWord.sendKeys(password);
	}

	public void pressLogin() {
		btnLogin.click();
	}

	public void validateUser(String user) {
		actions.waitObject(lblWelcome, 5);
		Assert.assertTrue(lblWelcome.getText().contains("Bienvenido " + user));
		actions.quitDriver();
	}

	public void validateAdminUser(String user) {
		String updateCampus = HomeData.UPDATE_CAMPUS;
		actions.waitObject(lblWelcome, 5);
		Assert.assertTrue(lblWelcome.getText().contains("Bienvenido " + user));
		Assert.assertNotNull(listCampus);
		Assert.assertEquals(updateCampus, actions.WebElementToString(btnUpdateCampus));
		Assert.assertNotNull(tabProducts);
		actions.quitDriver();
	}

	public void validateCashUser(String user) {
		actions.waitObject(lblWelcome, 5);
		Assert.assertTrue(lblWelcome.getText().contains("Bienvenido " + user));
		Assert.assertNull(actions.existentElementValidation(listCampus));
		Assert.assertNull(actions.existentElementValidation(btnUpdateCampus));
		Assert.assertNull(actions.existentElementValidation(tabProducts));
		actions.quitDriver();
	}

}
