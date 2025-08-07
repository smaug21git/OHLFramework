package OR;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomePage 
{
	AppiumDriver driver;

	public HomePage(AppiumDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(xpath="//android.widget.TextView[@resource-id=\"com.alarmnet.tc2:id/tab_name\" and @text=\"CAMERAS\"]")
	private WebElement camerabtn;

	public AppiumDriver getDriver() {
		return driver;
	}

	public void setDriver(AppiumDriver driver) {
		this.driver = driver;
	}

	public WebElement getCamerabtn() {
		return camerabtn;
	}

	public void setCamerabtn(WebElement camerabtn) {
		this.camerabtn = camerabtn;
	}
	
	


}
