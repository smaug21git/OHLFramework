package objectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomePage {
	
 public AppiumDriver driver;
	
	public HomePage(AppiumDriver driver) {
		this.driver= driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath="//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/com.horcrux.svg.SvgView[2]/com.horcrux.svg.GroupView/com.horcrux.svg.PathView")
	private WebElement locationDD;
	
	
	@AndroidFindBy(xpath="//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.PathView")
	private WebElement searchTxtField;
	
	@AndroidFindBy(xpath="//android.view.ViewGroup[@content-desc=\"Full Body Checkup\"]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView")
	private WebElement fullBodyCheckUpBtn;
	
	@AndroidFindBy(xpath="//android.view.ViewGroup[@content-desc=\"Women's Health\"]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView")
	private WebElement womenHealthBtn;
	
	@AndroidFindBy(xpath="//android.view.View[@content-desc=\"Home\"]")
	private WebElement HomeBtn;
	@AndroidFindBy(xpath="//android.view.View[@content-desc=\"Tests\"]")
	private WebElement testBtn;
	@AndroidFindBy(xpath="//android.view.View[@content-desc=\"Checkups\"]")
	private WebElement checkUpBtn;
	@AndroidFindBy(xpath="//android.view.View[@content-desc=\"Records\"]")
	private WebElement recordBtn;
	@AndroidFindBy(xpath="//android.view.View[@content-desc=\"Profile\"]")
	private WebElement profileBtn;

	public AppiumDriver getDriver() {
		return driver;
	}
	public WebElement getLocationDD() {
		return locationDD;
	}
	
	public WebElement getSearchTxtField() {
		return searchTxtField;
	}
	public WebElement getFullBodyCheckUpBtn() {
		return fullBodyCheckUpBtn;
	}
	public WebElement getWomenHealthBtn() {
		return womenHealthBtn;
	}
	public WebElement getHomeBtn() {
		return HomeBtn;
	}
	public WebElement getTestBtn() {
		return testBtn;
	}
	public WebElement getCheckUpBtn() {
		return checkUpBtn;
	}
	public WebElement getRecordBtn() {
		return recordBtn;
	}
	public WebElement getProfileBtn() {
		return profileBtn;
	}
	
	
	
	
	
	
	
	

}
