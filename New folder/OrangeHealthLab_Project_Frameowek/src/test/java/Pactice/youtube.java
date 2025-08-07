package Pactice;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class youtube 
{

	@Test
	public void youtube() throws MalformedURLException
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
		
		driver.activateApp("com.google.android.youtube");
		
		driver.findElement(AppiumBy.xpath("//android.widget.ImageView[@content-desc=\"Search\"]")).click();
		
	}
}
