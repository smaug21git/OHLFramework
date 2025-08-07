package checkUps;

import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import checkupREPO.CheckupPage;
import checkupREPO.FullBodyCheckupBoxPlans;
import checkupREPO.FullBodyCheckupDescriptionPage;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class ProductDetails {
	
	@Test
	public void productDetails() throws MalformedURLException, InterruptedException {
		
		System.out.println("=============Script started=========================");
		
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
		
		// click checkup module in homepage
				CheckupPage cp= new CheckupPage(driver);
				wait.until(ExpectedConditions.visibilityOf(cp.getCheckups()));
				cp.getCheckups().click();
				
				//full body chechup box
				
				cp.getFullbodyCheckupBox().click();
				
				//full body checkupbox  advance plans
				
				FullBodyCheckupBoxPlans fbC= new FullBodyCheckupBoxPlans(driver);
				String original_CheckUp_price = fbC.getOriginalprice().getText();
				String discounted_CheckUp_price = fbC.getAfterDiscountprice().getText();
				String discount_on_checkup = fbC.getDiscount().getText();
				
				
				System.out.println(original_CheckUp_price);
				System.out.println(discounted_CheckUp_price);
				System.out.println(discount_on_checkup);
				
				
				fbC.getViewDetails().click();
				
				Thread.sleep(3000);
				
				// full body checkup description page
				FullBodyCheckupDescriptionPage fbcd= new FullBodyCheckupDescriptionPage(driver);
				
				String expected_checkup_name = fbcd.getNameOftheChechup().getText();
				String expected_discount = fbcd.getExpectedDiscount().getText();
				String expected_discount_price = fbcd.getExpectedDiscountprice().getText();
				String expected_actual_price = fbcd.getExpectedActualprice().getText();
				String actual_checkup_name=fbcd.getNameOftheChechup().getText();
				
				//assertions
				
				
				SoftAssert sassert= new SoftAssert();
				sassert.assertEquals(original_CheckUp_price, expected_actual_price,"NOT Matching");
				sassert.assertEquals(discounted_CheckUp_price, expected_discount_price,"NOT Matching");
				sassert.assertEquals(discount_on_checkup, expected_discount,"NOT Matching");
				sassert.assertEquals(actual_checkup_name, expected_checkup_name,"NOT Matching");
				
				System.out.println("all test details are matched");
				
				driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(text(\"About The Test\"));"));
				Thread.sleep(3000);
				
				fbcd.getAboutThisTestShowMore().click();
				
				
				
				
				
				
	}

}
