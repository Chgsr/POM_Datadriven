package com.Automation.Pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Automation.Guna.Base.BaseTest;

public class Account {
	
	@FindBy (xpath = "//span[@class='selection-item-option']")
	private static List<WebElement> AccountType;
	
	public static void SlectAccount(String Vall) {
		
		if(AccountType!=null)
		{
		for(int i=0; i<=AccountType.size();i++)
		{
			String Value=AccountType.get(i).getAttribute("id");
			System.out.println(Value);
			if(Value.equalsIgnoreCase(Vall))
			{
				AccountType.get(i).click();
			}
		}
		}
	
	
	

}
}
