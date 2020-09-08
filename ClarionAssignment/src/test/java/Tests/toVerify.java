package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class toVerify {
	@Test
	public void AddPromise() {
		 System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	 		WebDriver driver = new ChromeDriver();
	         driver.get("http://182.74.238.221/clarion_promise_qa/index.php#");
	         driver.findElement(By.name("txtUsername")).sendKeys("sanjeetk@clariontechnologies.co.in");
	         driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("clarion");
	         driver.findElement(By.className("button_white")).click();
             driver.findElement(By.partialLinkText("Log Promi")).click();
             driver.findElement(By.cssSelector("body.body_default:nth-child(2) table:nth-child(1) tbody:nth-child(1) tr:nth-child(1) td:nth-child(2) > select:nth-child(1)")).click();
            Select s=new Select( driver.findElement(By.xpath("//select[@name='cboEmp']")));
            s.selectByVisibleText("Sonali test");
            driver.findElement(By.id("txtPromise")).sendKeys("select me.I deserves");
            driver.findElement(By.id("btnSubmit")).click();
            driver.findElement(By.id("cboEmp")).click();
            Select s1=new Select( driver.findElement(By.xpath("//select[@id='cboEmp']")));
            
            s1.selectByVisibleText("Sonali test");
            driver.findElement(By.name("btnSearch")).click();
            driver.findElement(By.xpath("//b[contains(text(),'LOGOUT')]")).click();
            System.out.println("user successfully logged out");
}
}
