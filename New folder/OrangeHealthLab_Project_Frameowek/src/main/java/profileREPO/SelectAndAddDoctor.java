package profileREPO;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SelectAndAddDoctor {
	
	AppiumDriver driver;
	public SelectAndAddDoctor( AppiumDriver driver) {
		this.driver= driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	// personal info
	@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"  Log Out\"]")
	private WebElement doctorName;
	
	@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"  Log Out\"]/android.widget.ImageView[2]")
	private WebElement contactbookIcon;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Version-4.3.9\"]")
	private WebElement phoneNumber;
	public AppiumDriver getDriver() {
		return driver;
	}

	public WebElement getDoctorName() {
		return doctorName;
	}

	public WebElement getContactbookIcon() {
		return contactbookIcon;
	}

	public WebElement getPhoneNumber() {
		return phoneNumber;
	}
	
	

}
