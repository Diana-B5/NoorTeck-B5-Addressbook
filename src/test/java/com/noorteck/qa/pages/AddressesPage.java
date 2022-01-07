package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class AddressesPage extends CommonUI {

	@FindBy(xpath = "//a[normalize-space()='New Address']")
	WebElement newAddress;

	@FindBy(xpath = "//input[@id='address_first_name']")
	WebElement firstName;

	@FindBy(css = "#address_last_name")
	WebElement lastName;

	@FindBy(xpath = "//input[@id='address_street_address']")
	WebElement address1;

	@FindBy(xpath = "//input[@id='address_secondary_address']")
	WebElement address2;

	@FindBy(xpath = "//input[@id='address_city']")
	WebElement cityField;

	@FindBy(xpath = "//select[@id='address_state']")
	WebElement state;

	@FindBy(xpath = "//option[@value='VA']")
	WebElement stateDropDown;

	@FindBy(xpath = "//input[@id='address_zip_code']")
	WebElement zipCode;

	@FindBy(css = "#address_country_us")
	WebElement countryField;

	@FindBy(xpath = "//input[@id='address_age']")
	WebElement ageField;

	@FindBy(xpath = "//input[@id='address_website']")
	WebElement websiteField;

	@FindBy(xpath = "//input[@id='address_phone']")
	WebElement phoneField;

	@FindBy(xpath = "//input[@id='address_interest_dance']")
	WebElement commonInterestsField;

	@FindBy(css = "#address_note")
	WebElement noteField;

	@FindBy(css = "input[value='Create Address']")
	WebElement createAddress;

	@FindBy(xpath = "//div[@class='alert alert-notice'])[1]")
	WebElement successCreate;

	@FindBy(css = "a[data-test='edit']")
	WebElement edit;

	@FindBy(css = "a[data-test='list']")
	WebElement list;

	public AddressesPage() {
		PageFactory.initElements(driver, this);
	}

	public void clickNewAddress() {
		click(newAddress);
	}

	public void enterFirstName(String fName) {
		enter(firstName, fName);
	}

	public void enterLastName(String lName) {
		enter(lastName, lName);
	}

	public void enterAddress1(String address) {
		enter(address1, address);
	}

	public void enterAddress2(String addressTwo) {
		enter(address2, addressTwo);
	}

	public void enterCity(String city) {
		enter(cityField, city);
	}

	public void selectState(String methodName, String indexTextValue) {
		selectFromDropdown(stateDropDown, methodName, indexTextValue);
	}

	public void enterZipCode(String zip) {
		enter(zipCode, zip);
	}

	public void clickCountry() {
		click(countryField);
	}

	public void enterAge(String age) {
		enter(ageField, age);
	}

	public void entreWebsite(String website) {
		enter(websiteField, website);
	}

	public void enterPhone(String phone) {
		enter(phoneField, phone);
	}

	public void clickCommonInterestsField(String comInterest) {
		isSelected(commonInterestsField);
	}

	public void enterNote(String note) {
		enter(noteField, note);
	}

	public void clickCreate() {
		click(createAddress);
	}

	public String getText() {
		return getText(successCreate);
	}

	public void clickEdit() {
		click(edit);
	}

	public void clickList() {
		click(list);
	}

}
