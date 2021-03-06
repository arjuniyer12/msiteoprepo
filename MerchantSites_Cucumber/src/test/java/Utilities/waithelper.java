package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waithelper {

	public WebDriver driver;

	public waithelper(WebDriver driver) {
		this.driver=driver;

	}

	public void waitforelement(WebElement element,long timeOutInSeconds) {

		WebDriverWait wait= new WebDriverWait(driver,timeOutInSeconds);
		wait.until(ExpectedConditions.visibilityOf(element));

	}

}
