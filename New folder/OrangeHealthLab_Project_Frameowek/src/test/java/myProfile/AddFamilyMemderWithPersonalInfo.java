package myProfile;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import profileREPO.CreateProfile;
import profileREPO.HealthProfilePage;
import utility.GestureUtility;

public class AddFamilyMemderWithPersonalInfo {
	
	@Test
	public void createProfileWithPersonalInfo() throws MalformedURLException {
		
		System.out.println("===========Started the script===========");
		
		
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
		
		
		//profilebutton
		HealthProfilePage hp= new HealthProfilePage(driver);
		WebElement profilebtn = hp.getProfileIcon();
		wait.until(ExpectedConditions.visibilityOf(profilebtn));
		profilebtn.click();
		// ading memebr
		hp.getAddMember().click();
		
		// creating profile
		
		CreateProfile cp= new CreateProfile(driver);
		cp.getFullName().sendKeys("Giri");
		
		//calender handle
		
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\" DD / MMM / YYYY \"]")).click();
		// year handle
		 WebElement year = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"android:id/date_picker_header_year\"]"));
		System.out.println(year.getText());
		//day,date,year
		 WebElement month_day_year = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"android:id/date_picker_header_date\"]"));
		System.out.println(month_day_year.getText());
		
		//click on year
		year.click();
		
		WebElement target_year_box = driver.findElement(AppiumBy.id("android:id/date_picker_year_picker"));
		driver.findElement(AppiumBy.androidUIAutomator(
			    "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(" +
			    "new UiSelector().text(\"1990\"))")).click();


		
		
	}

}
