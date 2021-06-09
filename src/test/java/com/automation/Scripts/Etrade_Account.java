package com.automation.Scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import com.Automation.CustomisedExceptions.FrameWorkExceptions;
import com.Automation.Guna.Base.BaseTest;
import com.Automation.Pages.Etrade_ChooseAccountType;
import com.Automation.Utilities.POJO_Utility;

public class Etrade_Account extends BaseTest {
	
	@Test
	public void OpenAccount() throws InterruptedException, FrameWorkExceptions, IOException {
		
		getDriver().get("https://www.Etrade.com");
		
		Etrade_ChooseAccountType.Click_OpenAccount();
	
		
		Etrade_ChooseAccountType.SelectAccount(POJO_Utility.GetExcel().GetCellValue("index", "0", 7, 3));
		
		//Account.SlectAccount("BANK");
		
		Thread.sleep(5000);
		
				

		
	}

}
