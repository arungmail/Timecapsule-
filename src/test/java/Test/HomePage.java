package Test;

import org.openqa.selenium.By;

import BasePackage.DriverClass;
import junit.framework.Assert;

public class HomePage extends DriverClass {
	
	Register reg = new Register ();
	
	public By CreateTab = By.name("Created");
	public By FilledTab	= By.name("Filled");
	public By Excavated = By.name("Filled");
	public By CreateAdd = By.id("com.nichi.artimecapsule:id/capsule_add");
	public By ReceiveButton = By.id("com.nichi.artimecapsule:id/authenticate_btn");
	public By TCButton = By.id("com.nichi.artimecapsule:id/fill_here_btn");
	public By PCButton = By.id("com.nichi.artimecapsule:id/fill_here_btn");
	public By NextButton = By.id("com.nichi.artimecapsule:id/next_btn");
	public By SelectCapsuolepageTitle  = By.id("com.nichi.artimecapsule:id/fill_selected");
	public By OccassionList = By.id("com.nichi.artimecapsule:id/occassion_list");
	public By Occasion = By.id("com.nichi.artimecapsule:id/layout");
	public By AllFillLocationsTable  = By.id("com.nichi.artimecapsule:id/fill_places_layout");
	public By EachLocations = By.id("com.nichi.artimecapsule:id/layout");
	public By SpainVillageNichiIN = By.xpath("//android.widget.RelativeLayout[@index='0']");
	public By SpainVillageNDR = By.xpath("//android.widget.RelativeLayout[@index='1']");
	public By HarukasNichi  = By.xpath("//android.widget.RelativeLayout[@index='2']");
	public By HarukasNDR = By.xpath("//android.widget.RelativeLayout[@index='3']");
	public By CompleteButtton = By.id("com.nichi.artimecapsule:id/lock_img");
	public By AddMessage = By.id("com.nichi.artimecapsule:id/message");
	public By CameraButton = By.id("com.nichi.artimecapsule:id/pick_img");
	public By TakePhoto = By.id("com.nichi.artimecapsule:id/take_photo");
	public By ShutterButtonOnCamera = By.id("com.android.gallery3d:id/shutter_button_photo");
	public By CameraDoneButton = By.id("com.android.gallery3d:id/btn_done");
	public By CapsuleTitle     = By.id("com.nichi.artimecapsule:id/occassion_title");
	public By ExcavtionDate   = By.id("com.nichi.artimecapsule:id/date");
	public By ExcavtionLocation = By.id("com.nichi.artimecapsule:id/share_txt");
	public By CapauleImage    = By.id("com.nichi.artimecapsule:id/capsule_img");
	public By CapsuleEdit   = By.id("com.nichi.artimecapsule:id/capsule_edit");
	public By capsuleDelete   = By.id("com.nichi.artimecapsule:id/capsule_delete");
	public By FillButton      = By.id("com.nichi.artimecapsule:id/fill_btn");
	public By GrooupAuthSend  = By.id("com.nichi.artimecapsule:id/icon_scan");
	public By GroupAuthQRCode     = By.id("com.nichi.artimecapsule:id/icon_display");  
	public By GroupNAmeEnter           = By.xpath("//android.widget.EditText[@index='0']");
	public By OKButton 					= By.name("OK");
	public By AuthenticationComplete   = By.id("com.nichi.artimecapsule:id/stop_scan");
	public By ValidationMessage   = By.id("android:id/message");
	public By YesDelete    = By.name("Yes");
	public By NoDelete    = By.name("No");
	
	
	
	
	public void clickOnNextButton (){
		driver.findElement(NextButton).click();
	}
	
	public void createTCCapsule () throws InterruptedException{
		driver.findElement(CreateAdd).click();
		
		driver.findElement(TCButton).click();
		clickOnNextButton();
		driver.findElement(Occasion).click();
		clickOnNextButton();
		driver.findElement(SpainVillageNDR).click();
		clickOnNextButton();
		driver.findElement(SpainVillageNDR);
		driver.findElement(By.name("13")).click();
		clickOnNextButton();
		driver.findElement(CameraButton).click();
		driver.findElement(TakePhoto).click();
		Thread.sleep(2000);
		driver.findElement(ShutterButtonOnCamera).click();
		driver.findElement(CameraDoneButton).click();
		driver.findElement(AddMessage).sendKeys("FirstAppiumTest");
		driver.findElement(CompleteButtton).click();	
	}
	
	public void checkExcavatioLocationIncreatedCapsule (){
		String excavaionLocation = driver.findElement(ExcavtionLocation).getText();
		String expectedLocation = "Excavation Location: Spain Village NDR";
		Assert.assertEquals(expectedLocation, excavaionLocation);
	}
	
	public void verifyExcavationDate (){
		String excavationDate = driver.findElement(ExcavtionDate).getText();
		String expectedDate = "(TC) Excavation Date 13-Aug-2017";
		Assert.assertEquals(expectedDate, excavationDate);
	}
	
	public void editExcavationLocationandDateandPlace () throws InterruptedException{
		driver.findElement(CapauleImage).click();
		driver.findElement(CapsuleEdit);
		clickOnNextButton();
		driver.findElement(Occasion).click();
		clickOnNextButton();
		driver.findElement(HarukasNDR).click();
		clickOnNextButton();
		driver.findElement(HarukasNDR);
		driver.findElement(By.name("14")).click();
		clickOnNextButton();
		driver.findElement(CameraButton).click();
		driver.findElement(TakePhoto).click();
		Thread.sleep(2000);
		driver.findElement(ShutterButtonOnCamera).click();
		driver.findElement(CameraDoneButton).click();
		driver.findElement(AddMessage).sendKeys("FirstAppiumTest");
		driver.findElement(CompleteButtton).click();	
		
	}
	
	public void checkExcavatioLocationIncreatedCapsuleafterEdit (){
		String excavaionLocation = driver.findElement(ExcavtionLocation).getText();
		String expectedLocation = "Excavation Location: Harukas NDR";
		Assert.assertEquals(expectedLocation, excavaionLocation);
	}
	
	public void verifyExcavationDateafterEdit (){
		String excavationDate = driver.findElement(ExcavtionDate).getText();
		String expectedDate = "(TC) Excavation Date 14-Aug-2017";
		Assert.assertEquals(expectedDate, excavationDate);
	}
	
	public void editToPCCapsule () throws InterruptedException{
		driver.findElement(CapauleImage).click();
		driver.findElement(CapsuleEdit);
		driver.findElement(PCButton).click();
		clickOnNextButton();
		driver.findElement(Occasion).click();
		clickOnNextButton();
		/*driver.findElement(HarukasNDR).click();
		clickOnNextButton();*/
		driver.findElement(HarukasNDR);
		driver.findElement(By.name("14")).click();
		clickOnNextButton();
		driver.findElement(CameraButton).click();
		driver.findElement(TakePhoto).click();
		Thread.sleep(2000);
		driver.findElement(ShutterButtonOnCamera).click();
		driver.findElement(CameraDoneButton).click();
		driver.findElement(AddMessage).sendKeys("FirstAppiumTest");
		driver.findElement(CompleteButtton).click();
	}
	
	public void verifyExcavationDateInPC (){
		String excavationDate = driver.findElement(ExcavtionDate).getText();
		String expectedDate = "(PC) Excavation Date 14-Aug-2017";
		Assert.assertEquals(expectedDate, excavationDate);
	}
	
	public void verifyDeleteCApsuleValidatioMessage (){
		driver.findElement(CapauleImage).click();
		driver.findElement(capsuleDelete).click();
		Assert.assertEquals("Are you sure you want to delete the Capsule?", reg.getValidationMessage());
	}
	
	public void verifyCapsuleExistByClickOnNo(){
		driver.findElement(NoDelete).click();
		boolean capsuleImeage = driver.findElement(CapauleImage).isDisplayed();
		Assert.assertEquals(true, capsuleImeage);
	}
	
	public void verfyCaosuleNotExistByClickOnYes (){
		driver.findElement(CapauleImage).click();
		driver.findElement(capsuleDelete).click();
		driver.findElement(YesDelete).click();
		Assert.assertEquals(false, driver.findElement(CapauleImage).isDisplayed());
	}
	
	public void createPCCapaule () throws InterruptedException{
        driver.findElement(CreateAdd).click();
		
		driver.findElement(PCButton).click();
		clickOnNextButton();
		driver.findElement(Occasion).click();
		clickOnNextButton();
		/*driver.findElement(SpainVillageNDR).click();
		clickOnNextButton();*/
		driver.findElement(SpainVillageNDR);
		driver.findElement(By.name("13")).click();
		clickOnNextButton();
		driver.findElement(CameraButton).click();
		driver.findElement(TakePhoto).click();
		Thread.sleep(2000);
		driver.findElement(ShutterButtonOnCamera).click();
		driver.findElement(CameraDoneButton).click();
		driver.findElement(AddMessage).sendKeys("FirstAppiumTest");
		driver.findElement(CompleteButtton).click();	
	}

	public void checkExcavatioLocationIncreatedPCCapsule (){
		String excavaionLocation = driver.findElement(ExcavtionLocation).getText();
		String expectedLocation = "Excavation Location: Spain Village NDR";
		Assert.assertEquals(expectedLocation, excavaionLocation);
	}
	
	public void verifyExcavationDateInPCCApaule (){
		String excavationDate = driver.findElement(ExcavtionDate).getText();
		String expectedDate = "(PC) Excavation Date 13-Aug-2017";
		Assert.assertEquals(expectedDate, excavationDate);
	}
	
	public void editExcavationLocationandDateandPlacePCCapsule () throws InterruptedException{
		driver.findElement(CapauleImage).click();
		driver.findElement(CapsuleEdit);
		clickOnNextButton();
		driver.findElement(Occasion).click();
		clickOnNextButton();
		/*driver.findElement(HarukasNDR).click();
		clickOnNextButton();*/
		driver.findElement(HarukasNDR);
		driver.findElement(By.name("14")).click();
		clickOnNextButton();
		driver.findElement(CameraButton).click();
		driver.findElement(TakePhoto).click();
		Thread.sleep(2000);
		driver.findElement(ShutterButtonOnCamera).click();
		driver.findElement(CameraDoneButton).click();
		driver.findElement(AddMessage).sendKeys("FirstAppiumTest");
		driver.findElement(CompleteButtton).click();	
		
	}
	public void checkExcavatioLocationIncreatedCapsuleafterEditPCCApaule (){
		String excavaionLocation = driver.findElement(ExcavtionLocation).getText();
		String expectedLocation = "Excavation Location: Harukas NDR";
		Assert.assertEquals(expectedLocation, excavaionLocation);
	}
	
	public void verifyExcavationDateafterEditPCCApaule (){
		String excavationDate = driver.findElement(ExcavtionDate).getText();
		String expectedDate = "(TC) Excavation Date 14-Aug-2017";
		Assert.assertEquals(expectedDate, excavationDate);
	}
	
	public void editPCCApauleToTC () throws InterruptedException{
		driver.findElement(CapauleImage).click();
		driver.findElement(CapsuleEdit);
		driver.findElement(PCButton).click();
		clickOnNextButton();
		driver.findElement(Occasion).click();
		clickOnNextButton();
		driver.findElement(HarukasNDR).click();
		clickOnNextButton();
		driver.findElement(HarukasNDR);
		driver.findElement(By.name("14")).click();
		clickOnNextButton();
		driver.findElement(CameraButton).click();
		driver.findElement(TakePhoto).click();
		Thread.sleep(2000);
		driver.findElement(ShutterButtonOnCamera).click();
		driver.findElement(CameraDoneButton).click();
		driver.findElement(AddMessage).sendKeys("FirstAppiumTest");
		driver.findElement(CompleteButtton).click();
	}
	
	public void verifyExcavationDateInTC (){
		String excavationDate = driver.findElement(ExcavtionDate).getText();
		String expectedDate = "(PC) Excavation Date 14-Aug-2017";
		Assert.assertEquals(expectedDate, excavationDate);
	}
	
	public void verifyDeleteCApsuleValidatioMessageTC (){
		driver.findElement(CapauleImage).click();
		driver.findElement(capsuleDelete).click();
		Assert.assertEquals("Are you sure you want to delete the Capsule?", reg.getValidationMessage());
	}
	
	public void verifyCapsuleExistByClickOnNo1(){
		driver.findElement(NoDelete).click();
		boolean capsuleImeage = driver.findElement(CapauleImage).isDisplayed();
		Assert.assertEquals(true, capsuleImeage);
	}
	
	public void verfyCaosuleNotExistByClickOnYes1 (){
		driver.findElement(CapauleImage).click();
		driver.findElement(capsuleDelete).click();
		driver.findElement(YesDelete).click();
		Assert.assertEquals(false, driver.findElement(CapauleImage).isDisplayed());
	}

}
