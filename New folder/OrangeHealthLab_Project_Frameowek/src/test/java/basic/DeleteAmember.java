package basic;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import objectRepo.HomePage;
import objectRepo.MyAccountPage;
import utility.BaseClass;

public class DeleteAmember extends BaseClass {
	
	@Test
	public void delemember() {
		
		hp= new HomePage(driver);
		hp.getProfileBtn().click();
		
		mAc= new MyAccountPage(driver);
		
		driver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Zoro, 35 | F | Spouse\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"delete-btn\"]")).click();
	}

}
