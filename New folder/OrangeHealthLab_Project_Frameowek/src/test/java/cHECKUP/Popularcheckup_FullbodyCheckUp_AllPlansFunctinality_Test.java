package cHECKUP;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import checkupREPO.CheckupPage;
import checkupREPO.FullBodyCheckupBoxPlans;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import utility.GestureUtility;

public class Popularcheckup_FullbodyCheckUp_AllPlansFunctinality_Test {
	@Test
	public void AddtoCartFunctionalityTest() throws MalformedURLException, InterruptedException {
	
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
	
	//checkup module icon
	CheckupPage cp= new CheckupPage(driver);
	WebElement checkUpIcon = cp.getCheckups();
	wait.until(ExpectedConditions.visibilityOf(checkUpIcon));
	checkUpIcon.click();
	
	//popular checkup full body checkup
	WebElement fullBodycheckupbox = cp.getFullbodyCheckupBox();
	wait.until(ExpectedConditions.visibilityOf(fullBodycheckupbox));
	
	//full body checkup box
	cp.getFullbodyCheckupBox().click();
	
	// wait for full page to load
	//wait.until(ExpectedConditions.visibilityOf(driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Save up to Rs 5000 on taxes with health checkups under Section 80D\"]"))));
	Thread.sleep(10000);
	
	
	
	//checking ech test addtocart  button
	
	FullBodyCheckupBoxPlans fbPlans= new FullBodyCheckupBoxPlans(driver);
	
	//essentilas
	
	if(fbPlans.getAddToCart_Essential().isEnabled()) {
		System.out.println( "Essential checkup addtocart==>ENABLED");
		
	}
	
	if(fbPlans.getViewDetails_essentials().isEnabled()) {
		System.out.println("essential checkup view details==>ENABLED");
	}
	
	Thread.sleep(2000);
	
	try {
		if(fbPlans.getAddToCart_FullBodyBasic().isDisplayed()) {
			
			System.out.println("Full body basic checkup is displayed");
		}
	
	} catch(Exception e) {
		GestureUtility gutil= new GestureUtility(driver);
		gutil.ScrollByText("Children's Checkup - Essential for Kids");
		
		if(fbPlans.getAddToCart_FullBodyBasic().isEnabled()) {
			System.out.println(" full body basis addToCart==>ENABLED");
	}
	}
	
	/*if(fbPlans.getAddToCart().isEnabled()) {
		System.out.println(fbPlans.getAddToCart().getText()+"==>ENABLED");
	}
	
	
	
	if(fbPlans.getAddToCart_FullBodyBasic().isEnabled()) {
		System.out.println(fbPlans.getAddToCart_FullBodyBasic().getText()+"==>ENABLED");
	}
	
	if(fbPlans.getAddToCart_FullBodyComprehensive().isEnabled()) {
		System.out.println(fbPlans.getAddToCart_FullBodyComprehensive().getText()+"==>ENABLED");
	}
	
	
	
	if(fbPlans.getAddToCart_Ultra_Full_Body_Checkup_Female().isEnabled()) {
		System.out.println(fbPlans.getAddToCart_Ultra_Full_Body_Checkup_Female().getText()+"==>ENABLED");
	}
	
	if(fbPlans.getAddToCart_Ultra_Full_Body_Checkup_Male().isEnabled()) {
		System.out.println(fbPlans.getAddToCart_Ultra_Full_Body_Checkup_Male().getText()+"==>ENABLED");
	} */
	
	//checking each details button
	
	
	
	
	/* if(fbPlans.getViewDetails().isEnabled()) {
		System.out.println(fbPlans.getViewDetails().getText()+"==>ENABLED");
	}
	
	
	
	if(fbPlans.getViewDetails_FullBodybasic().isEnabled()) {
		System.out.println(fbPlans.getViewDetails_FullBodybasic().getText()+"==>ENABLED");
	}
	
	if(fbPlans.getViewDetails_FullBodyComprehensive().isEnabled()) {
		System.out.println(fbPlans.getViewDetails_FullBodyComprehensive().getText()+"==>ENABLED");
	}
	
	if(fbPlans.getViewDetails_kidsCheckup().isEnabled()) {
		System.out.println(fbPlans.getViewDetails_kidsCheckup().getText()+"==>ENABLED");
	}
	
	if(fbPlans.getViewDetails_Ultra_Full_Body_Checkup_Female().isEnabled()) {
		System.out.println(fbPlans.getViewDetails_Ultra_Full_Body_Checkup_Female().getText()+"==>ENABLED");
	}
	
	if(fbPlans.getViewDetails_Ultra_Full_Body_Checkup_Male().isEnabled()) {
		System.out.println(fbPlans.getViewDetails_Ultra_Full_Body_Checkup_Male().getText()+"==>ENABLED");
	} */
	
	
	
	
	

}
	}

