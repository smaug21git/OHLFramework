package checkupREPO;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SearchAllCheckUpTests {
	
	AppiumDriver driver;
	public SearchAllCheckUpTests( AppiumDriver driver) {
		this.driver= driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	// personal info
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Full Body Checkup - Essential\"]/following-sibling::android.view.ViewGroup/descendant::android.widget.TextView[@text='+ Add']")
	private WebElement fullbodyAddedEssential;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Full Body Checkup - Comprehensive\"]/following-sibling::android.view.ViewGroup/descendant::android.widget.TextView[@text='Compare']")
	private WebElement fullbodycompare;
	public AppiumDriver getDriver() {
		return driver;
	}

	public WebElement getfullbodyAddedEssential() {
		return fullbodyAddedEssential;
	}

	public WebElement getFullbodycompare() {
		return fullbodycompare;
	}
	
	
}
