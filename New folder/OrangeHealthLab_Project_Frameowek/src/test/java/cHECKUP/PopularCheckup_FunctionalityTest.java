package cHECKUP;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import checkupREPO.CheckupPage;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class PopularCheckup_FunctionalityTest {
	
	@Test
	public void AddToCartButtonTest() throws MalformedURLException, InterruptedException {
		UiAutomator2Options opt= new UiAutomator2Options();
		opt.setPlatformName("android");
		opt.setDeviceName("Galaxy A04");
		opt.setUdid("R9ZW1065M9V");
		opt.setIgnoreHiddenApiPolicyError(true);
		opt.setNoReset(true);
		opt.setAutoGrantPermissions(true);
		
		AndroidDriver driver= new AndroidDriver(new URL("http://127.0.0.1:4723"),opt);
		driver.activateApp("in.orangehealth.patient");
		
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
		
		//click on chechup module
		CheckupPage cp= new CheckupPage(driver);
		WebElement checkupModuleIcon = cp.getCheckups();
		wait.until(ExpectedConditions.visibilityOf(checkupModuleIcon));
		checkupModuleIcon.click();
		
		Thread.sleep(5000);
		
		//full body checkup
		if(cp.getFullbodyCheckupBox().isEnabled()) {
			System.out.println("full body checkup is enabled");
		}
		
		//sexual checkup
		if(cp.getsexualhealthCheckupBox().isEnabled()) {
			System.out.println("sexual checkup is enabled");
			
		}
		
		//women healths
		if(cp.getwomenhealthCheckupBox().isEnabled()) {
			System.out.println("women health checkup is enabled");
			
		}
		
		// allergy checkup
		if(cp.getAllergyCheckupBox().isEnabled()) {
			System.out.println("allergy checkup is enabled");
			
		}
		
		
		
		
		
		
		
	}

}
