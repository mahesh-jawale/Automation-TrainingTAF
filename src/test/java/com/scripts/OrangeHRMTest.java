package com.scripts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.generic.BaseTest;
import com.generic.Utilities;
import com.pageFactory.OrangeHRMLoginPage;
import com.pageFactory.OrangeHRM_PIMPage;


public class OrangeHRMTest extends BaseTest {

	OrangeHRMLoginPage objOrangeHRMLoginPage = new OrangeHRMLoginPage(this);
	OrangeHRM_PIMPage objOrangeHRM_PIMPage =new OrangeHRM_PIMPage(this);
	Utilities objUtilities = new Utilities();
	@BeforeClass
	public void beforeMainMethod()
	{
		this.initializeWebEnvironment();
	}
	
	
	@Test(priority=1)
	public void orangeHRMLoginTest()  {
	System.out.println("-----------------Orange HRM Login Test-------------");
	String strUserName=objUtilities.generate_OrangeHRM_UserName();
	String strPassword=objUtilities.generate_OrangeHRM_Password();
	objOrangeHRMLoginPage.setUserName(strUserName);
	objOrangeHRMLoginPage.setPassword(strPassword);
	objOrangeHRMLoginPage.clickOnLoginButton();
	}
	
	
/*	@Test(priority=2) 
	public void orangeHRMPIMTest()  {
	System.out.println("-----------------Orange HRM PIM Test-------------");
	String strFirstName="Jay";
	String strLastName="Mehta";
	objOrangeHRM_PIMPage.switchToPIM_Page(strFirstName,strLastName);

	}*/
	
	@AfterClass
	public void afterMainMethod()
	{
		//tearDown();
	}
	
	
}
