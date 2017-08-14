package Test;

import org.openqa.selenium.By;
import org.testng.Assert;

import BasePackage.DriverClass;

public class Login extends DriverClass{
	public By EmailId = By.id("com.nichi.artimecapsule:id/email");
	public By Password = By.id("com.nichi.artimecapsule:id/password");
	public By ForGotPassword = By.id("com.nichi.artimecapsule:id/forgot_password");
	public By LoginButton  = By.id("com.nichi.artimecapsule:id/login_btn");
	public By OKButtonOnError = By.name("OK");
	public By ErrorMessage = By.id("android:id/message");
	
	public void clickOnOnAlertMessage (){
		driver.findElement(OKButtonOnError).click();
	}
	
	public String returnErrorMessage (){
		String errorMsg = driver.findElement(ErrorMessage).getText();
		return errorMsg;
		
	}
	
	public void loginEmptyEmailFieldsValidation (){
		driver.findElement(LoginButton).click();
		Assert.assertEquals(returnErrorMessage(),"Please enter email address.");
		clickOnOnAlertMessage();
	}
	
	public void EmptyPasswordvalidationError (){
		driver.findElement(EmailId).sendKeys("sdfsdf@fdfgf.com");
		Assert.assertEquals(returnErrorMessage(), "Please enter password.");
		clickOnOnAlertMessage();
	}
	

	

}

