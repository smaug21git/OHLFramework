 package objectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ProfilePage {
	
 public AppiumDriver driver;
	
	public ProfilePage(AppiumDriver driver) {
		this.driver= driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text=\"Family and Friends\"]")
	private WebElement FamilyAndFriendsBtn;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text=\"Saved Addresses\"]")
	private WebElement SavedAddressBtn;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text=\"Doctors\"]")
	private WebElement DoctorBtn;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text=\"Invoices\"]")
	private WebElement InvoiceBtn;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text=\"Logout\"]")
	private WebElement LogoutBtn;
	
	@AndroidBy(xpath ="//android.view.ViewGroup[@content-desc=\"yes-action-btn\"]")
	private WebElement logoutPopBtn;
	
	@AndroidBy(xpath ="//android.widget.TextView[@text=\"Add\"]")
	private WebElement addBtn;
	
	@AndroidBy(xpath ="new UiSelector().className(\"android.widget.ImageView\").instance(4)")
	private WebElement kebabBtn;
	
	@AndroidBy(xpath ="//android.widget.TextView[@text=\"Merge Profiles\"]")
	private WebElement margeProfile;
	
	@AndroidBy(xpath ="//android.widget.TextView[@text=\"Delete Members\"]")
	private WebElement deleteProfile;
	
	
	
	

	public WebElement getKebabBtn() {
		return kebabBtn;
	}

	public WebElement getMargeProfile() {
		return margeProfile;
	}

	public WebElement getDeleteProfile() {
		return deleteProfile;
	}

	public WebElement getAddBtn() {
		return addBtn;
	}

	public WebElement getLogoutPopBtn() {
		return logoutPopBtn;
	}

	public AppiumDriver getDriver() {
		return driver;
	}

	public WebElement getFamilyAndFriendsBtn() {
		return FamilyAndFriendsBtn;
	}

	public WebElement getSavedAddressBtn() {
		return SavedAddressBtn;
	}

	public WebElement getDoctorBtn() {
		return DoctorBtn;
	}

	public WebElement getInvoiceBtn() {
		return InvoiceBtn;
	}

	public WebElement getLogoutBtn() {
		return LogoutBtn;
	}
	
	
	
			
			
	
	
	

}
