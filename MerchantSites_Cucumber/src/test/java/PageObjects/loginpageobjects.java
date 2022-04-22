package PageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.waithelper;

public class loginpageobjects {
	
	

	public  WebDriver driver;
	public waithelper waithelper;
	
	public loginpageobjects (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		waithelper=new waithelper(driver);
	}
	
	
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement emailuname;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement emailpwd;
	
	@FindBy(xpath="//button[@id='button-login']")
	WebElement loginbtn;
	
	
	
	
	
	public void setuname(String uname) {
		waithelper.waitforelement(emailuname,10);
		emailuname.clear();
		emailuname.sendKeys(uname);
	}
	
	public void setpwd(String pwd) {
		waithelper.waitforelement(emailpwd, 10);
		emailpwd.clear();
		emailpwd.sendKeys(pwd);
	}
	
	public void clickonlogin() {
		try {
			waithelper.waitforelement(loginbtn, 10);
		     loginbtn.click();
		  } catch (Exception e) {
		     JavascriptExecutor executor = (JavascriptExecutor) driver;
		     executor.executeScript("arguments[0].click();",loginbtn);
		  }
		
		

	}
	
	
	
	
	
	
	
	
	
	

}
