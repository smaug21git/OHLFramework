package listner;

/**
 * 
 * @author SANU

 * test class releted to Browser instacne and Extent report
 * uses ThreadLocal so that both browser-instance and extent-test can participate in parallel execution 
 * without any error by creating mutiple static copy.
 *
 */
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import io.appium.java_client.android.AndroidDriver;

public class UtilityClassObject {

	public static ThreadLocal<ExtentTest> test = new ThreadLocal<ExtentTest>();

	public static ThreadLocal<AndroidDriver> driver = new ThreadLocal<AndroidDriver>();

	// getter test
	public static ExtentTest getTest() {
		return test.get();
	}

	// setter test
	public static void setTest(ExtentTest actTest) {
		test.set(actTest);
	}

	// getter driver
	public static AndroidDriver getDriver() {
		return driver.get();
	}

	// setter driver
	public static void setDriver(AndroidDriver actDriver) {
		driver.set(actDriver);
	}
}
