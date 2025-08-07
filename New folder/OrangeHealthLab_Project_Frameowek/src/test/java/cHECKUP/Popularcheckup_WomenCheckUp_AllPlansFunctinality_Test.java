package cHECKUP;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import checkupREPO.CheckupPage;
import checkupREPO.WomenHealthCheckUpBoxAllPlans;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import utility.GestureUtility;

public class Popularcheckup_WomenCheckUp_AllPlansFunctinality_Test {
	
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
		
		//women health box
		WebElement WomenHealth = cp.getwomenhealthCheckupBox();
		wait.until(ExpectedConditions.visibilityOf(WomenHealth));
		
		WomenHealth.click();
		
		Thread.sleep(10000);
		
		//
		WomenHealthCheckUpBoxAllPlans WomenCP= new WomenHealthCheckUpBoxAllPlans(driver);
		
		if(WomenCP.getaddTocart_womenhealthcheckups_essential().isEnabled()) {
			System.out.println("women health addTocart==> enable");
		}
		
		if(WomenCP.getviewDetails_womenhealthcheckups_essential().isEnabled()) {
			System.out.println("women health view details is ==> enabled");
		}
		
		
		try {
			if(WomenCP.getAddTocart_PCODScreening_comprehensive().isDisplayed()) {
				System.out.println("addToCart is displayed");
			}
		} catch(Exception e) {
			
			GestureUtility gutil= new GestureUtility(driver);
			gutil.ScrollByText("Antenatal Checkup - Basic");
			
			if(WomenCP.getAddTocart_PCODScreening_comprehensive().isEnabled()) {
				System.out.println("PCODScreening comprehensive addToCart==> enable");
			}
		}
		
		
		

}
}
