package objectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HealthRecordPage {
	
AppiumDriver driver;
	
	public HealthRecordPage(AppiumDriver driver) {
		this.driver= driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath="//android.view.ViewGroup[@content-desc=\"All Members\"]")
	private WebElement allMember;
	
	@AndroidFindBy(xpath="//android.view.ViewGroup[@content-desc=\"Bookmarks\"]")
	private WebElement Bookmark;
	
	@AndroidFindBy(xpath="//android.view.ViewGroup[@content-desc=\"LAB REPORTS\"]")
	private WebElement LabReport;
	
	@AndroidFindBy(xpath="//android.view.ViewGroup[@content-desc=\"PRESCRIPTION\"]")
	private WebElement prescription;

	public AppiumDriver getDriver() {
		return driver;
	}

	public WebElement getAllMember() {
		return allMember;
	}

	public WebElement getBookmark() {
		return Bookmark;
	}

	public WebElement getLabReport() {
		return LabReport;
	}

	public WebElement getPrescription() {
		return prescription;
	}
	
	
	

}
