package Tests;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.SignInPage;
import resources.base;

public class validateSignInDetails extends base{
	
	@BeforeTest
	public void initialise() throws IOException {
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
	}

	@AfterTest
	public void tearDown()
	{
		
		driver.close();
		driver = null; /// to minimize use of memory driver should make null
	}
	
	@Test
	public void to_validate_User() throws IOException
	{
	
	
	SignInPage s=new SignInPage(driver);
	s.getUsername().sendKeys("sanjeetk@clariontechnologies.co.in");
	s.getPassword().sendKeys("clarion");
	s.LogIn().click();
	String actual=driver.getTitle();
	String expected="Promises Log";
	
     Assert.assertEquals(actual, expected);
     System.out.println("user successfully loggedIn");
	
	
	
	}

}
