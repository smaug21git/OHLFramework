package myProfile;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import objectRepo.HomePage;
import objectRepo.ProfilePage;
import utility.GestureUtility;

public class DeleteAprofile {
	
	@Test
	public void deleteProfile() throws MalformedURLException, InterruptedException {
		
		UiAutomator2Options op = new UiAutomator2Options();
		op.setPlatformName("android");
		op.setDeviceName("Galaxy A04");
		op.setUdid("R9ZW1065M9V");
		op.setIgnoreHiddenApiPolicyError(true);
		op.setAutoGrantPermissions(true);
		op.setNoReset(true);
		URL u = new URL("http://localhost:4723");
		AndroidDriver driver = new AndroidDriver(u, op);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		driver.activateApp("in.orangehealth.patient");
		HomePage hp = new HomePage(driver);

		// profilebutton
		WebElement profilebtn = hp.getProfileBtn();
		wait.until(ExpectedConditions.visibilityOf(profilebtn));
		profilebtn.click();

//		ProfilePage p = new ProfilePage(driver);
//		// p.getKebabBtn().click();
//		Thread.sleep(3000);
//		GestureUtility gutil = new GestureUtility(driver);
//		gutil.clickByCoordinate(666, 534);
//		Thread.sleep(3000);
//		
//		// delete button
//		//p.getDeleteProfile().click();
//		gutil.clickByCoordinate(525, 733);
//		
//		Thread.sleep(3000);
//		
//		// select a profile
//		gutil.clickByCoordinate(299,1084);
//		
//		Thread.sleep(3000);
//		
//		// delete button
//		gutil.clickByCoordinate(452,1441);
//		
		List<WebElement> names = driver.findElements(AppiumBy.xpath("[//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.ScrollView/android.view.ViewGroup]/android.view.ViewGroup"));
		System.out.println(names.size());
		
	}

}
