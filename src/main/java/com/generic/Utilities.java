package com.generic;

import java.util.Random;

public class Utilities {

	Random objRandom=new Random();
	
	public String generateRandomFirstName()
	{
		
		int length=4;
		String strLetters="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String randomString="";
		for(int index=0;index<length;index++){
		int rnum= (int)((Math.random()*strLetters.length()));//returns 0 to str.length()i.e.52
		randomString +=strLetters.substring(rnum, rnum+1);
		}
		
		String strFirstNames[]={"Mahesh","Sagar","Pooja","Nikhil","Jay"};
		String strFirstName=strFirstNames[objRandom.nextInt(strFirstNames.length)];
		return (strFirstName+randomString);
	}
	 
	
	public String generateRandomSurname()
	{
		int length=4;
		String strLetters="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String randomString="";
		for(int index=0;index<length;index++){
		int rnum= (int)((Math.random()*strLetters.length()));//returns 0 to str.length()i.e.52
		randomString +=strLetters.substring(rnum, rnum+1);
		}
		
		String strSurNames[]={"Jawale","Khade","Patel","Jadhav","Patil"};
		String strSurName=strSurNames[objRandom.nextInt(strSurNames.length)];
		return strSurName+randomString;
		 
	}
	
	public String generateMobileNum()
	{
		String strMobNumStartingDigits[]={"9","7","8","6"};
		String strMobNumStartingDigit=strMobNumStartingDigits[objRandom.nextInt(strMobNumStartingDigits.length)];
		int length=9;
		String strMobNumDigits="0123456789";
		String randomNumber="";
		for(int index=0;index<length;index++){
		int rnum= (int)((Math.random()*strMobNumDigits.length()));
		randomNumber +=strMobNumDigits.substring(rnum, rnum+1);
		}
		return strMobNumStartingDigit+randomNumber;
	}
	
	
	public String generateEmailAdd()
	{
		String strEmailAddProviders[]={"@gmail.com","@yahoo.com","@rediffmail.com"};
		String strEmailAddProvider=strEmailAddProviders[objRandom.nextInt(strEmailAddProviders.length)];
		int length=6;
		String strLettersandNums="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		String randomString="";
		for(int index=0;index<length;index++){
		int rnum= (int)((Math.random()*strLettersandNums.length()));
		randomString +=strLettersandNums.substring(rnum, rnum+1);
		}
		return randomString+strEmailAddProvider;
	}
	
	public char[] generatePassword()
	{
		String strCapitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String strLowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
		String strSpecialCharacters = "!@#$";
		String strNumbers = "1234567890";

		String strCombinedChars = strCapitalCaseLetters + strLowerCaseLetters + strSpecialCharacters + strNumbers;

		char[] charPassword = new char[6];

		charPassword[0] = strLowerCaseLetters.charAt(objRandom.nextInt(strLowerCaseLetters.length()));
		charPassword[1] = strCapitalCaseLetters.charAt(objRandom.nextInt(strCapitalCaseLetters.length()));
		charPassword[2] = strSpecialCharacters.charAt(objRandom.nextInt(strSpecialCharacters.length()));
		charPassword[3] = strNumbers.charAt(objRandom.nextInt(strNumbers.length()));

		for (int i = 4; i < 6; i++) {
			charPassword[i] = strCombinedChars.charAt(objRandom.nextInt(strCombinedChars.length()));
		}

		return charPassword;
		
	}
	
	
	public int generateDate()
	{
		int intMaxDate=30;
		int intMinDate=1;
		int intDate=objRandom.nextInt(intMaxDate-intMinDate)+intMinDate;//nextInt() methods returns random number between 0(inclusive) and the number passed in this argument
		return intDate;
	}
	
	public String generateMonth()
	{
		String strMonths[]={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
		String strMonth=strMonths[objRandom.nextInt(strMonths.length)];
		return strMonth;
	}
	
	public int generateYear()
	{
		int intMaxYear=2021;
		int intMinYear=1905;
		int intYear=objRandom.nextInt(intMaxYear-intMinYear)+intMinYear;
		return intYear;
	}
	
	public String generateGender()
	{
		String strGenders[]={"Male","Female"};
		String strGender=strGenders[objRandom.nextInt(strGenders.length)];
		return strGender;
	}
	
}
