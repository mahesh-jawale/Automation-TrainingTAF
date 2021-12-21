package com.pageFactory;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.generic.BaseTest;

public class HerokuAppPage {
	private BaseTest objBaseTest;

	public HerokuAppPage(BaseTest baseTest) {
		this.objBaseTest = baseTest;
	}
	
	// Locators
	By loc_checkboxPage = By.xpath("//ul/li/a[text()='Checkboxes']");
	By loc_chkCheckbox1 = By.xpath("//form[@id='checkboxes']/input[1]");
	By loc_basicAuthPage = By.xpath("//ul/li/a[text()='Basic Auth']");
	By loc_uploadFilePage = By.xpath("//ul/li/a[text()='File Upload']");
	By loc_btnChooseFileInUploadFilePage = By.xpath("//input[@id='file-upload']");
	By loc_btnUploadInUploadFilePage = By.xpath("//input[@class='button']");
	By loc_dragAndDropPage = By.xpath("//ul/li/a[text()='Drag and Drop']");
	By loc_fromInDragAndDropPage = By.xpath("//div[@id='column-a']");
	By loc_toInDragAndDropPage = By.xpath("//div[@id='column-b']");
	By loc_downloadFilePage = By.xpath("//ul/li/a[text()='File Download']");
	By loc_fileInDownloadFilePage = By.xpath("//div/a[text()='Mickey.jpg']");
	By loc_dropDownPage = By.xpath("//ul/li/a[text()='Dropdown']");
	By loc_drpInDropDownPage = By.xpath("//select[@id='dropdown']");
	By loc_multipleWindowsPage = By.xpath("//ul/li/a[text()='Multiple Windows']");
	By loc_openingNewWindowInMultipleWindowsPage = By.xpath("//a[text()='Click Here']");

	public void verifyCheckBox()
	{
		Assert.assertTrue(objBaseTest.getObjseleniumWrapperFunctions().click(loc_checkboxPage));
		if(objBaseTest.getObjseleniumWrapperFunctions().isSelected(loc_chkCheckbox1)==true)
		{
			//deselect
			Assert.assertTrue(objBaseTest.getObjseleniumWrapperFunctions().click(loc_chkCheckbox1));
		}
		else
		{ 
			//select
			Assert.assertTrue(objBaseTest.getObjseleniumWrapperFunctions().click(loc_chkCheckbox1));
		}
		objBaseTest.getObjseleniumWrapperFunctions().navigateBack();
	}
	
	public void verifyUploadFile() 
	{
		Assert.assertTrue(objBaseTest.getObjseleniumWrapperFunctions().click(loc_uploadFilePage));
		Assert.assertTrue(objBaseTest.getObjseleniumWrapperFunctions().setText(loc_btnChooseFileInUploadFilePage, "C:\\Users\\ADMIN$\\Downloads\\doc.txt"));
		Assert.assertTrue(objBaseTest.getObjseleniumWrapperFunctions().click(loc_btnUploadInUploadFilePage));
		objBaseTest.getObjseleniumWrapperFunctions().navigateBack();
		objBaseTest.getObjseleniumWrapperFunctions().navigateBack();
	}
	
	public void verifyDownloadFile() 
	{
		Assert.assertTrue(objBaseTest.getObjseleniumWrapperFunctions().click(loc_downloadFilePage));
		Assert.assertTrue(objBaseTest.getObjseleniumWrapperFunctions().click(loc_fileInDownloadFilePage));
		objBaseTest.getObjseleniumWrapperFunctions().navigateBack();
	
	}
	
	public void verifyDropDown()
	{
		Assert.assertTrue(objBaseTest.getObjseleniumWrapperFunctions().click(loc_dropDownPage));
		Assert.assertTrue(objBaseTest.getObjseleniumWrapperFunctions().selectDropDown(loc_drpInDropDownPage,"Option 2"));
		objBaseTest.getObjseleniumWrapperFunctions().navigateBack();
	}
	
	public void verifyDragAndDrop() 
	{
		Assert.assertTrue(objBaseTest.getObjseleniumWrapperFunctions().click(loc_dragAndDropPage));
		Assert.assertTrue(objBaseTest.getObjseleniumWrapperFunctions().dragAndDrop(loc_fromInDragAndDropPage, loc_toInDragAndDropPage));
		objBaseTest.getObjseleniumWrapperFunctions().navigateBack();
	}
	
	public void verifyTitle()
	{
		String strTitle=objBaseTest.getObjseleniumWrapperFunctions().getTitle();
		Assert.assertTrue(strTitle.equals("The Internet"));
	}
	
	public void verifyURL()
	{
		String strURL=objBaseTest.getObjseleniumWrapperFunctions().getCurrentUrl();
		Assert.assertTrue(strURL.equals("https://the-internet.herokuapp.com/"));
	}
	
	public void verifyMultipleWindows()
	{
		Assert.assertTrue(objBaseTest.getObjseleniumWrapperFunctions().click(loc_multipleWindowsPage));
		Assert.assertTrue(objBaseTest.getObjseleniumWrapperFunctions().click(loc_openingNewWindowInMultipleWindowsPage));
		// It will return the parent window name as a String
		String strParent=objBaseTest.getDriver().getWindowHandle();

		Set<String> s =objBaseTest.getDriver().getWindowHandles();

		// Now iterate using Iterator
		Iterator<String> I1= s.iterator();

		while(I1.hasNext())
		{

		String strChildWindow=I1.next();


		if(!strParent.equals(strChildWindow))
		{
		objBaseTest.getDriver().switchTo().window(strChildWindow);

		objBaseTest.getDriver().switchTo().window(strChildWindow);
		System.out.println(objBaseTest.getObjseleniumWrapperFunctions().getTitle());

		Assert.assertTrue(objBaseTest.getObjseleniumWrapperFunctions().close());
		}

		}
		//switch to the parent window
		objBaseTest.getDriver().switchTo().window(strParent);
		objBaseTest.getObjseleniumWrapperFunctions().navigateBack();
		
	}
	
	
}
