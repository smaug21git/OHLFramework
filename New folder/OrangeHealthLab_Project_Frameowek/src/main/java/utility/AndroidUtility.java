package utility;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class AndroidUtility {
	
	public AndroidDriver driver;
	
	public AndroidUtility(AndroidDriver driver) {
		this.driver=driver;
	}
	
	public void installApp(String path) {
		driver.installApp(path);
	}
	
	public void closeApp(String appPackage) {
		driver.terminateApp(appPackage);
	}
	
	public void isAppisntalled(String appPackage) {
		boolean res = driver.isAppInstalled(appPackage);
		System.out.println(res);
	}
	
	public void deleteApp(String appPackage) {
		driver.removeApp(appPackage);
	}
	
	public void hidekeyBoard(AndroidDriver driver) {
		driver.hideKeyboard();
	}
	
	public void wifi() {
		driver.toggleWifi();
	}
	
	public void airPlaneMode() {
		driver.toggleAirplaneMode();
	}
	
	public void potraitOrientation() {
		ScreenOrientation screen = driver.getOrientation();
		driver.rotate(screen.PORTRAIT);
	}
	public void landscapeOrientation() {
		ScreenOrientation screen = driver.getOrientation();
		driver.rotate(screen.LANDSCAPE);
	}
	
	public void setClipboard(String text) {
		
		driver.setClipboardText(text);
	}
	
	public void toast1() {
		String msg = driver.findElement(AppiumBy.xpath("//android.widget.Toast[1]")).getText();
		System.out.println(msg);
	}
	//android.widget.TextView[contains(@text,'- - - - - - - ')]
	
	public void toast() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            WebElement toast = wait.until(ExpectedConditions.presenceOfElementLocated(
                    AppiumBy.xpath("//android.widget.TextView[contains(@text,'- - - - - - - ')]")));
            System.out.println("Toast Message: " + toast.getText());
        } catch (Exception e) {
            System.out.println("Toast message not found: " + e.getMessage());
        }
    }
	
	
	public void getContexts() {
		Set<String> context = driver.getContextHandles();
		System.out.println(context.size());
			for(String ch:context)
			{
				System.out.println(ch);
				if(ch.contains("WEBVIEW_")) {
					driver.context(ch);
					break;
				}
			}
	}
	
	public void implicitWait(int time) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
	}
	

}
