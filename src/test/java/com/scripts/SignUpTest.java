package com.scripts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.generic.BaseTest;
import com.generic.Utilities;
import com.pageFactory.SignUpPage;

public class SignUpTest extends BaseTest
{
	@BeforeClass
	public void beforeMainMethod()
	{
		this.initializeWebEnvironment();
	}
	
	@Test
	public void signUpTest() {

		SignUpPage objSignUpPage = new SignUpPage(this);
		Utilities objUtilities = new Utilities();
		
		String strFirstName = objUtilities.generateRandomFirstName();
		objSignUpPage.setFirstNameInFBSignUpPage(strFirstName);
		
		String strSurname = objUtilities.generateRandomSurname();
		objSignUpPage.setSurnameInFBSignUpPage(strSurname);
		
		String strMobileNum=objUtilities.generateMobileNum();
		objSignUpPage.setMobileNumInFbSignUpPage(strMobileNum);
		
		/*String strEmailAdd=objUtilities.generateEmailAdd();
		objSignUpPage.setEmailAddInFbSignUpPage(strEmailAdd);*/
				
		char charPassword[]= objUtilities.generatePassword();
		objSignUpPage.setPasswordInFBSignUpPage(charPassword);
		
		int intDate=objUtilities.generateDate();
		objSignUpPage.selectDate(intDate);
		
		String strMonth=objUtilities.generateMonth();
		objSignUpPage.selectMonth(strMonth);
		
		int intYear=objUtilities.generateYear();
		objSignUpPage.selectYear(intYear);
		
		String strGender=objUtilities.generateGender();
		objSignUpPage.selectGender(strGender);
		
		objSignUpPage.clickOnSignUpButton();

		//objSignUpTest.afterMainMethod();

	}

	@AfterClass
	public void afterMainMethod()
	{
		//tearDown();
	}
	

	
}
