package com.pageFactory;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.generic.BaseTest;

public class OrangeHRMLoginPage {
	private BaseTest objBaseTest;
	
	public OrangeHRMLoginPage(BaseTest baseTest) {
		this.objBaseTest = baseTest;
	}

	// Locators
	By loc_inpUserName= By.xpath("//input[@id='txtUsername']");
	By loc_inpPassword= By.xpath("//input[@id='txtPassword']");
	By loc_btnLogin= By.xpath("//input[@id='btnLogin']");
	
	
	public void setUserName(String strUserName)
	{
		System.out.println("UserName is : "+strUserName);
		Assert.assertTrue(objBaseTest.getObjseleniumWrapperFunctions().setText(loc_inpUserName, strUserName));
	}
	
	public void setPassword(String strPassword)
	{
		System.out.println("Password is : "+strPassword);
		Assert.assertTrue(objBaseTest.getObjseleniumWrapperFunctions().setText(loc_inpPassword, strPassword));
	}
	
	public void clickOnLoginButton() {
		Assert.assertTrue(objBaseTest.getObjseleniumWrapperFunctions().click(loc_btnLogin));
	}

	
	
	
	
	
}
