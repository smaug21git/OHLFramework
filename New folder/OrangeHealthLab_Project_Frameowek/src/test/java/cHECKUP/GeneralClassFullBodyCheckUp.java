package cHECKUP;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class GeneralClassFullBodyCheckUp {
	
	AppiumDriver driver;
	
	public GeneralClassFullBodyCheckUp() {
		this.driver= driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Checkup')]")
	private WebElement ele;

}
