package Test;

import org.testng.annotations.Test;

import BasePackage.DriverClass;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;


public class Register extends DriverClass{
	 @AndroidFindBy(id = "com.nichi.artimecapsule:id/signup")
     public MobileElement SignUpBUtton;
	 
	 @AndroidFindBy (id = "com.nichi.artimecapsule:id/name")
	 public MobileElement NickName;
	 
	 
	 
	 
	 @Test
	 
	 public void yyy (){
		 SignUp.click();
	 }
	 

}
