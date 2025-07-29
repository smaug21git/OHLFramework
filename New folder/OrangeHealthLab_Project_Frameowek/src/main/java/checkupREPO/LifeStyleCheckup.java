package checkupREPO;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LifeStyleCheckup {
	
AppiumDriver driver;
	
	public LifeStyleCheckup (AppiumDriver driver) {
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Vitamins Checkup\"]/parent::android.view.ViewGroup/parent::android.view.ViewGroup/descendant::android.view.ViewGroup[@content-desc='Add to Cart, Remove']")
	private WebElement vitiminsCheckup;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Weight Loss Screening\"]/parent::android.view.ViewGroup/parent::android.view.ViewGroup/descendant::android.view.ViewGroup[@content-desc='Add to Cart, Remove']")
	private WebElement weightlossCheckup;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Gut Health Checkup\"]/parent::android.view.ViewGroup/parent::android.view.ViewGroup/descendant::android.view.ViewGroup[@content-desc='Add to Cart, Remove']")
	private WebElement guthealthCheckup;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Heart Health Checkup\"]/parent::android.view.ViewGroup/parent::android.view.ViewGroup/descendant::android.view.ViewGroup[@content-desc='Add to Cart, Remove']")
	private WebElement HeartHealthCheckup;

	public AppiumDriver getDriver() {
		return driver;
	}

	public WebElement getVitiminsCheckup() {
		return vitiminsCheckup;
	}

	public WebElement getWeightlossCheckup() {
		return weightlossCheckup;
	}

	public WebElement getGuthealthCheckup() {
		return guthealthCheckup;
	}

	public WebElement getHeartHealthCheckup() {
		return HeartHealthCheckup;
	}
	
	
	

}
