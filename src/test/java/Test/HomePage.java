package Test;

import org.openqa.selenium.By;

import BasePackage.DriverClass;

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
	
	
	
	
	
	
	
	


}
