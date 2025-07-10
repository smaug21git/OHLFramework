package basic;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import objectRepo.HomePage;
import objectRepo.MyAccountPage;
import objectRepo.SignUpPage;
import objectRepo.WelcomePage;
import utility.BaseClass;
import utility.GestureUtility;

public class deletingSavedAddress extends BaseClass {

	@Test
	public  void launchApplication() throws InterruptedException {

		System.out.println("==================== script exexution started ==============");
		
		/* wp = new WelcomePage(driver);
		wp.getLoginOrSignupBtn().click();
		sp = new SignUpPage(driver);
		
		sp.getMobileNoTxtFieldBtn().sendKeys("7001244860");
		sp.getContinueBtn().click();
	*/
		
		hp= new HomePage(driver);
		hp.getProfileBtn().click();
		mAc= new MyAccountPage(driver);
		mAc.getSavedAddressBtn().click();
		driver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"delete-address\"]/android.widget.ImageView")).click();
		Thread.sleep(3000);
		driver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"yes-action-btn\"]")).click();

	}

}
