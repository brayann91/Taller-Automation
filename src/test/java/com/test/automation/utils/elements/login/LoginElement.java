package com.test.automation.utils.elements.login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginElement {

    @FindBy(id = "usuario")
    public WebElement txtUser;

    @FindBy(id = "password")
    public WebElement txtPassword;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement btnLogin;

    @FindBy(xpath = "//h1[contains(text(), 'Bienvenido')]")
    public WebElement lblWelcome;

    public WebElement getTxtUser() { return txtUser; }

    public WebElement getTxtPassword() { return txtPassword; }

    public WebElement getBtnLogin() { return btnLogin; }

    public WebElement getLblWelcome() { return lblWelcome; }
}
