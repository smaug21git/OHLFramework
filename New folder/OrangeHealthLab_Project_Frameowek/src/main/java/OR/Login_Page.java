package OR;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Login_Page 
{
	AppiumDriver driver;

	public Login_Page(AppiumDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.alarmnet.tc2:id/test_drive\"]")
	private WebElement TestDrivebtn;

	public AppiumDriver getDriver() {
		return driver;
	}

	public WebElement getTestDrivebtn() {
		return TestDrivebtn;
	}
	
	

}
