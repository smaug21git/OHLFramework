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

public class MargeProfile {

	@Test
	public void margeProfile() throws MalformedURLException, InterruptedException {

		System.out.println("===========Started the script===========");

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
		
		List<WebElement> allProfile = driver.findElements(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup"));
		
		System.out.println(allProfile.size());

		for(int i=0;i<allProfile.size();i++) {
			
			allProfile.get(1).click();
		}
		
		driver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"delete-account-heading\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"delete-your-account-1\"]")).click(); 
		

		ProfilePage p = new ProfilePage(driver);
		// p.getKebabBtn().click();
		Thread.sleep(3000);
		GestureUtility gutil = new GestureUtility(driver);
		gutil.clickByCoordinate(666, 534);
		Thread.sleep(3000);
		
		
		// p.getMargeProfile().click();
		gutil.clickByCoordinate(507, 647);

		// String name="Sanji";
		Thread.sleep(3000);

		driver.findElement(AppiumBy.xpath("(//android.widget.TextView[@text=\"Sanji\"])[1]")).click();

		Thread.sleep(2000);
		// driver.findElement(AppiumBy.xpath("(//android.widget.TextView[@text=\"Sanji\"])[2]")).click();
		gutil.clickByCoordinate(275, 1136);
		Thread.sleep(3000);
		//marge profile
		gutil.clickByCoordinate(458, 1441);
		// profile 1
		Thread.sleep(3000);
		gutil.clickByCoordinate(299, 855);
		Thread.sleep(3000);
		// confirm
		gutil.clickByCoordinate(476, 1002);

	}

}
