package BasePackage;

import org.openqa.selenium.Dimension;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;

public class Utility extends DriverClass{
	

	
	public Dimension size;

	public void multTouchAction ()  throws InterruptedException {{
	
		  
		  size = driver.manage().window().getSize();
		  //Get X Y Coordinates for touch action 1(Top left side).
		  int x1 = (int) (size.width * 0.20);
		  int y1 = (int) (size.height * 0.20);
		  
		  //Get X Y Coordinates for touch action 2(Top right side).
		  int x2 = (int) (size.width * 0.80);
		  int y2 = (int) (size.height * 0.20);
		  
		  //Get X Y Coordinates for touch action 3(Bottom left side).
		  int x3 = (int) (size.width * 0.20);
		  int y3 = (int) (size.height * 0.80);
		  
		  //Get X Y Coordinates for touch action 4(Bottom right side).
		  int x4 = (int) (size.width * 0.80);
		  int y4 = (int) (size.height * 0.80);
		  
		  //Get X Y Coordinates for touch action 5(middle of the screen).
		  int x5 = size.width / 2;
		  int y5 = size.height / 2;
		  
		  // Create object of MultiTouchAction class.
		  MultiTouchAction maction = new MultiTouchAction((MobileDriver) driver);

		  // Set touch action1 on given X Y Coordinates of screen.
		  TouchAction action1 = new TouchAction((MobileDriver) driver).longPress(x1, y1).waitAction(1500);
		  // Set touch action2 on given X Y Coordinates of screen.
		  TouchAction action2 = new TouchAction((MobileDriver) driver).longPress(x2, y2).waitAction(1500);
		  // Set touch action3 on given X Y Coordinates of screen.
		  TouchAction action3 = new TouchAction((MobileDriver) driver).longPress(x3, y3).waitAction(1500);
		  // Set touch action4 on given X Y Coordinates of screen.
		  TouchAction action4 = new TouchAction((MobileDriver) driver).longPress(x4, y4).waitAction(1500);
		  // Set touch action5 on given X Y Coordinates of screen.
		  TouchAction action5 = new TouchAction((MobileDriver) driver).longPress(x5, y5).waitAction(1500);

		  // Generate multi touch action chain using different actions and perform It.
		  maction.add(action1).add(action2).add(action3).add(action4).add(action5).perform();
		 /* 
		  MultiTouch Action Script Description
		  In above test you can see,
		  First of all we have collected X and Y coordinates(x1,y1, x2,y2, ..ect) for different touch point positions.
		  MultiTouchAction Is a class which provides us a facility to generate multi touch action chain using touch action chain.
		  We have created touch action chain for all 5 touch points using TouchAction class.
		  And then added all 5 touch actions In MultiTouchAction chain using .add(TouchAction action) method.
		  perform() action will perform steps given In MultiTouchAction chain.
		  Now you can run above test script In your android mobile device using appium and testng. It will launch MultiTouch Tester App In your android mobile device and then perform multitouch action.*/
		 }
	}

}
