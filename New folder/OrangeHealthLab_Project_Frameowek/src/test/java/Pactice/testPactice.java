package Pactice;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import OR.CameraPage;
import OR.HomePage;
import OR.Login_Page;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import utility.GestureUtility;

public class testPactice 
{
	@Test
	public void test() throws MalformedURLException, Throwable
	{
	DesiredCapabilities dc=new DesiredCapabilities();
	
	dc.setCapability("platformName", "android");
	dc.setCapability("automationName", "uiautomator2");
	dc.setCapability("deviceName", "Galaxy A04");
	dc.setCapability("UDID", "R9ZW1065M9V");
	
	dc.setCapability("ignoreHiddenApiPolicyError", true);
	dc.setCapability("autoGrantPermissions", true);
	dc.setCapability("noReset", true);
	
	
	URL url=new URL("http://localhost:4723");
	AndroidDriver driver=new AndroidDriver(url,dc);
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	
	driver.activateApp("com.alarmnet.tc2");
	Thread.sleep(5000);
//	//LoginPagePage
	Login_Page lp = new Login_Page(driver);
	lp.getTestDrivebtn().click();
//	WebElement testDrive = lp.getTestDrivebtn();
//	wait.until(ExpectedConditions.elementToBeClickable(testDrive));
//	JavascriptExecutor js = (JavascriptExecutor)driver;
//	js.executeScript("arguments[0].click()",testDrive);
	
//	//HomePage
	Thread.sleep(10000);
	HomePage hp = new HomePage(driver);
	hp.getCamerabtn().click();
	Thread.sleep(5000);
//camerapage
	
	CameraPage cp = new CameraPage(driver);
//	cp.getKebabbtn().click();
//	Thread.sleep(10000);
//	cp.getSettingbtn().click();
//	Thread.sleep(10000);
//	cp.getMicrophtogglebtn().click();
	
	GestureUtility gu = new GestureUtility(driver);
	gu.ScrollByText("Entry Way");
	

}
}