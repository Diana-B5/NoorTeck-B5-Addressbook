package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class HomePage extends CommonUI {

	@FindBy(css = ".nav-item.nav-link.active")
	WebElement homePage;

	@FindBy(css = "a[data-test^='address']")
	WebElement addressesPage;

	@FindBy(xpath = "//a[text()='Sign out']")
	WebElement signOut;

	@FindBy(xpath = "//h1[text()='Welcome to Address Book']")
	WebElement welcomeText;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public void clickHomePage() {
		click(homePage);
	}
	public void clickAddressesPage() {
		click(addressesPage);
	}
	public void clickSignOut() {
		click (signOut);
	}
	public String getText() {
		return getText(welcomeText);
	}

}
