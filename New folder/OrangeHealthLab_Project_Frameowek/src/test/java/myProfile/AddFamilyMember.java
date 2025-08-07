package myProfile;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import objectRepo.Addfamilymemberpage;
import objectRepo.HomePage;
import profileREPO.CreateProfile;
import profileREPO.HealthProfilePage;
import utility.GestureUtility;

public class AddFamilyMember {
	
@Test
public void addAmember() throws MalformedURLException, InterruptedException {
	
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
	//cp.getDateOfBirthday().sendKeys("12 Apr 1991");
	cp.getGender().click();
	cp.getMale().click();
	cp.getBloodType().click();
	cp.bloodtypegeneric("A-").click();
	//driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))" + ".scrollIntoView(new UiSelector().textContains(\"Contact\"));")).click();
	GestureUtility gutil= new GestureUtility(driver);
	gutil.ScrollByText("Relationship");
	
	
	cp.getContactNumber().sendKeys("9988665544");
	cp.getReletionship().click();
	cp.reletionType("Child").click();
	//cp.getCreateProfile().click();
	
	
	// physical  info
	cp.getPhysicalInfo().click();
	cp.getHeightFT().sendKeys("5");
	Thread.sleep(3000);
	cp.getHeightIN().sendKeys("11");
	Thread.sleep(3000);
//	cp.getWeight().sendKeys("50");
//	Thread.sleep(3000);
//	cp.getWaistSize().click();
//	Thread.sleep(3000);
	//cp.getWaistSize().sendKeys("30");
	
	//lifestyle info
	cp.getLifeStyleInfo().click();
	cp.getSmoking().click();
	cp.smoking("Yes").click();
	Thread.sleep(3000);
	cp.getDrinking().click();
	cp.drinking("Regularly").click();
	Thread.sleep(4000);
	cp.getWorkOut().click();
	cp.workout("Occasionally").click();
	
	
	
	
	
	

}

}
