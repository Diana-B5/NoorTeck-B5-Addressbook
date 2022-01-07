package com.noorteck.qa.test;

import com.noorteck.qa.utils.CommonUI;
import com.noorteck.qa.utils.ObjInitialize;

public class AddressBookTest extends ObjInitialize {

	public static void main(String[] args) {

		String url = "http://a.testaddressbook.com/sign_up";
		String url2 = "http://a.testaddressbook.com/sign_in";

		
		CommonUI.openBrowser("chrome");
	//	CommonUI.navigate(url);
		initializeClassObj();
	//	addressBookTest();
		CommonUI.navigate(url2);
		addressBookTestTwo();
		CommonUI.quitBrowser();

	}

	public static void addressBookTest() {
		signUpObj.enterEmailID("johnCena16@gmail.com");
		signUpObj.passwordField("123456789");
		signUpObj.clickEnter();
		homeObj.getText();
		System.out.println(homeObj.getText());
	}

	public static void addressBookTestTwo() {
		signInObj.enterEmailID("johnCena1055@gmail.com");
		signInObj.enterPassword("123456789");
		signInObj.clickEnter();
		homeObj.clickAddressesPage();
		addressesObj.clickNewAddress();
		addressesObj.enterFirstName("John");
		addressesObj.enterLastName("Cena");
		addressesObj.enterAddress1("123 str");
		addressesObj.enterCity("Arlington");
		addressesObj.selectState("value", "VA");
		addressesObj.clickCountry();
		addressesObj.enterAge("22");
		addressesObj.enterPhone("123-2334-3434");
		addressesObj.clickCommonInterestsField("Dancing");
		addressesObj.enterNote("Automation is Fun");
		addressesObj.clickCreate();
		addressesObj.clickList();
		
	}
}

/**
 * -------------------------------------- INSTRUCTIONS
 * --------------------------------------------
 * 
 * ---> Create JAVA CLASS for each page of the application ---> Inspect the
 * elements and store the values ---> Create the class constructor ---> Create
 * the methods
 * 
 * ---> DONT FORGET ***** EACH PAGE CLASS SHOULD INHERIT CommonUI Class
 * ******************* ---> DONT FORGET ***** DECLARE PAGE CLASS OBJECT in
 * CONSTANTS CLASS ******************* ---> DONT FORGET ***** INITIALIZE PAGE
 * CLASS OBJECTS IN ObjInitialize JAVA ClASS ******************* ---> DONT
 * FORGET ***** CHANGE JAVA VERSION TO 1.8 *******************
 * 
 * 
 * 
 * ---> For each test case create a method then call those methods from main
 * method. ---> DONT FORGET ***** Refer to the INSTRUCTION PDF file for the test
 * cases to automate **************
 * 
 * ---> ONCE FINISHED AUTOMATING Create Repository in GitHub and push to GitHub
 * ---> Once pushed add US to the project then send picture in MENTORS GROUP
 * CHAT Crystal: --> Koritzerc23@gmail.com Helen: --> Hnbehining@gmail.com
 * Ahmad: --> a.stanikzai77@gmail.com Fahim: --> NTKBatch5
 * 
 * 
 */
