package myProfile;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import objectRepo.Addfamilymemberpage;
import objectRepo.HomePage;
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
	HomePage hp= new HomePage(driver);
	
	//profilebutton
	WebElement profilebtn = hp.getProfileBtn();
	wait.until(ExpectedConditions.visibilityOf(profilebtn));
	profilebtn.click();
	
	Thread.sleep(4000);
     //click on add button
	
	GestureUtility gutil= new GestureUtility(driver);
	gutil.clickByCoordinate(531, 537); 
	
	Thread.sleep(4000);
	//adding a family member
	
	Addfamilymemberpage afm= new Addfamilymemberpage(driver);
			afm.addAfamilyMember("nami", "24", "07", "1990", "7722669988");
}

}
