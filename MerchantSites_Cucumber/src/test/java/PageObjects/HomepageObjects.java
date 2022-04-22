package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomepageObjects {
	public WebDriver driver;
	
	
	
	
	
	
	
	public HomepageObjects(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	
	@FindBy(xpath="//h4[normalize-space()='Trays']")
	WebElement cattraylink;
	
	@FindBy(linkText="Glass Tealight Candle Holders Pack")
	WebElement productlnk;
	
	
	
	
	
	public String getPageTitle() {
		return driver.getTitle();
	}
	public void clickoncategorypage() {
		cattraylink.click();
	}
	
	
	public void clickonproduct() {
		
		productlnk.click();
	}

}
