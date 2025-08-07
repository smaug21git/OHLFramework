package tests;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import listner.UtilityClassObject;
import utility.GestureUtility;

public class Addatest {
	
	@Test
	public void addTest() throws MalformedURLException {
		System.out.println("===========Started the script===========");
		
		UtilityClassObject.getTest().log(Status.INFO, "configuring device");

		
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
		
		UtilityClassObject.getTest().log(Status.INFO, "launching the application");

		driver.activateApp("in.orangehealth.patient");
		
		//testicon
		
		UtilityClassObject.getTest().log(Status.INFO, "click on test");

		WebElement testIcons = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Tests\"]"));
		wait.until(ExpectedConditions.visibilityOf(testIcons));
		testIcons.click();
		
		UtilityClassObject.getTest().log(Status.INFO, "swiping to element");
		
		GestureUtility gutil= new GestureUtility(driver);
		//gutil.ScrollByText("Tests for Health Conditions");
		gutil.SwipeByElement(testIcons, "up", 1.0);
		
	}

}
