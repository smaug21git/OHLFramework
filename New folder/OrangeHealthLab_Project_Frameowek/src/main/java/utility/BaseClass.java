package utility;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import objectRepo.Addfamilymember;
import objectRepo.HomePage;
import objectRepo.ProfilePage;
import objectRepo.SignUpPage;
import objectRepo.TestsPage;
import objectRepo.WelcomePage;

public class BaseClass {

	public  AppiumDriverLocalService service;
	public  FileUtility flib = new FileUtility();
	public  AndroidDriver driver;
	public  AndroidUtility autil;
	public   WelcomePage wp;
	public SignUpPage sp;
	public  HomePage hp;
	public  ProfilePage mAc;
	public  GestureUtility gUtil;
	public TestsPage tp;
	public Addfamilymember aFMp;
	
	public static AndroidDriver sdriver;

	@BeforeSuite
	public  void startServer() {

		File f = new File("C:\\Users\\SOMU\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js");
		service = new AppiumServiceBuilder().withAppiumJS(f).withIPAddress("127.0.0.1").usingPort(4723)
				.withTimeout(Duration.ofSeconds(300)).build();

		service.start();

	}

	@BeforeClass
	public  void launchApp() throws FileNotFoundException, IOException, InterruptedException {

		UiAutomator2Options op = new UiAutomator2Options();
		op.setPlatformName("android");
		op.setDeviceName("Galaxy A04");
		op.setUdid("R9ZW1065M9V");
		op.setIgnoreHiddenApiPolicyError(true);
		op.setAutoGrantPermissions(true);
		op.setNoReset(true);
		//op.uiScrollable(true);

		URL u = new URL("http://localhost:4723");
		driver = new AndroidDriver(u, op);
		sdriver=driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
		driver.activateApp("in.orangehealth.patient");

	}

	@BeforeMethod
	public  void login() throws FileNotFoundException, IOException {
		
		
		System.out.println("=====before mothod executed=====");
//		wp = new WelcomePage(driver);
//		wp.getLoginOrSignupBtn().click();

//		sp = new SignUpPage(driver);
//		sp.getMobileNoTxtFieldBtn().sendKeys("7001244860");
//		sp.getContinueBtn().click();

	}

	@AfterMethod
	public  void logout() {
		

//		hp = new HomePage(driver);
//		hp.getProfileBtn().click();
//		
//		mAc = new MyAccountPage(driver);
//		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Logout\"));")).click();
//		mAc.getLogoutBtn().click();
//		
//		 gUtil= new GestureUtility(driver);
//		 gUtil.clickByCoordinate(485, 818);
		System.out.println("=====after mothod executed=====");
		

	}

	@AfterClass
	public  void closeApp() throws FileNotFoundException, IOException {

		System.out.println("=====after class executed=====");
		// driver.terminateApp("in.orangehealth.patient");

	}

	@AfterSuite
	public  void stopServer() {

		
		service.stop();

	}

}
