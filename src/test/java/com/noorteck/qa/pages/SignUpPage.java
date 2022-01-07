package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class SignUpPage extends CommonUI{

	@FindBy(id = "user_email")
	WebElement emailField;
	
	@FindBy(id = "user_password")
	WebElement passwordField;
	
	@FindBy(xpath = "//input[@name='commit']")
	WebElement signUpButton;
	
	public SignUpPage() {
		PageFactory.initElements(driver, this);
	}
	public void enterEmailID(String emailID) {
		enter(emailField, emailID);
	}
	public void passwordField(String password) {
		enter(passwordField, password);
	}
	public void clickEnter() {
		click(signUpButton);
	}
}
