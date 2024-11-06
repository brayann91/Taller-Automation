package com.test.automation.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Actions extends PageObject{

	WebElement el = null;
	
	
	public WebElement waitObject(WebElement element, int time) {
		
		WebDriverWait wait = new WebDriverWait(getDriver(), time);
		
		wait.until(ExpectedConditions.visibilityOf(element));
		return element;
	}
	
	public void waitImplicity(int time) {
		getDriver().manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}

	public WebDriver initializeDriver() {
		// Configura WebDriverManager para manejar el driver
		WebDriverManager.chromedriver().setup();

		// Configura ChromeOptions si es necesario
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");

		// Inicializa el WebDriver
		WebDriver driver = new ChromeDriver(options);
		return driver;
	}

	public String WebElementToString(WebElement element){
		String textElement = element.getText();
		return textElement;
	}

	public WebElement existentElementValidation(WebElement element) {
		try{
			element.isDisplayed();
		}catch (NoSuchElementException e){
			element = null;
		}
		return element;
	}

	public void quitDriver() {
		getDriver().quit();
	}
}
