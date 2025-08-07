package checkupREPO;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class AllergyCheckupBoxAllPlans {
	
AppiumDriver driver;
	
	public AllergyCheckupBoxAllPlans(AppiumDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	
	
	// checkup module icon
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Checkups\"]")
	private WebElement checkups;
	
	public WebElement getCheckups() {
		return checkups;
	}

}
