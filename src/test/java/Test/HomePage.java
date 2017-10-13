package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import BasePackage.DriverClass;
import junit.framework.Assert;

public class HomePage extends DriverClass {
	
	Register reg = new Register ();
	
	public By CreateTab = By.name("Created");
	public By FilledTab	= By.name("Filled");
	public By Excavated = By.name("Filled");
	public By CreateAdd = By.id("com.nichi.artimecapsule:id/capsule_add");
	public By ReceiveButton = By.id("com.nichi.artimecapsule:id/authenticate_btn");
	public By TCButton = By.name("Time Capsule");
	public By PCButton = By.name("Present Capsule");
	public By CapsuleTypePageHeading = By.name("com.nichi.artimecapsule:id/fill_selected");
	public By NextButton = By.id("com.nichi.artimecapsule:id/next_btn");
	//public By SelectCapsuolepageTitle  = By.id("com.nichi.artimecapsule:id/fill_selected");
	public By OccassionList = By.id("com.nichi.artimecapsule:id/occassion_list");
	public By Occasion = By.id("com.nichi.artimecapsule:id/layout");
	public By OccassionpageTitle = By.id("com.nichi.artimecapsule:id/select_icon");
	public By AllFillLocationsTable  = By.id("com.nichi.artimecapsule:id/fill_places_layout");
	public By EachLocations = By.id("com.nichi.artimecapsule:id/grid_image");
	//public By SpainVillageNichiIN = By.xpath("//android.widget.RelativeLayout[@index='0']");
	//public By SpainVillage = By.xpath("//android.widget.ImageView[@index='1']");
	//public By Harukas  = By.xpath("//android.widget.ImageView[@index='0']");
	//public By HarukasNDR = By.xpath("//android.widget.RelativeLayout[@index='3']");
	public By CompleteButtton = By.id("com.nichi.artimecapsule:id/lock_img");
	public By AddMessage = By.id("com.nichi.artimecapsule:id/message");
	public By CameraButton = By.id("com.nichi.artimecapsule:id/pick_img");
	public By TakePhoto = By.id("com.nichi.artimecapsule:id/take_photo");
	public By ShutterButtonOnCamera = By.id("com.android.camera2:id/photo_video_button");
	public By CameraDoneButton = By.id("com.android.camera2:id/done_button");
	public By CapsuleTitle     = By.id("com.nichi.artimecapsule:id/occassion_title");
	public By ExcavtionDate   = By.id("com.nichi.artimecapsule:id/date");
	public By ExcavtionLocation = By.id("com.nichi.artimecapsule:id/share_txt");
	public By CapauleImage    = By.id("com.nichi.artimecapsule:id/lock_img");
	public By CapsuleEdit   = By.name("Edit");
	public By capsuleDelete   = By.name("Delete");
	public By FillButton      = By.name("Fill");
	public By LeaderSelect    = By.id("com.nichi.artimecapsule:id/one_person_layout");
	public By MembersSelect   = By.id("com.nichi.artimecapsule:id/other_person_layout");
	public By GroupName       = By.className("android.widget.EditText");
	public By AuthenticationCompleteButton  = By.id("com.nichi.artimecapsule:id/stop_scan");
	public By ConfirmButton   = By.id("com.nichi.artimecapsule:id/selectpeople_btn");
	public By GrooupAuthSend  = By.id("com.nichi.artimecapsule:id/icon_scan");
	public By GroupAuthQRCode     = By.id("com.nichi.artimecapsule:id/icon_display");  
	public By GroupNAmeEnter           = By.xpath("//android.widget.EditText[@index='0']");
	public By OKButton 					= By.name("OK");
	public By AuthenticationComplete   = By.id("com.nichi.artimecapsule:id/stop_scan");
	public By ValidationMessage   = By.id("android:id/message");
	public By CapsuleSelection   = By.id("com.nichi.artimecapsule:id/lock_img");
	public By YesDelete    = By.name("Yes");
	public By NoDelete    = By.name("No");
	
	
	String groupTitle = "xxxx";
	String tcExcavationDate = "(TC) Excavation Date: 23-Oct-2017";
	String pcExcavationDate = "(PC) Excavation Date: 23-Oct-2017";
	String excavationLocationSpainVillage = "Excavation Location: Spain Village";
	String excavationLocationHarukas   = "Excavation Location: Harukas";
	
	public void clickOnDate (){
		driver.findElement(By.name("23")).click();
	}
	
	public void selectFillOrExcavationLocations (int no){
		WebElement locations = driver.findElement(AllFillLocationsTable);
		List <WebElement> eachlocations = locations.findElements(EachLocations);
		for (WebElement location : eachlocations){
			eachlocations.get(no).click();
		}
	}
	
	//get Text of alertmessage 
	public String getAlertMessageText (){
		return driver.findElement(By.id("com.nichi.artimecapsule:id/alert_body")).getText();
	}
	
	//Click on Ok Buttion 
	public void clickOnOKOnAlertmessage (){
		driver.findElement(By.id("com.nichi.artimecapsule:id/alert_ok")).click();
	}
	
	public void clickOnNextButton (){
		driver.findElement(NextButton).click();
	}
	public String getConfirmationMessage (){
		String confirmationmesssage = driver.findElement(By.id("android:id/message")).getText();
		return confirmationmesssage;
	}
	
	
	@Test(priority=1)
	public void createTCCapsule () throws InterruptedException{
		driver.findElement(CreateAdd).click();
		driver.findElement(TCButton).click();
		clickOnNextButton();
		driver.findElement(Occasion).click();
		clickOnNextButton();
		selectFillOrExcavationLocations(0);
		clickOnNextButton();
		selectFillOrExcavationLocations(0);
		clickOnNextButton();
		clickOnDate ();
		clickOnNextButton();
		driver.findElement(CameraButton).click();
		driver.findElement(TakePhoto).click();
		Thread.sleep(2000);
		driver.findElement(ShutterButtonOnCamera).click();
		driver.findElement(CameraDoneButton).click();
		driver.findElement(AddMessage).sendKeys("FirstAppiumTest");
		driver.navigate().back();
		driver.findElement(CompleteButtton).click();	
	}
	
	@Test(priority=2)
	public void checkExcavatioLocationIncreatedCapsule (){
		String excavaionLocation = driver.findElement(ExcavtionLocation).getText();
		String expectedLocation = excavationLocationHarukas;
		Assert.assertEquals(expectedLocation, excavaionLocation);
	}
	@Test(priority=3)
	public void verifyExcavationDate(){
		String excavationDate = driver.findElement(ExcavtionDate).getText();
		String expectedDate = tcExcavationDate;
		Assert.assertEquals(expectedDate, excavationDate);
	}
	
	@Test(priority=4)
	public void editExcavationLocationandDateandPlace () throws InterruptedException{
		driver.findElement(CapauleImage).click();
		driver.findElement(CapsuleEdit).click();
		clickOnNextButton();
		driver.findElement(Occasion).click();
		clickOnNextButton();
		selectFillOrExcavationLocations(1);
		clickOnNextButton();
		selectFillOrExcavationLocations(1);
		clickOnNextButton();
		clickOnDate ();
		clickOnNextButton();
		/*driver.findElement(CameraButton).click();
		driver.findElement(TakePhoto).click();
		Thread.sleep(2000);
		driver.findElement(ShutterButtonOnCamera).click();
		driver.findElement(CameraDoneButton).click();
		driver.findElement(AddMessage).clear();
		driver.findElement(AddMessage).sendKeys("FirstAppiumTest");*/
		driver.findElement(CompleteButtton).click();	
		
	}
	
	@Test(priority=5)
	public void checkExcavatioLocationIncreatedCapsuleafterEdit (){
		String excavaionLocation = driver.findElement(ExcavtionLocation).getText();
		String expectedLocation = excavationLocationSpainVillage;
		Assert.assertEquals(expectedLocation, excavaionLocation);
	}
	
	@Test(priority=6)
	public void verifyExcavationDateafterEdit (){
		String excavationDate = driver.findElement(ExcavtionDate).getText();
		String expectedDate = tcExcavationDate;
		Assert.assertEquals(expectedDate, excavationDate);
	}
	
	@Test(priority=7)
	public void editToPCCapsule () throws InterruptedException{
		Thread.sleep(500);
		driver.findElement(CapauleImage).click();
		driver.findElement(CapsuleEdit).click();
		driver.findElement(PCButton).click();
		clickOnNextButton();
		driver.findElement(Occasion).click();
		clickOnNextButton();
		/*driver.findElement(HarukasNDR).click();
		clickOnNextButton();*/
		selectFillOrExcavationLocations(0);
		clickOnNextButton();
		clickOnDate ();
		clickOnNextButton();
		/*driver.findElement(CameraButton).click();
		driver.findElement(TakePhoto).click();
		Thread.sleep(2000);
		driver.findElement(ShutterButtonOnCamera).click();
		driver.findElement(CameraDoneButton).click();
		driver.findElement(AddMessage).clear();
		driver.findElement(AddMessage).sendKeys("FirstAppiumTest");
		//driver.navigate().back();
*/		driver.findElement(CompleteButtton).click();
	}
	
	@Test(priority=8)
	public void verifyExcavationDateInPC (){
		String excavationDate = driver.findElement(ExcavtionDate).getText();
		String expectedDate = pcExcavationDate;
		Assert.assertEquals(expectedDate, excavationDate);
	}
	
	@Test(priority=9)
	public void verifyDeleteCApsuleValidatioMessage (){
		driver.findElement(CapauleImage).click();
		driver.findElement(capsuleDelete).click();
		Assert.assertEquals("Are you sure you want to delete the Capsule?",getConfirmationMessage());
		driver.findElement(NoDelete).click();
	}
	
	@Test(priority=10)
	public void verifyCapsuleExistByClickOnNo(){
		boolean capsuleImeage = driver.findElement(CapauleImage).isDisplayed();
		Assert.assertEquals(true, capsuleImeage);
	}
	
	@Test(priority=11)
	public void verfyCaosuleNotExistByClickOnYes () throws InterruptedException{
		driver.findElement(CapauleImage).click();
		driver.findElement(CapauleImage).click();
		driver.findElement(capsuleDelete).click();
		driver.findElement(YesDelete).click();
		Thread.sleep(500);
		 boolean capsule = driver.findElement(CapauleImage) == null;
		Assert.assertEquals(capsule, true);
		
	}
	
	@Test(priority=12)
	public void createPCCapaule () throws InterruptedException{
        driver.findElement(CreateAdd).click();
		driver.findElement(PCButton).click();
		clickOnNextButton();
		driver.findElement(Occasion).click();
		clickOnNextButton();
		/*driver.findElement(SpainVillageNDR).click();
		clickOnNextButton();*/
		selectFillOrExcavationLocations(0);
		clickOnNextButton();
		clickOnDate ();
		clickOnNextButton();
		driver.findElement(CameraButton).click();
		driver.findElement(TakePhoto).click();
		Thread.sleep(2000);
		driver.findElement(ShutterButtonOnCamera).click();
		driver.findElement(CameraDoneButton).click();
		driver.findElement(AddMessage).clear();
		driver.findElement(AddMessage).sendKeys("FirstAppiumTest");
		driver.navigate().back();
		driver.findElement(CompleteButtton).click();	
	}
	
	@Test(priority=13)
	public void checkExcavatioLocationIncreatedPCCapsule (){
		String excavaionLocation = driver.findElement(ExcavtionLocation).getText();
		String expectedLocation = excavationLocationHarukas;
		Assert.assertEquals(expectedLocation, excavaionLocation);
	}
	
	@Test(priority=14)
	public void verifyExcavationDateInPCCApaule (){
		String excavationDate = driver.findElement(ExcavtionDate).getText();
		String expectedDate = pcExcavationDate;
		Assert.assertEquals(expectedDate, excavationDate);
	}
	
	@Test(priority=15)
	public void editExcavationLocationandDateandPlacePCCapsule () throws InterruptedException{
		driver.findElement(CapauleImage).click();
		driver.findElement(CapsuleEdit).click();
		clickOnNextButton();
		driver.findElement(Occasion).click();
		clickOnNextButton();
		/*driver.findElement(HarukasNDR).click();
		clickOnNextButton();*/
		selectFillOrExcavationLocations(1);
		clickOnNextButton();
		clickOnDate ();
		clickOnNextButton();
		/*driver.findElement(CameraButton).click();
		driver.findElement(TakePhoto).click();
		Thread.sleep(2000);
		driver.findElement(ShutterButtonOnCamera).click();
		driver.findElement(CameraDoneButton).click();
		driver.findElement(AddMessage).clear();
		driver.findElement(AddMessage).sendKeys("FirstAppiumTest");*/
		driver.findElement(CompleteButtton).click();	
		
	}
	@Test(priority=16)
	public void checkExcavatioLocationIncreatedCapsuleafterEditPCCApaule (){
		String excavaionLocation = driver.findElement(ExcavtionLocation).getText();
		String expectedLocation = excavationLocationSpainVillage;
		Assert.assertEquals(expectedLocation, excavaionLocation);
	}
	
	@Test(priority=17)
	public void verifyExcavationDateafterEditPCCApaule (){
		String excavationDate = driver.findElement(ExcavtionDate).getText();
		String expectedDate = pcExcavationDate;
		Assert.assertEquals(expectedDate, excavationDate);
	}
	
	@Test(priority=18)
	public void editPCCApauleToTC () throws InterruptedException{
		driver.findElement(CapauleImage).click();
		driver.findElement(CapsuleEdit).click();
		driver.findElement(TCButton).click();
		clickOnNextButton();
		driver.findElement(Occasion).click();
		clickOnNextButton();
		selectFillOrExcavationLocations(0);
		clickOnNextButton();
		selectFillOrExcavationLocations(0);
		clickOnNextButton();
		clickOnDate ();
		clickOnNextButton();
		/*driver.findElement(CameraButton).click();
		driver.findElement(TakePhoto).click();
		Thread.sleep(2000);
		driver.findElement(ShutterButtonOnCamera).click();
		driver.findElement(CameraDoneButton).click();
		driver.findElement(AddMessage).clear();
		driver.findElement(AddMessage).sendKeys("FirstAppiumTest");*/
		driver.findElement(CompleteButtton).click();
	}
	
	@Test(priority=19)
	public void verifyExcavationDateInTC (){
		String excavationDate = driver.findElement(ExcavtionDate).getText();
		String expectedDate = tcExcavationDate;
		Assert.assertEquals(expectedDate, excavationDate);
	}
	
	@Test(priority=20)
	public void verifyDeleteCApsuleValidatioMessageTC (){
		driver.findElement(CapauleImage).click();
		driver.findElement(capsuleDelete).click();
		Assert.assertEquals("Are you sure you want to delete the Capsule?",getConfirmationMessage());
	}
	
	@Test(priority=21)
	public void verifyCapsuleExistByClickOnNo1(){
		driver.findElement(NoDelete).click();
		boolean capsuleImeage = driver.findElement(CapauleImage).isDisplayed();
		Assert.assertEquals(true, capsuleImeage);
	}
	
	@Test(priority=22)
	public void verfyCaosuleNotExistByClickOnYes1 (){
		driver.findElement(CapauleImage).click();
		driver.findElement(CapauleImage).click();
		driver.findElement(capsuleDelete).click();
		driver.findElement(YesDelete).click();
		boolean capsule = driver.findElement(CapauleImage) == null;
		Assert.assertEquals(capsule, true);
		
	}
	
	@Test(priority=23)
	public void verifyCapsuleTypevalidationError (){
		driver.findElement(CreateAdd).click();
		clickOnNextButton();
		Assert.assertEquals(getAlertMessageText(), "Please select capsule type.");
		reg.clickOnOKButton();
	}
	
	@Test(priority=24)
	public void verifySelectIconValidationErrorMessage (){
		driver.findElement(TCButton).click();
		clickOnNextButton();
		//reg.clickOnOKButton();
		clickOnNextButton();
		Assert.assertEquals(getAlertMessageText(), "Please select icon.");	
		reg.clickOnOKButton();
	}
	@Test(priority=25)
	public void verifyFillLocationValidationError (){
		driver.findElement(Occasion).click();
		clickOnNextButton();
		clickOnNextButton();
		Assert.assertEquals(getAlertMessageText(), "Please select filling location.");
		reg.clickOnOKButton();
	}
	
	@Test(priority=26)
	public void verifyExcavationLocationvalidationError () throws InterruptedException{
		selectFillOrExcavationLocations(0);
		clickOnNextButton();
		Thread.sleep(500);
		clickOnNextButton();
		Assert.assertEquals(getAlertMessageText(), "Please select excavation location.");
		reg.clickOnOKButton();
	}
	
	
	@Test(priority=27)
	public void verifyUploadImagevalidationError () throws InterruptedException{
		selectFillOrExcavationLocations(0);
		clickOnNextButton();
		clickOnDate ();
		clickOnNextButton();
		Thread.sleep(500);
		clickOnNextButton();
		Assert.assertEquals(getAlertMessageText(),"Please select the Greeting card." );	
	}

	

}
