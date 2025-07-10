package myProfile;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import objectRepo.HomePage;
import objectRepo.ProfilePage;
import utility.BaseClass;
import utility.GestureUtility;

public class logoutOfApplication {
	
	@Test
	public void basic() throws MalformedURLException, InterruptedException {
		
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
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
		driver.activateApp("in.orangehealth.patient");
		HomePage hp= new HomePage(driver);
		
		//profilebutton
		WebElement profilebtn = hp.getProfileBtn();
		wait.until(ExpectedConditions.visibilityOf(profilebtn));
		profilebtn.click();
		
		//logout button
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))" + ".scrollIntoView(new UiSelector().text(\"Logout\"));")).click();
		
		//logout pop-up btn
		Thread.sleep(3000);
		GestureUtility gutil= new GestureUtility(driver);
		gutil.clickByCoordinate(492, 818);
		
	}

}
