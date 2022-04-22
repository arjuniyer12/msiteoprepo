package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class productpageobjects {

	public WebDriver driver;
	public String qtyvalue;


	public productpageobjects(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="//div[@id='entry_205455']//button[@title='Add to Cart'][normalize-space()='Add to Cart']")
	WebElement addtocartbutton;
	
	@FindBy(xpath="//div[@id='entry_205454']//input[@id='input-quantity']")
	WebElement qtyfield;
	
	@FindBy(xpath="//button[@title='Buy now']")
	WebElement buynowbutton;
	
	
	
	public void clickonaddtocart() {
		addtocartbutton.click();
	}
	
	public void clickonbuynow() {
		buynowbutton.click();
	}
	
	public void setquantity(int qty) {
		qtyvalue=Integer.toString(qty);
		qtyfield.clear();
		qtyfield.sendKeys(qtyvalue);
	}
	
	
	
	
	
	
	
	

}
