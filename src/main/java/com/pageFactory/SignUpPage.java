package com.pageFactory;

import org.openqa.selenium.By;
import org.testng.Assert;
import com.generic.BaseTest;

public class SignUpPage {

	private BaseTest objBaseTest;

	public SignUpPage(BaseTest baseTest) {
		this.objBaseTest = baseTest;
	}

	// Locators
	By loc_inpFirstName = By.xpath("//div[@id='reg_form_box']//input[@name='firstname']");
	By loc_inpSurName = By.xpath("//div[@id='reg_form_box']//input[@name='lastname']");
	By loc_inpMobileNum = By.xpath("//div[@id='reg_form_box']//input[@name='reg_email__']");
	By loc_inpEmailAdd = By.xpath("//div[@id='reg_form_box']//input[@name='reg_email__']");
	By loc_inpPassword = By.xpath("//div[@id='reg_form_box']//input[@type='password']");
	By loc_inpDate = By.xpath("//select[@id='day']");
	By loc_inpMonth = By.xpath("//select[@id='month']");
	By loc_inpYear = By.xpath("//select[@id='year']");
	By loc_inpGenderFemale=(By.xpath("//input[@value='1']"));
	By loc_inpGenderMale = By.xpath("//input[@value='2']");
	By loc_txtCreateAccount = By.xpath("//div[text()='Create a new account']");
	
	
	
	public void verifyCreateAccountPageIsDisplayed()
	{
		String strAccountText=objBaseTest.getObjseleniumWrapperFunctions().getText(loc_txtCreateAccount);
		Assert.assertTrue(strAccountText.equals("Create a new account"));
		
	}
	

	public void setFirstNameInFBSignUpPage(String strFirstName) {

		System.out.println("First Name is : " + strFirstName);
		Assert.assertTrue(objBaseTest.getObjseleniumWrapperFunctions().setText(loc_inpFirstName, strFirstName));
	}

	public void setSurnameInFBSignUpPage(String strSurname) {
		System.out.println("Surname is : " + strSurname);
		Assert.assertTrue(objBaseTest.getObjseleniumWrapperFunctions().setText(loc_inpSurName, strSurname));
		
	}

	public void setMobileNumInFbSignUpPage(String strMobileNum) {
		System.out.println("Mobile Number is : " + strMobileNum);
		Assert.assertTrue(objBaseTest.getObjseleniumWrapperFunctions().setText(loc_inpMobileNum, strMobileNum));
		
	}

	public void setEmailAddInFbSignUpPage(String strEmailAdd) {

		System.out.println("Email Address is : " + strEmailAdd);
		Assert.assertTrue(objBaseTest.getObjseleniumWrapperFunctions().setText(loc_inpEmailAdd, strEmailAdd));
	}

	public void setPasswordInFBSignUpPage(char charPasssword[]) {
		System.out.println("Password is : " + String.valueOf(charPasssword));
		Assert.assertTrue(objBaseTest.getObjseleniumWrapperFunctions().setText(loc_inpPassword, String.valueOf(charPasssword)));
	}

	public void selectDate(int intDate) {
		String strDate = Integer.toString(intDate);
		System.out.println("Date is : " + strDate);
		Assert.assertTrue(objBaseTest.getObjseleniumWrapperFunctions().selectDropDown(loc_inpDate,strDate));
		
		
		
	/*	List<WebElement> listDates = objBaseTest.getDriver().findElements(loc_inpDate);
		for (WebElement listDate : listDates) {
			if (listDate.getText().equals(strDate)) {
				listDate.click();
				break;
			}
		}*/

	}

	public void selectMonth(String strMonth) {
		System.out.println("Month is : " + strMonth);
		Assert.assertTrue(objBaseTest.getObjseleniumWrapperFunctions().selectDropDown(loc_inpMonth,strMonth));
		
	/*	List<WebElement> listMonths = objBaseTest.getDriver().findElements(loc_inpMonth);
		for (WebElement listMonth : listMonths) {
			if (listMonth.getText().equals(strMonth)) {
				listMonth.click();
				break;
			}
		}*/
	}

	public void selectYear(int intYear) {
		String strYear = Integer.toString(intYear);
		System.out.println("Year is : " + strYear);
		
		Assert.assertTrue(objBaseTest.getObjseleniumWrapperFunctions().selectDropDown(loc_inpYear,strYear));
		
	/*	List<WebElement> listYears = objBaseTest.getDriver().findElements(loc_inpYear);
		for (WebElement listYear : listYears) {
			if (listYear.getText().equals(strYear)) {
				listYear.click();
				break;
			}
		}*/
	}

	/*public void selectGender(String strGender) {
		System.out.println("Gender is : " + strGender);
		List<WebElement> listGenders = objBaseTest.getDriver().findElements(loc_inpGender);
		System.out.println(listGenders.size());
		for (WebElement listGender : listGenders) {
			System.out.println(listGender);
			String value = listGender
					.findElement(By.xpath("//div[@id='birthday_age']/following-sibling::div//span/span/label"))
					.getText();
			System.out.println("value= " + value);
			if (listGender.findElement(By.xpath("//div[@id='birthday_age']/following-sibling::div//span/span/label"))
					.getText().equals(strGender)) {
				System.out.println(listGender
						.findElement(By.xpath("//div[@id='birthday_age']/following-sibling::div//span/span/input"))
						.getText());
				listGender.click();
				System.out.println("clicked");
				break;

			}
		}
	}*/

	public void selectGender(String strGender) {

	
		if (strGender.equalsIgnoreCase("Male"))
		{
			Assert.assertTrue(objBaseTest.getObjseleniumWrapperFunctions().selectRadioButton(loc_inpGenderMale));
		}
		else if(strGender.equalsIgnoreCase("Female"))
		{
			Assert.assertTrue(objBaseTest.getObjseleniumWrapperFunctions().selectRadioButton(loc_inpGenderFemale));
		}
		else
		{
			System.out.println("Invalid Gender");
		}
	}


		
	public void clickOnSignUpButton() {
		System.out.println("SignUp button is clicked");
	}

}
