package Test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import BasePackage.DriverClass;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import junit.framework.Assert;


public class Register extends DriverClass{
	 @AndroidFindBy(id = "com.nichi.artimecapsule:id/signup")
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
	 
	 
	 
	 
	 
	 
	 
	
	 
	 @Test
	 
	 public void checkvalidRegistration  () throws InterruptedException{
		 NickName.click();
		 NickName.sendKeys("");
		 EmailId.click();
		 EmailId.sendKeys("");
		 Gender.click();
		 Male.click();
		 Age.click();
		 AgeRange.click();
		 Password.sendKeys("");
		 ConfirmPasssword.sendKeys("");
		 Thread.sleep(5000);
		 String succeesmessage = driver.findElement(By.id("android:id/message")).getText();
		 Assert.assertEquals(succeesmessage, "An Account activation link has been sent to %@. Please check your Spam folder too."); 
	 }
	 

}
