package Test;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import BasePackage.DriverClass;

public class LoginTest extends DriverClass{
	
	public By EmailID = By.id("com.nichi.artimecapsule:id/email");
	public By Pssword = By.id("com.nichi.artimecapsule:id/password");
	public By LoginButton  = By.id("com.nichi.artimecapsule:id/login_btn");
	public By Forgotpassword = By.id("com.nichi.artimecapsule:id/forgot_password");
	public By AlertMessage = By.id("com.nichi.artimecapsule:id/alert_body");
	public By OKButtonOnAlertBox = By.id("com.nichi.artimecapsule:id/alert_ok");
	
	public String getAlertText (){
		String alertText = driver.findElement(AlertMessage).getText();
		return alertText;
	} 
	
	public void clickOnOKButtonOnAlertBox (){
		driver.findElement(OKButtonOnAlertBox).click();
	}
	
	@Test(priority=1)
	
	public void verifyEmptyTextValidationMessage (){
		driver.findElement(EmailID).clear();
		driver.navigate().back();
		Assert.assertEquals(getAlertText(),"Please enter email aaddress.");
		clickOnOKButtonOnAlertBox();
	}
	
	@Test (priority=2)
	
	public void verifyInvalidEmailValidationError (){
		driver.findElement(EmailID).clear();
		driver.findElement(EmailID).sendKeys("sdsds");
		Assert.assertEquals(getAlertText(),"Email address should be in xyz@domain.com format.");
		clickOnOKButtonOnAlertBox();
	}
	
	@Test (priority=2)
	
	public void verifyEmptyPasswordValidationError (){
		driver.findElement(EmailID).clear();
		driver.findElement(EmailID).sendKeys("sdsds@gmail.com");
		Assert.assertEquals(getAlertText(),"Please enter password.");
		clickOnOKButtonOnAlertBox();
	}
	
	public void verifyInvalidpasswordError (){
		driver.findElement(Pssword).clear();
		driver.findElement(Pssword).sendKeys("12345678910");
		Assert.assertEquals(getAlertText(),"Please enter password.");
		clickOnOKButtonOnAlertBox();
	}
	
	
	
	

}
