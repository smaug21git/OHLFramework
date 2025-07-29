package profileREPO;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Myaccount {
	
	AppiumDriver driver;
	public Myaccount( AppiumDriver driver) {
		this.driver= driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"  Help\"]/android.widget.ImageView")
	private WebElement HelpWhatsapp;
	
	@AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[5]/android.view.ViewGroup/android.view.ViewGroup[5]/android.widget.ImageView")
	private WebElement ProfilePicEditIcon;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Family and Friends\"]")
	private WebElement FamilyandFriends;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Saved Addresses\"]")
	private WebElement savedAddresses;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Doctors\"]")
	private WebElement doctors;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Invoices\"]")
	private WebElement invoices;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"  Log Out\"]")
	private WebElement logout;
	public AppiumDriver getDriver() {
		return driver;
	}

	public WebElement getHelpWhatsapp() {
		return HelpWhatsapp;
	}

	public WebElement getProfilePicEditIcon() {
		return ProfilePicEditIcon;
	}

	public WebElement getFamilyandFriends() {
		return FamilyandFriends;
	}

	public WebElement getSavedAddresses() {
		return savedAddresses;
	}

	public WebElement getDoctors() {
		return doctors;
	}

	public WebElement getInvoices() {
		return invoices;
	}

	public WebElement getLogout() {
		return logout;
	}
	
	

}
