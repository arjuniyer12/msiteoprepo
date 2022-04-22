package StepDefintions;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import Hooks.hooks;
import PageObjects.HomepageObjects;
import PageObjects.checkoupageobjects;
import PageObjects.loginpageobjects;
import PageObjects.productpageobjects;

public class baseclass {
	
	public WebDriver driver;
	public checkoupageobjects co;
	public HomepageObjects ho;
	public loginpageobjects lo;
	public productpageobjects po;
	String pagetitle;
	public Properties configprop;
	
	
	
	
	

}
