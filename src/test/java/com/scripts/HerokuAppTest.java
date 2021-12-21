package com.scripts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.generic.BaseTest;
import com.pageFactory.HerokuAppPage;


public class HerokuAppTest extends BaseTest {
	
	@BeforeClass
	public void beforeMainMethod()
	{
		this.initializeWebEnvironment();
	}
	
	@Test
	public void signUpTest()  {
	
		HerokuAppPage objHerokuAppPage = new HerokuAppPage(this);
		objHerokuAppPage.verifyCheckBox();
		objHerokuAppPage.verifyUploadFile();
		objHerokuAppPage.verifyDragAndDrop();
		objHerokuAppPage.verifyDownloadFile();
		objHerokuAppPage.verifyDropDown();
		objHerokuAppPage.verifyTitle();
		objHerokuAppPage.verifyURL();
		objHerokuAppPage.verifyMultipleWindows();
		
	}
	
	@AfterClass
	public void afterMainMethod()
	{
		//tearDown();
	}
	

}
