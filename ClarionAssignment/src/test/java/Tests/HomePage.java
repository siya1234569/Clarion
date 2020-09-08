package Tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import pages.SignInPage;
import resources.base;

public class HomePage extends base {




	@BeforeTest
	public void initialise() throws IOException {
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
	}


	@Test
	public void basePagenavigation() throws IOException {

		// you can access methods of another class by inheritance or by making an object
		// of that class
		
		
        SignInPage sn = new SignInPage(driver);
	    sn.LogIn().click();
	    WebElement actual=sn.getText();
	   String expected="[[ChromeDriver: chrome on WINDOWS (be153d85aceb310e815820e50bc5dd32)] -> xpath: //font[contains(text(),'Invalid Username')]]"; 
	   if(actual.equals(expected))
	   {
		   System.out.println("validation is  displaying for blank fields");
	   }
	   else
	   {
		   System.out.println("validation is not displaying for blank fields");  
	   }
	   
	 
		
	}

	

	@AfterTest
	public void tearDown()
	{
		
		driver.close();
		driver = null; /// to minimize use of memory driver should make null

	}


	
}
