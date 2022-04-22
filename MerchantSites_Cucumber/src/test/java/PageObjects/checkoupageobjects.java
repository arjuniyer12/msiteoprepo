package PageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.waithelper;

public class checkoupageobjects {

	public WebDriver driver;
	public waithelper waithelper;
	

	public checkoupageobjects(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		waithelper=new waithelper(driver);
	}




	@FindBy(xpath="//button[@id='button-payment-address']")
	WebElement BillingAddressConfirm;


	@FindBy(xpath="//button[@id='button-shipping-address']")
	WebElement ShippingAddressConfirm;

	@FindBy(xpath="//button[@id='button-shipping-method']")
	WebElement ShippingMethodConfirm;

	@FindBy(xpath="//input[@name='agree']")
	WebElement Agreeterms;

	@FindBy(xpath="//button[@id='button-payment-method']")
	WebElement PaymentMenthodConfirm;



	public void clickonbillingaddressconfirm() {
		try {
			waithelper.waitforelement(BillingAddressConfirm, 10);
			BillingAddressConfirm.click();	
		} catch (Exception e)
		{
			System.out.println("Direct clicking doesnt work, try alternate method");
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();",BillingAddressConfirm);

		}
	}
	
	public void clickonshippingaddressconfirm() {
		try {
			waithelper.waitforelement(ShippingAddressConfirm, 10);
			ShippingAddressConfirm.click();
		} catch (Exception e)
		{
			
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();",ShippingAddressConfirm);

		}

		
	}

	
	public void clickonshippingmethodconfirm() {
		try {
			waithelper.waitforelement(ShippingMethodConfirm, 10);
			ShippingMethodConfirm.click();
		} catch (Exception e)
		{
			
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();",ShippingMethodConfirm);

		}

	}
	
	public void clickonagreeterms() {
		try {
			waithelper.waitforelement(Agreeterms, 10);
			Agreeterms.click();
		} catch (Exception e)
		{
			
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();",Agreeterms);

		}

	}

	public void clickonpaymentmethodconfirm() {
		try {
			waithelper.waitforelement(PaymentMenthodConfirm, 10);
			PaymentMenthodConfirm.click();
		} catch (Exception e)
		{
			
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();",PaymentMenthodConfirm);

		}

	}

}
