package BasePackage;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.remote.MobileCapabilityType;

public class DriverClass {

 public static AndroidDriver  driver;
 
 @AndroidFindBy(id = "com.nichi.artimecapsule:id/signup")
 public MobileElement SignUp;
 
 @AndroidFindBy (id = "com.nichi.artimecapsule:id/name")
 public MobileElement NickName;
 
/* 
 @Test
 
 public void yyy (){
 SignUp.click();
	 
 }
 */
     
	 //@BeforeTest
 
 
        @BeforeSuite 
        
	    public void launnApplication() throws MalformedURLException, InterruptedException{
	       /* DesiredCapabilities cap=new DesiredCapabilities();
	        File app= new File("C:\\Users\\nichiuser\\Downloads\\cordova_project-armv7.android.20170208144005.apk");
	        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "0123456789ABCDEF");
	        cap.setCapability("platformName", "Android");
	        cap.setCapability("app", app.getAbsolutePath());
	        cap.setCapability(MobileCapabilityType.APP_PACKAGE, "com.nichi.swimindia");*/

	        //cap.setCapability("appActivity","com.nichi.swimindia.SplashScreenActivity");
	        /*driver =new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);*/
        	DesiredCapabilities cap = new DesiredCapabilities();
        	File app= new File("C:\\Users\\nichiuser\\Downloads\\AR Capsule_com.nichi.artimecapsule.apk");
    		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "0123456789ABCDEF");
    		cap.setCapability(MobileCapabilityType.APP_PACKAGE, "com.nichi.artimecapsule");
    		cap.setCapability("appActivity","com.nichi.artimecapsule.SplashscreenActivity");
    		driver = new AndroidDriver(new URL(
    				"http://127.0.0.1:4723/wd/hub"), cap);
	        System.out.println(driver);
	        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	       // driver.findElement(By.id("com.nichi.artimecapsule:id/name")).click();
	       
	    Thread.sleep(10000);   
}
        
        @AfterSuite
        
        public void closeApplication (){
        	driver.quit();
        }
}
