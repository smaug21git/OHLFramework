package basic;

import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import objectRepo.HomePage;
import objectRepo.TestsPage;
import utility.BaseClass;

public class AddTests extends BaseClass {
	
	@Test
	public  void addATest() throws MalformedURLException, InterruptedException {
		
		
		System.out.println("============================================STARTING EXECUTING=====================================");
		
		Thread.sleep(5000);
	    hp= new HomePage(driver);
		hp.getTestBtn().click();
		tp= new TestsPage(driver);
		tp.getCBC_AddToCartBtn().click();
		
		driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[3]/com.horcrux.svg.SvgView[1]/com.horcrux.svg.GroupView/com.horcrux.svg.RectView")).click();
		
		
//		    tp= new TestsPage(driver);
//			tp.getAddToCartBtn();
			
			String actualmsg = driver.findElement(AppiumBy.xpath("//android.widget.Toast[1]")).getText();
			String expectedmsg = "Test added to the cart";
//			
			assertEquals(actualmsg, expectedmsg);
			System.out.println("==========verified===========");
	}

}
