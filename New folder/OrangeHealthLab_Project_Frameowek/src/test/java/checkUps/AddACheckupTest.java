package checkUps;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import checkupREPO.CheckupPage;
import checkupREPO.FullBodyCheckup;
import checkupREPO.FullBodyCheckupBoxPlans;
import checkupREPO.SearchAllCheckUpTests;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.pagefactory.AndroidBy;
import utility.AndroidUtility;

public class AddACheckupTest {
	
	@Test
	public void addCheakup() throws MalformedURLException, InterruptedException {
		
		System.out.println("=============Script started=========================");
		
		UiAutomator2Options op = new UiAutomator2Options();
		op.setPlatformName("android");
		op.setAutomationName("UiAutomator2");
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
		
		// click checkup module
		CheckupPage cp= new CheckupPage(driver);
		wait.until(ExpectedConditions.visibilityOf(cp.getCheckups()));
		cp.getCheckups().click();
		Thread.sleep(5000);
		// chechup box 
		cp.getFullbodyCheckupBox().click();
		
		Thread.sleep(5000);
		
		//
		FullBodyCheckupBoxPlans fbcp= new FullBodyCheckupBoxPlans(driver);
		fbcp.getAddToCart_Essential().click();
		
		
		//verify toast message
		AndroidUtility autil= new AndroidUtility(driver);
		autil.toast();
		
		//verify button text change after clicking
		
		
		
		
		
		
		
	
	}

}
