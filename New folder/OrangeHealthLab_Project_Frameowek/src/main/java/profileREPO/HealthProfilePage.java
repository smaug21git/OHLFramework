package profileREPO;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HealthProfilePage {
	
	public WebElement getProfileIcon() {
		return profileIcon;
	}



	AppiumDriver driver;
	public HealthProfilePage( AppiumDriver driver) {
		this.driver= driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	
	
	@AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.View/android.view.View[5]/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.ImageView")
	private WebElement profileIcon;
	
	
	@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Add Member\"]/android.view.ViewGroup")
	private WebElement addMember;
	
	@AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ImageView")
	private WebElement settingIcon;
	public AppiumDriver getDriver() {
		return driver;
	}

	public WebElement getAddMember() {
		return addMember;
	}

	public WebElement getSettingIcon() {
		return settingIcon;
	}
	
	

}
