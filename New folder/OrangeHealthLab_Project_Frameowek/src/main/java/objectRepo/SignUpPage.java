package objectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SignUpPage {
	
  public AppiumDriver driver;
	
	public SignUpPage(AppiumDriver driver) {
		this.driver= driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(className = "android.widget.EditText")
	private WebElement mobileNoTxtFieldBtn;
	
	@AndroidFindBy(xpath="//android.view.View")
	private WebElement continueBtn;
	
	@AndroidFindBy(xpath="//android.view.ViewGroup[@content-desc=\"Back\"]")
	private WebElement backBtn;
	
	@AndroidFindBy(xpath="//android.view.ViewGroup[@content-desc=\"Need Help?\"]")
	private WebElement needHelpBtn;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@content-desc=\"enter-fullname\"]")
	private WebElement nameTxtFieldBtn;
	
	
	public WebElement getNameTxtFieldBtn() {
		return nameTxtFieldBtn;
	}

	public WebElement getDoneBtn() {
		return doneBtn;
	}

	@AndroidFindBy(className = "android.view.View")
	private WebElement doneBtn;
	
	

	public AppiumDriver getDriver() {
		return driver;
	}

	public WebElement getMobileNoTxtFieldBtn() {
		return mobileNoTxtFieldBtn;
	}

	public WebElement getContinueBtn() {
		return continueBtn;
	}

	public WebElement getBackBtn() {
		return backBtn;
	}

	public WebElement getNeedHelpBtn() {
		return needHelpBtn;
	}
	
	
	
	
	
	
	
	


}
