package objectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class CheckUpPage {
	
AppiumDriver driver;
	
	public CheckUpPage(AppiumDriver driver) {
		this.driver= driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath="//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]")
	private WebElement SearchTextField;
	
	@AndroidFindBy(xpath="//android.view.ViewGroup[@content-desc=\"Full Body Checkup\"]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView")
	private WebElement fullBodyCheckUpBtn;
	
	@AndroidFindBy(xpath="//android.view.ViewGroup[@content-desc=\"Women's Health\"]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView")
	private WebElement womenHealthBtn;
	
	@AndroidFindBy(xpath="//android.view.ViewGroup[@content-desc=\"Allergy Checkup\"]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView")
	private WebElement allergyCheckUpBtn;
	

	@AndroidFindBy(xpath="//android.view.ViewGroup[@content-desc=\"Sexual Health\"]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView")
	private WebElement sexualHealthBtn;

	public AppiumDriver getDriver() {
		return driver;
	}


	public WebElement getSearchTextField() {
		return SearchTextField;
	}


	public WebElement getFullBodyCheckUpBtn() {
		return fullBodyCheckUpBtn;
	}


	public WebElement getWomenHealthBtn() {
		return womenHealthBtn;
	}


	public WebElement getAllergyCheckUpBtn() {
		return allergyCheckUpBtn;
	}


	public WebElement getSexualHealthBtn() {
		return sexualHealthBtn;
	}
	
	
	

}
