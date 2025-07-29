package checkupREPO;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SeniorCitizenCheckup {

	
AppiumDriver driver;
	
	public SeniorCitizenCheckup(AppiumDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Senior Citizen Checkup - Male\"]/parent::android.view.ViewGroup/parent::android.view.ViewGroup/descendant::android.view.ViewGroup[@content-desc='Add to Cart, Remove']")
	private WebElement maleCheckup;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Senior Citizen Checkup - Female\"]/parent::android.view.ViewGroup/parent::android.view.ViewGroup/descendant::android.view.ViewGroup[@content-desc='Add to Cart, Remove']")
	private WebElement femaleCheckup;

	public AppiumDriver getDriver() {
		return driver;
	}

	public WebElement getMaleCheckup() {
		return maleCheckup;
	}

	public WebElement getFemaleCheckup() {
		return femaleCheckup;
	}
	
	

}
