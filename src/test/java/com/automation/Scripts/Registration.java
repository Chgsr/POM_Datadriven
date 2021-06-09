package com.automation.Scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import com.Automation.CustomisedExceptions.FrameWorkExceptions;
import com.Automation.Guna.Base.BaseTest;
import com.Automation.Pages.HeadersSection;
import com.Automation.Utilities.POJO_Utility;
import com.relevantcodes.extentreports.LogStatus;

public class Registration extends BaseTest{
	
	@Test
	public void Opencart_Registration() throws FrameWorkExceptions, IOException {
		
		getExtenttest().log(LogStatus.PASS, "Browser Opened Successfully");
		getDriver().get(POJO_Utility.GetConf().GetPropertyValue("OpenCart_URL"));
		
		HeadersSection.Click_MyAccount();
		HeadersSection.Click_Register();
		com.Automation.Pages.Registration.Entercredentials();
		com.Automation.Pages.Registration.Click_Agree();
		com.Automation.Pages.Registration.Click_Continue();
		com.Automation.Pages.Registration.Validate_AccountCreation();

		
	}

}
