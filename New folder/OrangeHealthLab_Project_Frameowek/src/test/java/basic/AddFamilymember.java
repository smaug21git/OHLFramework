package basic;

import org.testng.annotations.Test;

import objectRepo.Addfamilymember;
import objectRepo.HomePage;
import objectRepo.ProfilePage;
import utility.BaseClass;

public class AddFamilymember extends BaseClass {
	
	@Test
	public void addmember() {
		
		hp= new HomePage(driver);
		hp.getProfileBtn().click();
		
		mAc= new ProfilePage(driver);
		mAc.getAddBtn().click();
		aFMp= new Addfamilymember(driver);
		aFMp.getSelectmemberName().click();
		aFMp.getSibling().click();
		aFMp.getSelectmemberName().sendKeys("nami");
		aFMp.getDate().sendKeys("12");
		aFMp.getMonth().sendKeys("02");
		aFMp.getYear().sendKeys("1990");
		aFMp.getMobileno().sendKeys("9988667700");
		aFMp.getFemale().click();
		aFMp.getSavebtn().click();
		
		
		
		
	}

}
