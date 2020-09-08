package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class SignInPage {

	public WebDriver driver;
	
	private By loginButton=By.className("button_white");
	private By username=By.name("txtUsername");
	private By password=By.xpath("//input[@name='txtPassword']");
	private By text=By.xpath("//font[contains(text(),'Invalid Username')]");

	
	
	
	
	public SignInPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement LogIn()
	{
		return driver.findElement(loginButton);
		
	}
	
	public WebElement getUsername()
	{
		return driver.findElement(username);
	}

	
	public WebElement getPassword()
	{
		return driver.findElement(password);
	}
	public WebElement getText()
	{
		return driver.findElement(text);
	}
	
	
}
