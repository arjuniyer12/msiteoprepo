package Hooks;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import StepDefintions.baseclass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class hooks extends baseclass{

	//public WebDriver driver;


	@Before
	public WebDriver setup() throws IOException {
		configprop=new Properties();
		FileInputStream configpropfile=new FileInputStream("config.properties");
		configprop.load(configpropfile);

		String br=configprop.getProperty("browser");

		if (br.equals("chrome")) {

			WebDriverManager.chromedriver().setup();
			if (driver==null)
				driver=new ChromeDriver();

		}

		else if (br.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();

		}
		else {
			System.out.println("invalid browser name");
		}
		driver.manage().window().maximize();
		return driver;

	}

	@After
	public void teardown() {
		driver.close();
		driver=null;
	}

}
