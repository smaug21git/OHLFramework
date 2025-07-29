package checkUps;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import checkupREPO.CheckupPage;
import checkupREPO.FullBodyCheckup;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class AddACheckupTest {
	
	@Test
	public void addCheakup() throws MalformedURLException, InterruptedException {
		
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
		
		Thread.sleep(10000);
		CheckupPage cp= new CheckupPage(driver);
		
		cp.getCheckups().click();
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))" + ".scrollIntoView(new UiSelector().text(\"Full Body Checkup\"));")).click();
		
		cp.getFullBodyChekup().click();
		Thread.sleep(4000);
		try {
		FullBodyCheckup fbc= new FullBodyCheckup(driver);
		fbc.getEssentialFullBodyCheckup().click();
		} catch(Exception e) {
			Thread.sleep(2000);
			
			driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))" + ".scrollIntoView(new UiSelector().text(\"Full Body Checkup - Essential\"));")).click();
		}
	}

}
