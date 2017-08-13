package BasePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;

public class Utility extends DriverClass{
	

	
	public Dimension size;

	public void multTouchAction ()  throws InterruptedException {
	
		  
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
	
	public void dragFileAndDrop (){
		driver.findElementByName("Basic usage playground").click();

		  //Locate 3rd element(Chick Corea) from list to drag.
		  WebElement ele1 = (WebElement) driver.findElementsById("com.mobeta.android.demodslv:id/drag_handle").get(2);
		  //Locate 6th element to drop dragged element.
		  WebElement ele2 = (WebElement) driver.findElementsById("com.mobeta.android.demodslv:id/drag_handle").get(5);

		  //Perform drag and drop operation using TouchAction class.
		  //Created object of TouchAction class.
		  TouchAction action = new TouchAction((MobileDriver) driver);
		  
		  System.out.println("It Is dragging element.");
		  //It will hold tap on 3rd element and move to 6th position and then release tap.
		  action.longPress(ele1).moveTo(ele2).release().perform();  
		  System.out.println("Element has been droped at destination successfully.");
	}
	
		public void horiondalSwipe () throws InterruptedException{
			size = driver.manage().window().getSize();
			  System.out.println(size);
			  
			  //Find swipe start and end point from screen's with and height.
			  //Find startx point which is at right side of screen.
			  int startx = (int) (size.width * 0.70);
			  //Find endx point which is at left side of screen.
			  int endx = (int) (size.width * 0.30);
			  //Find vertical point where you wants to swipe. It is in middle of screen height.
			  int starty = size.height / 2;
			  System.out.println("startx = " + startx + " ,endx = " + endx + " , starty = " + starty);

			  //Swipe from Right to Left.
			  driver.swipe(startx, starty, endx, starty, 3000);
			  Thread.sleep(2000);

			  //Swipe from Left to Right.
			  driver.swipe(endx, starty, startx, starty, 3000);
			  Thread.sleep(2000);
			 }

		public void verticalSwipe () throws InterruptedException{
			size = driver.manage().window().getSize();
			  System.out.println(size);
			   
			  //Find swipe start and end point from screen's with and height.
			  //Find starty point which is at bottom side of screen.
			  int starty = (int) (size.height * 0.80);
			  //Find endy point which is at top side of screen.
			  int endy = (int) (size.height * 0.20);
			  //Find horizontal point where you wants to swipe. It is in middle of screen width.
			  int startx = size.width / 2;
			  System.out.println("starty = " + starty + " ,endy = " + endy + " , startx = " + startx);

			  //Swipe from Bottom to Top.
			  driver.swipe(startx, starty, startx, endy, 3000);
			  Thread.sleep(2000);
			  //Swipe from Top to Bottom.
			  driver.swipe(startx, endy, startx, starty, 3000);
			  Thread.sleep(2000);
		}

		public void scrolDwonpageAndClick(){
			//Scroll till element which contains "Views" text If It Is not visible on screen.
			  driver.scrollTo("Views");
			  // Click on Views/.
			  driver.findElement(By.name("Views")).click();
			  System.out.println("Scrolling has been started to find text -> Tabs.");
			  // Scroll till element which contains Tabs text.
			  driver.scrollTo("Tabs");
			  System.out.println("Tabs text has been found and now clicking on It.");
			  // Click on Tabs.
			  driver.findElement(By.name("Tabs")).click();
		}
		
		
}
