package com.Automation.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Automation.Guna.Base.BaseTest;

public class Etrade_ChooseAccountType {
	
	@FindBy(xpath =  "//span[text()='Brokerage account']")
	private static WebElement BrokerageAccount;
	
	@FindBy(xpath = "//span[text()='Bank account']")
	private static WebElement BankAccount;
	
	@FindBy(xpath = "//span[text()='Retirement account']")
	private static WebElement RetirementAccount;
	
	@FindBy(xpath = "//div[@class='nav-end-btn']//a[@role='button']")
	private static WebElement OpenAccount;
	
	static
	{
		PageFactory.initElements(BaseTest.getDriver(), Etrade_ChooseAccountType.class);
	}
	
	public static void Click_OpenAccount() {

		OpenAccount.click();
	}
	
	public static void SelectAccount(String AccountName) {
	
		
		if(AccountName.equalsIgnoreCase(BrokerageAccount.getText()))
		{
			
			BrokerageAccount.click();
		}
		else if(AccountName.equalsIgnoreCase(BankAccount.getText()))
		{
			BankAccount.click();
		}
		else if (AccountName.equalsIgnoreCase(RetirementAccount.getText())) {
			
			RetirementAccount.click();
			
		}
	}

}
