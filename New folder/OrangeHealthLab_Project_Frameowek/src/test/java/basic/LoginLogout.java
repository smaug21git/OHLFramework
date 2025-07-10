package basic;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import objectRepo.HomePage;
import objectRepo.MyAccountPage;
import objectRepo.SignUpPage;
import objectRepo.WelcomePage;
import utility.BaseClass;

public class LoginLogout extends BaseClass {
	
	@Test
	public void loginandlogout() throws InterruptedException {
		
//		 wp = new WelcomePage(driver);
//		wp.getLoginOrSignupBtn().click();
//		sp = new SignUpPage(driver);
//		
//		sp.getMobileNoTxtFieldBtn().sendKeys("7001244860");
//		sp.getContinueBtn().click();
		
		hp = new HomePage(driver);
		Thread.sleep(5000);
		hp.getProfileBtn().click();
		
		mAc = new MyAccountPage(driver);
		//driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Logout\"));")).click();
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))" + ".scrollIntoView(new UiSelector().text(\"Logout\"));")).click();
		
		//driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))" +".scrollTextIntoView(\"Logout\")")).click();
		mAc.getLogoutBtn().click();
	}

}
