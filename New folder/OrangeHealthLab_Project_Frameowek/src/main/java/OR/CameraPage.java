package OR;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class CameraPage {
	
	AppiumDriver driver;

	public CameraPage(AppiumDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(xpath = "(//android.widget.ImageView[@content-desc=\"Settings\"])[1]")
	private WebElement kebabbtn;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"android:id/title\"]")
	private WebElement settingbtn;
	
	@AndroidFindBy(xpath = "(//android.widget.Switch[@resource-id=\"com.alarmnet.tc2:id/switch_selection\"])[1]")
	private WebElement microphtogglebtn;

	
	public AppiumDriver getDriver() {
		return driver;
	}

	public WebElement getKebabbtn() {
		return kebabbtn;
	}

	public WebElement getSettingbtn() {
		return settingbtn;	
		
	}

	public WebElement getMicrophtogglebtn() {
		return microphtogglebtn;
	}
	
	
	
	

}
