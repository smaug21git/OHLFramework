package checkUps;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import checkupREPO.CheckupPage;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import utility.GestureUtility;

public class SrCitezenCheckup {
	
	@Test
	public void Srcitezen()  throws MalformedURLException, InterruptedException {
	
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
			
			// wait for checkup page to load
			wait.until(ExpectedConditions.visibilityOf(cp.getFullbodyCheckupBox()));
			
			// getting senior checkup element
			WebElement sr_citezen = cp.getSrCitizen();
			
			// swipe till senior checkup 
			
			GestureUtility gutil= new GestureUtility(driver);
			 gutil.ScrollByText("Senior\nCitizen");
			//gutil.ScrollByXpath("android.view.ViewGroup[@content-desc=\"Senior Citizen\"]");
			
			
			
			
	
	//driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))" + ".scrollIntoView(new UiSelector().text(\"Senior Citizen\"));")).click();


}
}

