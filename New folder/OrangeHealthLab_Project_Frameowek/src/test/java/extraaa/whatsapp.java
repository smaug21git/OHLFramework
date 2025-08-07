package extraaa;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import profileREPO.HealthProfilePage;
import profileREPO.Myaccount;

public class whatsapp {
	
	@Test
	public void changeContext() throws MalformedURLException, InterruptedException {
		
		DesiredCapabilities dc = new DesiredCapabilities();

		dc.setCapability("platformName", "android");
		dc.setCapability("automationName", "uiautomator2");
		dc.setCapability("deviceName", "Galaxy A04");
		dc.setCapability("UDID", "R9ZW1065M9V");

		dc.setCapability("ignoreHiddenApiPolicyError", true);
		dc.setCapability("autoGrantPermissions", true);
		dc.setCapability("noReset", true);

//		dc.setCapability("appPackage", "in.orangehealth.patient");
//		dc.setCapability("appium:appActivity", "in.orangehealth.patient.MainActivity");
		
		

		URL url = new URL("http://localhost:4723");
		AndroidDriver driver = new AndroidDriver(url, dc);
		
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
		
		driver.activateApp("in.orangehealth.patient");

		//profilebutton
		HealthProfilePage hp= new HealthProfilePage(driver);
		WebElement profilebtn = hp.getProfileIcon();
		wait.until(ExpectedConditions.visibilityOf(profilebtn));
		profilebtn.click();
		
		hp.getSettingIcon().click();
		Thread.sleep(3000);
		
		//whatsapp
//		
		Myaccount mac= new Myaccount(driver);
		mac.getHelpWhatsapp().click();
		
//		driver.activateApp("com.whatsapp");
//		driver.startActivity(new Activity("com.whatsapp", "com.whatsapp.Conversation"));
		
		Thread.sleep(10000);
		
		WebElement whatappChatField = driver.findElement(AppiumBy.xpath("//android.widget.EditText[@resource-id=\"com.whatsapp:id/entry\"]"));
		wait.until(ExpectedConditions.presenceOfElementLocated((By) whatappChatField));
		whatappChatField.clear();
		whatappChatField.sendKeys("hiiiiiiiiii");
		
		
		
		
		
	}

}
