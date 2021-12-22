package com.pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.generic.BaseTest;

public class OrangeHRM_PIMPage {
	private BaseTest objBaseTest;
	
	public OrangeHRM_PIMPage(BaseTest baseTest) {
		this.objBaseTest= baseTest;
	}
	// Locators
	By loc_orangeHRM_PIMPage= By.xpath("//div[@id='mainMenu']/ul/li[2]/a");
	By loc_orangeHRM_PIMPage_AddEmployee = By.xpath("//div[@id='mainMenu']/ul/li[2]/ul/li[3]/a");
	By loc_inpFirstName_OrangeHRM_PIMPage_AddEmployee = By.xpath("//input[@id='firstName']");
	By loc_inpLastName_OrangeHRM_PIMPage_AddEmployee = By.xpath("//input[@id='lastName']");
	By loc_inpEmpID_OrangeHRM_PIMPage_AddEmployee = By.xpath("//input[@id='employeeId']");
	By loc_btnSave_OrangeHRM_PIMPage_AddEmployee = By.xpath("//input[@id='btnSave']");
	By loc_orangeHRM_PIMPage_EmployeeList = By.xpath("//div[@id='mainMenu']/ul/li[2]/ul/li[2]/a");
	By loc_inpEmpName_OrangeHRM_PIMPage_EmployeeList = By.xpath("//input[@id='empsearch_employee_name_empName']");
	By loc_inpEmpID_OrangeHRM_PIMPage_EmployeeList = By.xpath("//input[@id='empsearch_id']");
	By loc_btnSearch_OrangeHRM_PIMPage_EmployeeList = By.xpath("//input[@id='searchBtn']");
	
	
	
	public void switchToPIM_Page(String strFirstName,String strLastName)
	{
		Assert.assertTrue(objBaseTest.getObjseleniumWrapperFunctions().click(loc_orangeHRM_PIMPage));
		
		//Add Employee
		Assert.assertTrue(objBaseTest.getObjseleniumWrapperFunctions().click(loc_orangeHRM_PIMPage_AddEmployee));
		Assert.assertTrue(objBaseTest.getObjseleniumWrapperFunctions().setText(loc_inpFirstName_OrangeHRM_PIMPage_AddEmployee,strFirstName));
		Assert.assertTrue(objBaseTest.getObjseleniumWrapperFunctions().setText(loc_inpLastName_OrangeHRM_PIMPage_AddEmployee,strLastName));
		WebElement empID=objBaseTest.getDriver().findElement(loc_inpEmpID_OrangeHRM_PIMPage_AddEmployee);
		String strValue=empID.getAttribute("value");
		System.out.println("Employee Id : "+strValue);
		Assert.assertTrue(objBaseTest.getObjseleniumWrapperFunctions().click(loc_btnSave_OrangeHRM_PIMPage_AddEmployee));	
		
		//Employee List
		Assert.assertTrue(objBaseTest.getObjseleniumWrapperFunctions().click(loc_orangeHRM_PIMPage_EmployeeList));
		Assert.assertTrue(objBaseTest.getObjseleniumWrapperFunctions().setText(loc_inpEmpName_OrangeHRM_PIMPage_EmployeeList,(strFirstName+" "+strLastName)));
		Assert.assertTrue(objBaseTest.getObjseleniumWrapperFunctions().setText(loc_inpEmpID_OrangeHRM_PIMPage_EmployeeList,strValue));
		Assert.assertTrue(objBaseTest.getObjseleniumWrapperFunctions().click(loc_btnSearch_OrangeHRM_PIMPage_EmployeeList));
	
		
	
	}
	
	
	

}
