package com.test.automation.pages;

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

}
