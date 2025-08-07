package cHECKUP;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import checkupREPO.CheckupPage;
import checkupREPO.FullBodyCheckup;
import checkupREPO.FullBodyCheckupBoxPlans;
import checkupREPO.SearchAllCheckUpTests;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.pagefactory.AndroidBy;
import listner.UtilityClassObject;
import utility.AndroidUtility;
import utility.BaseClass;

@Listeners(listner.ListeneImp.class)
public class AddACheckupTest extends BaseClass {
	
	@Test
	public void addCheakup() throws MalformedURLException, InterruptedException {
		
		System.out.println("=============Script started=========================");
		
		// click checkup module
		UtilityClassObject.getTest().info("click on the checkp module");
		CheckupPage cp= new CheckupPage(driver);
		wait.until(ExpectedConditions.visibilityOf(cp.getCheckups()));
		cp.getCheckups().click();
		Thread.sleep(5000);
		
		UtilityClassObject.getTest().info("selecting full body checkup from popular checkups");
		// chechup box 
		cp.getFullbodyCheckupBox().click();
		
		Thread.sleep(5000);
		
		//
		
		UtilityClassObject.getTest().info("selecting one full body checkup essential from full body checkups of popular checkups");
		FullBodyCheckupBoxPlans fbcp= new FullBodyCheckupBoxPlans(driver);
		fbcp.getAddToCart_Essential().click();
		
		
		//verify toast message
		AndroidUtility autil= new AndroidUtility(driver);
		autil.toast();
		
		//verification of procede button
		UtilityClassObject.getTest().info("validating by checking Procede button");
		WebElement procede_btn = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"com.horcrux.svg.RectView\").instance(3)"));
		if(procede_btn.isDisplayed()) {
			System.out.println("checkup is added to the cart");
		}
	
	}

}
