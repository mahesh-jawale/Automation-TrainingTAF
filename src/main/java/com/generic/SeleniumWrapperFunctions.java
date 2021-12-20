package com.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class SeleniumWrapperFunctions {

	private BaseTest objBaseTest;

	public SeleniumWrapperFunctions(BaseTest baseTest) {
		this.objBaseTest = baseTest;
	}

	public boolean setText(By locator, String strInputValue) {
		try{
		objBaseTest.getDriver().findElement(locator).sendKeys(strInputValue);
		return true;
		}
		catch(Exception exception)
		{
			System.out.println("I got exception : "+exception.getMessage());
			exception.printStackTrace();
			return false;
		}

	}
	
	public boolean selectDropDown(By locator,String strDate)
	{
		try{
		WebElement dropDown=objBaseTest.getDriver().findElement(locator);
		Select selectDropDown=new Select(dropDown);
		selectDropDown.selectByVisibleText(strDate);
		WebElement option = selectDropDown.getFirstSelectedOption();
		String selectedOption = option.getText();
		System.out.println("Selected option:"+selectedOption);
		verifySelectedDropDownOption(selectedOption, strDate);
		return true;
		}
		catch(Exception exception)
		{
			System.out.println("I got exception : "+exception.getMessage());
			exception.printStackTrace();
			return false;
		}
	}
	
	public boolean selectRadioButton(By locator)
	{
		try{
		WebElement radioButton=objBaseTest.getDriver().findElement(locator);
		radioButton.click();
		verifyRadioButtonIsSelected(radioButton);
		return true;
		}
		catch(Exception exception)
		{
			System.out.println("I got exception : "+exception.getMessage());
			exception.printStackTrace();
			return false;
		}
	}
	
	
	public void verifyRadioButtonIsSelected(WebElement radioButton)
	{
		boolean bolVar=radioButton.isSelected();
		System.out.println(bolVar);
		if(bolVar==true)
		{
			System.out.println("Radiobutton selected");
		}
		else
		{
			System.out.println("Radiobutton not selected");
		}
	}
	
	
	public void verifySelectedDropDownOption(String selectedOption,String strDate)
	{
		if(selectedOption.equals(strDate))
		{
			System.out.println("Selected option is equal to required option");
		}
		else
		{
			
			System.out.println("Selected option is equal not to required option");
			
		}
	}
	
	
	public String getText(By locator)
	{
		try
		{
			String strReturnVal=objBaseTest.getDriver().findElement(locator).getText();
			return strReturnVal;
			
		}
		catch(Exception exception)
		{
			System.out.println("I got exception : "+exception.getMessage());
			return null;
		}
	}

}
