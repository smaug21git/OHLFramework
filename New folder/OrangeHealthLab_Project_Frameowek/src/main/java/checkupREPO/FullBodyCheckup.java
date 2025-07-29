package checkupREPO;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class FullBodyCheckup {
	
AppiumDriver driver;
	
	public FullBodyCheckup(AppiumDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath = "(//android.view.ViewGroup[@content-desc=\"Add to Cart, Remove\"])[1]/parent::android.view.ViewGroup/preceding-sibling::android.view.ViewGroup/descendant::android.widget.TextView[@text='Full Body Checkup - Basic']")
	private WebElement basicFullBodyCheckup;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Full Body Checkup - Advanced\"]/parent::android.view.ViewGroup/parent::android.view.ViewGroup/descendant::android.view.ViewGroup[@content-desc='Add to Cart, Remove']")
	private WebElement advanceFullBodyCheckup;
	
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Full Body Checkup - Comprehensive\"]/parent::android.view.ViewGroup/parent::android.view.ViewGroup/descendant::android.view.ViewGroup[@content-desc='Add to Cart, Remove']")
	private WebElement comprehensiveFullBodyCheckup;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Full Body Checkup - Essential\"]/parent::android.view.ViewGroup/parent::android.view.ViewGroup/descendant::android.view.ViewGroup[@content-desc='Add to Cart, Remove']")
	private WebElement essentialFullBodyCheckup;

	public AppiumDriver getDriver() {
		return driver;
	}

	public WebElement getBasicFullBodyCheckup() {
		return basicFullBodyCheckup;
	}

	public WebElement getAdvanceFullBodyCheckup() {
		return advanceFullBodyCheckup;
	}

	public WebElement getComprehensiveFullBodyCheckup() {
		return comprehensiveFullBodyCheckup;
	}

	public WebElement getEssentialFullBodyCheckup() {
		return essentialFullBodyCheckup;
	}
	
	
	
	
	

}
