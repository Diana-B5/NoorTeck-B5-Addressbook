package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class SignInPage extends CommonUI {

	@FindBy(id = "session_email")
	WebElement signInEmailField;

	@FindBy(id = "session_password")
	WebElement signInPWField;

	@FindBy(css = ".btn.btn-primary")
	WebElement signInButton;

	public SignInPage() {
		PageFactory.initElements(driver, this);
	}

	public void enterEmailID(String emailID) {
		enter(signInEmailField, emailID);
	}

	public void enterPassword(String password) {
		enter(signInPWField, password);
	}

	public void clickEnter() {
		click(signInButton);
	}
}