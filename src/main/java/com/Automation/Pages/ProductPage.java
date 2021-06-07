package com.Automation.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Automation.CustomisedExceptions.FrameWorkExceptions;
import com.Automation.Guna.Base.BaseTest;
import com.relevantcodes.extentreports.LogStatus;

public class ProductPage extends BaseTest {
	
	private static String Date= "June 2021";
	private static String Day= "20";
	
	
	@FindBy(id = "input-quantity")
	private static WebElement Quantity;
	
	@FindBy(xpath = "//i[@class='fa fa-calendar']")
	private static WebElement Deliverydate;
	
	@FindBy(xpath = "/html/body/div[4]/div/div[1]/table/thead/tr[1]/th[2]")
	private static WebElement MonthYear;
	
	@FindBy(xpath = "/html/body/div[4]/div/div[1]/table/thead/tr[1]/th[3]")
	private static WebElement RightClick;
	
	@FindBy(xpath = "/html/body/div[4]/div/div[1]/table/tbody/tr/td[contains(text(),'20')]")
	private static WebElement SelectDay;
	
	@FindBy(xpath = "//h2[text()='$100.00']")
	private static WebElement Price;
	
	@FindBy(id = "button-cart")
	private static WebElement AddToCart;
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private static WebElement SuccessMSG;
	
	
	
	
	static
	{
		PageFactory.initElements(getDriver(), ProductPage.class);
	}
	
	public static void CheckDefaultQuantity() {

		String DQuan=Quantity.getAttribute("value");
		if(DQuan.equalsIgnoreCase("1"))
		{
		getExtenttest().log(LogStatus.PASS, "Default Quantity is: "+DQuan);
		}
		else
		{
			getExtenttest().log(LogStatus.FAIL, "Default Quantity is not 1 ");
		}
	}
	
	public static void EnterQuantity(String Enterquantity) {

		Quantity.clear();
		Quantity.sendKeys(Enterquantity);
		getExtenttest().log(LogStatus.PASS, "Quantity Entered as: "+Enterquantity);
		
	}
	
	public static void Select_Deliverydate()
	{
		if(Deliverydate.isEnabled()&Deliverydate.isDisplayed())
		{
			Deliverydate.click();
			
			while(true)
			{
				String Text=MonthYear.getText();
				if(Text.equalsIgnoreCase(Date))
				{
					break;
				}
				else
				{
					RightClick.click();
				}
			}
			
			
			SelectDay.click();
			
		}
	}
	
	public static void Get_Price() {
		
		String price=Price.getText();
		getExtenttest().log(LogStatus.PASS, "Price of the Laptop is: "+price);

	}
	
	public static void Add_To_Cart() throws FrameWorkExceptions {

		if(AddToCart.isDisplayed()&AddToCart.isEnabled())
		{
			AddToCart.click();
			String Text=SuccessMSG.getText();
			if(Text.contains("You have added"))
			{
				getExtenttest().log(LogStatus.PASS, "Product Added To Cart Success MSG is: "+Text);
			}
			
		}
		else
		{
			getExtenttest().log(LogStatus.FAIL, "Product not added to Cart");
			FrameWorkExceptions FW = new FrameWorkExceptions("Unable to add product to Cart");
			throw FW;
		}
	}
	

}
