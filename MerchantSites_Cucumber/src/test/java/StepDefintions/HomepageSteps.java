package StepDefintions;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Hooks.hooks;
import PageObjects.HomepageObjects;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


public class HomepageSteps extends baseclass{



	public HomepageSteps(hooks hk) throws IOException {
		driver=hk.setup();
	}


	@Given("user is on homepage")
	public void user_is_on_homepage() {
		
		driver.get("https://www.zestimcart.com");
	}


	@When("User gets title of the page")
	public void user_gets_title_of_the_page() {
		ho=new HomepageObjects(driver);
		pagetitle=ho.getPageTitle();
	}

	@Then("homepage title should be {string}")
	public void homepage_title_should_be(String expectedtitle) {
		Assert.assertTrue("Title does not match",pagetitle.contains(expectedtitle));
	}

}


