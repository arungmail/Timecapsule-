package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import BasePackage.DriverClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import junit.framework.Assert;


public class Register extends DriverClass{
	
	public By SigUp = By.id("com.nichi.artimecapsule:id/signup");
	public By NickName = By.id("com.nichi.artimecapsule:id/name");
	public By Email = By.id("com.nichi.artimecapsule:id/email");
	public By Gender = By.id("com.nichi.artimecapsule:id/gender");
	public By Male = By.name("Male");
	public By GenderOk = By.name("OK");
	public By Password = By.id("com.nichi.artimecapsule:id/password");
	public By Age = By.id("com.nichi.artimecapsule:id/mobileno");
	public By ConfirmPassword = By.id("com.nichi.artimecapsule:id/confirmpassword");
	public By SignUpButton = By.id("com.nichi.artimecapsule:id/submit_btn");
	public By AgeSelection = By.name("21 - 30");
	public By Sucessmessage = By.id("com.nichi.artimecapsule:id/alert_body");
	public By OK = By.name("OK");
	
	
	public void clickOnOKButton (){
		driver.findElement(OK).click();
	}
	
	public void clickOnOKButtonOnAlertMessage (){
		driver.findElement(By.id("com.nichi.artimecapsule:id/alert_ok")).click();
	}
	public String getValidationMessage(){
		String validationMessage = driver.findElement(Sucessmessage).getText();
		return validationMessage;
	}
	
	
	
	public void exlicitWait(WebElement element){
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public String getSignUpSucessmessage (){
		return driver.findElement(By.id("android:id/message")).getText();
	}
	
	/* @AndroidFindBy(id = "com.nichi.artimecapsule:id/signup")
     public MobileElement SignUpBUtton;
	 
	 @AndroidFindBy (id = "com.nichi.artimecapsule:id/name")
	 public MobileElement NickName;
	 
	 @AndroidFindBy (id = "com.nichi.artimecapsule:id/email" )
	 public MobileElement EmailId ;
	 
	 @AndroidFindBy (id = "com.nichi.artimecapsule:id/gender")
	 public MobileElement Gender ;
	 
	 @AndroidFindBy (name = "Male")
	 public MobileElement Male ;
	 
	 @AndroidFindBy (name = "Female")
	 public MobileElement Female ;
	 
	 @AndroidFindBy (name = "OK")
	 public MobileElement OK ;
	 
	 
	 @AndroidFindBy (id = "com.nichi.artimecapsule:id/password")
	 public MobileElement Password;
	 
	 @AndroidFindBy (id = " com.nichi.artimecapsule:id/mobileno")
	 public MobileElement Age;
	 
	 
	 
	 @AndroidFindBy (id = "com.nichi.artimecapsule:id/confirmpassword")
	 public MobileElement ConfirmPasssword;
	 
	 @AndroidFindBy (id = "com.nichi.artimecapsule:id/submit_btn")
	 public MobileElement SignUp;
	 
	 
	 @AndroidFindBy (name = "21 - 30")
	 public MobileElement AgeRange;
	 
	 @AndroidFindBy (id = "android:id/message")
	 public MobileElement SigNUpSucessMessage ;
	 */
	 String email = "abcdegg@mailinator.com";
	 String existingEmailId = "test2@mailinator.com";
	 String emaili = "koor@mailinator.com";
	 String nickname  = "dfdfsdgg";
	 String str = "An Account activation link has been sent to %s . Please check your Spam folder too.";
	 
	 
	 
	 
	 
	 
	 
	
	 
	@Test(priority=1)
	 
	 public void checkvalidRegistration  () throws InterruptedException{
		driver.navigate().back();
		driver.findElement(SigUp).click();
		driver.findElement(NickName).sendKeys(nickname);
		driver.navigate().back();
		driver.findElement(Email).sendKeys(email);
		driver.navigate().back();
		driver.findElement(Age).click();
		driver.findElement(AgeSelection).click();
		clickOnOKButton();
		driver.findElement(Gender).click();
		driver.findElement(Male).click();
		clickOnOKButton();
		driver.findElement(Password).sendKeys("12345678");
		driver.navigate().back();
		driver.findElement(ConfirmPassword).sendKeys("12345678");
		driver.navigate().back();
		driver.findElement(SignUpButton).click();
		Thread.sleep(500);
		exlicitWait(driver.findElement(Sucessmessage));
		 System.out.println(getValidationMessage());
		 String str1 = String.format(str, email);
		Assert.assertEquals(getSignUpSucessmessage(),str1); 
		//Assert.assertEquals("Please enter email address.",getValidationMessage());
		clickOnOKButton();
		 /*SignUp.click();
		 NickName.click();
		 NickName.sendKeys("");
		 EmailId.click();
		 EmailId.sendKeys("");
		 Gender.click();
		 Male.click();
		 Age.click();
		 AgeRange.click();
		 Password.sendKeys("");
		 ConfirmPasssword.sendKeys("");*/
		 /*Thread.sleep(5000);
		 String succeesmessage1 = driver.findElement(By.id("android:id/message")).getText();
		 Assert.assertEquals(succeesmessage1, "An Account activation link has been sent to %@. Please check your Spam folder too."); */
	 }
	 
	
	@Test(priority=2)
	
	 public void nickNamevalidation (){

			driver.findElement(SigUp).click();
			//driver.findElement(NickName).sendKeys("Arun");
			/*driver.findElement(Email).clear();
			driver.findElement(Email).sendKeys("ghghg@gmail.com");
			driver.navigate().back();
			driver.findElement(Age).click();
			driver.findElement(AgeSelection).click();
			clickOnOKButton();
			driver.findElement(Gender).click();
			driver.findElement(Male).click();
			clickOnOKButton();
			driver.findElement(Password).clear();
			driver.findElement(Password).sendKeys("12345678");
			driver.navigate().back();
			driver.findElement(ConfirmPassword).clear();
			driver.findElement(ConfirmPassword).sendKeys("12345678");
			driver.navigate().back();*/
			driver.navigate().back();
			driver.findElement(Password).click();
			driver.navigate().back();
			driver.findElement(SignUpButton).click();
			 System.out.println(getValidationMessage());
			//String succeesmessage = driver.findElement(By.id("android:id/message")).getText();
			Assert.assertEquals("Please enter Nickname.",getValidationMessage());
			try {
				clickOnOKButtonOnAlertMessage();
			}
			catch (Exception e){
				System.out.println("Ok Button not present");
				driver.navigate().back();
			}
			
	 }
	 
	@Test(priority=3)
	 public void verifyExistingNickNamevalidation () throws InterruptedException{
		 Thread.sleep(500);
		 driver.findElement(NickName).sendKeys("Arun");
			driver.navigate().back();
			driver.findElement(Email).sendKeys(emaili);
			driver.navigate().back();
			driver.findElement(Age).click();
			driver.findElement(AgeSelection).click();
			clickOnOKButton();
			driver.findElement(Gender).click();
			driver.findElement(Male).click();
			clickOnOKButton();
			driver.findElement(Password).sendKeys("12345678");
			driver.navigate().back();
			driver.findElement(ConfirmPassword).sendKeys("12345678");
			driver.navigate().back();
			driver.findElement(SignUpButton).click();
			exlicitWait(driver.findElement(Sucessmessage));
			 System.out.println(getValidationMessage());
		 Assert.assertEquals("Nickname already exists. Please try with a] different Nickname.",getValidationMessage());
		 try {
			 clickOnOKButtonOnAlertMessage();
			}
			catch (Exception e){
				System.out.println("Ok Button not present");
			}
		
	 }
	 
	@Test(priority=4)
	 public void verifyExistingEmailIDValidation (){
		driver.findElement(NickName).clear();
		 driver.findElement(NickName).sendKeys("Arunkjk");
		 driver.navigate().back();
		 //ScrollTabs();
		 //driver.findElement(Email).clear();
		 driver.navigate().back();
		 driver.findElement(Email).clear();
		 driver.findElement(Email).sendKeys(existingEmailId);
		 driver.navigate().back();
		 //driver.findElement(Email).sendKeys("ghghg@gmail.com");
			driver.findElement(Age).click();
			driver.findElement(AgeSelection).click();
			clickOnOKButton();
			driver.findElement(Gender).click();
			driver.findElement(Male).click();
			clickOnOKButton();
			driver.findElement(Password).clear();
			driver.findElement(Password).sendKeys("12345678");
			driver.navigate().back();
			driver.findElement(ConfirmPassword).sendKeys("12345678");
			driver.navigate().back();
			driver.findElement(SignUpButton).click();
			exlicitWait(driver.findElement(Sucessmessage));
			exlicitWait(driver.findElement(Sucessmessage));
			System.out.println(getValidationMessage());
		 //String succeesmessage = driver.findElement(By.id("android:id/message")).getText();
		 Assert.assertEquals("This email address already exists.",getValidationMessage());
		 try {
			 clickOnOKButtonOnAlertMessage();
			}
			catch (Exception e){
				System.out.println("Ok Button not present");
			}
		 
	 }
	@Test(priority=5)
	 public void verifyEmptyEmailIdFiels (){
		 //driver.findElement(NickName).sendKeys("Arun");
		 driver.findElement(Email).clear();
		 driver.navigate().back();
		 //driver.findElement(Email).sendKeys("raman@mailinator.com");
		 driver.findElement(Password).click();
		 driver.navigate().back();
		 driver.findElement(SignUpButton).click();
		// String succeesmessage = driver.findElement(By.id("android:id/message")).getText();
		 System.out.println(getValidationMessage());
		 Assert.assertEquals("Please enter email address.",getValidationMessage());
		 try {
			 clickOnOKButtonOnAlertMessage();
			}
			catch (Exception e){
				System.out.println("Ok Button not present");
			}
	
	 }
	@Test(priority=6)
	 public void invalidEmailIdvalidationError (){
		 driver.findElement(Email).sendKeys("raman");
		 driver.navigate().back();
		 driver.findElement(SignUpButton).click();
		 System.out.println(getValidationMessage());
		 //String succeesmessage = driver.findElement(By.id("android:id/message")).getText();
		 Assert.assertEquals("Email address should be in xyz@domain.com format.",getValidationMessage());
		 try {
			 clickOnOKButtonOnAlertMessage();
			}
			catch (Exception e){
				System.out.println("Ok Button not present");
			}
	 }
	 
	@Test(priority=7)
	 public void genderValidation () {
		driver.navigate().back();
		 driver.findElement(SigUp).click();
		 driver.findElement(NickName).clear();
			driver.findElement(NickName).sendKeys("sdgsdgdh");
			driver.navigate().back();
			driver.findElement(Email).sendKeys("ghghgh@gmail.com");
			driver.navigate().back();
	 driver.findElement(SignUpButton).click();
	 System.out.println(getValidationMessage());
	 //String succeesmessage = driver.findElement(By.id("android:id/message")).getText();
	 Assert.assertEquals("Please select gender.",getValidationMessage());
	 clickOnOKButtonOnAlertMessage();
}
	@Test(priority=8)
	 public void agevalidationError (){
		 driver.findElement(Gender).click();
		 driver.findElement(Male).click();
		 clickOnOKButton();
		 driver.findElement(SignUpButton).click();
		 System.out.println(getValidationMessage());
		 // succeesmessage = driver.findElement(By.id("android:id/message")).getText();
		 Assert.assertEquals("Please select age group.",getValidationMessage());
		 clickOnOKButtonOnAlertMessage();
	 }
	 
	@Test(priority=9)
	 public void passwordError (){
		 driver.findElement(Age).click();
		 driver.findElement(AgeSelection).click();
		 clickOnOKButton();
		 driver.findElement(SignUpButton).click();
		 System.out.println(getValidationMessage());
		 //String succeesmessage = driver.findElement(By.id("android:id/message")).getText();
		 Assert.assertEquals("Please enter password.",getValidationMessage());
		 clickOnOKButtonOnAlertMessage();
	 }
	
	@Test(priority=10)
	public void confirmpasswordValidation (){
		driver.findElement(Password).clear();
		driver.findElement(Password).sendKeys("12345678");
		driver.navigate().back();
		driver.findElement(SignUpButton).click();
		//driver.navigate().back();
		//String succeesmessage = driver.findElement(By.id("android:id/message")).getText();
		Assert.assertEquals("Please Re-confirm Password.", getValidationMessage());
		clickOnOKButtonOnAlertMessage();
	}
	
	@Test(priority=11)
	public void matchingpasswordvalidatioError (){
		driver.findElement(ConfirmPassword).sendKeys("12235565");
		driver.navigate().back();
		driver.findElement(SignUpButton).click();
		//String succeesmessage = driver.findElement(By.id("android:id/message")).getText();
		Assert.assertEquals("These passwords don't match. Try again?", getValidationMessage());
		clickOnOKButtonOnAlertMessage();
	}
	
	@Test(priority=12)
	public void lesThanFourCharactresPasssword() throws InterruptedException{
		driver.findElement(Password).clear();
		Thread.sleep(500);
		driver.findElement(Password).sendKeys("dfhd");
		driver.navigate().back();
		driver.findElement(ConfirmPassword).clear();
		driver.findElement(ConfirmPassword).sendKeys("sdg");
		driver.navigate().back();
		driver.findElement(SignUpButton).click();
		//String succeesmessage = driver.findElement(By.id("android:id/message")).getText();
		Assert.assertEquals("Password should be of minimum 8 and maximum 32 characters.", getValidationMessage());
		clickOnOKButtonOnAlertMessage();
	}
	@Test(priority=13)
	public void goBackToSignInPage (){
		if (driver.findElement(SigUp).isDisplayed()){
			driver.navigate().back();	
		}
	}
}
