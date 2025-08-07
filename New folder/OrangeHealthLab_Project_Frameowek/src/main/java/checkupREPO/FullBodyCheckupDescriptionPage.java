package checkupREPO;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class FullBodyCheckupDescriptionPage {
	
public WebElement getExpectedActualprice() {
		return expectedActualprice;
	}

	public WebElement getExpectedDiscountprice() {
		return expectedDiscountprice;
	}

	public WebElement getExpectedDiscount() {
		return expectedDiscount;
	}

AppiumDriver driver;
	
	public FullBodyCheckupDescriptionPage(AppiumDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	//full body chechup advance
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Full Body Checkup - Advanced\"]")
	private WebElement nameOftheChechup;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Full Body Checkup - Advanced\"]/parent::android.view.ViewGroup/parent::android.view.ViewGroup/descendant::android.widget.TextView[@text='₹8433']")
	private WebElement expectedActualprice;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Full Body Checkup - Advanced\"]/parent::android.view.ViewGroup/parent::android.view.ViewGroup/descendant::android.widget.TextView[@text='₹2699']")
	private WebElement expectedDiscountprice;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Full Body Checkup - Advanced\"]/parent::android.view.ViewGroup/parent::android.view.ViewGroup/descendant::android.widget.TextView[@text='68% off']")
	private WebElement expectedDiscount;
	
	
	
	
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Full Body Checkup - Advanced\"]/parent::android.view.ViewGroup/parent::android.view.ViewGroup/parent::android.view.ViewGroup/parent::android.view.ViewGroup/following-sibling::android.view.ViewGroup/descendant::android.widget.TextView[@text='Measures']")
	private WebElement measure;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Full Body Checkup - Advanced\"]/parent::android.view.ViewGroup/parent::android.view.ViewGroup/parent::android.view.ViewGroup/parent::android.view.ViewGroup/following-sibling::android.view.ViewGroup/descendant::android.widget.TextView[@text='Blood parameters, sugar, iron, thyroid, and various others.']")
	private WebElement measureDetails;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Full Body Checkup - Advanced\"]/parent::android.view.ViewGroup/parent::android.view.ViewGroup/parent::android.view.ViewGroup/parent::android.view.ViewGroup/following-sibling::android.view.ViewGroup/descendant::android.widget.TextView[@text='Identifies']")
	private WebElement identifies;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Full Body Checkup - Advanced\"]/parent::android.view.ViewGroup/parent::android.view.ViewGroup/parent::android.view.ViewGroup/parent::android.view.ViewGroup/following-sibling::android.view.ViewGroup/descendant::android.widget.TextView[@text='Overall health and risks of diseases']")
	private WebElement identifiesDetails;
	
	@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Show more\"]/android.view.ViewGroup")
	private WebElement aboutThisTestShowMore;
	

	public WebElement getAboutThisTestShowMore() {
		return aboutThisTestShowMore;
	}

	public AppiumDriver getDriver() {
		return driver;
	}

	public WebElement getNameOftheChechup() {
		return nameOftheChechup;
	}

	public WebElement getMeasure() {
		return measure;
	}

	public WebElement getMeasureDetails() {
		return measureDetails;
	}

	public WebElement getIdentifies() {
		return identifies;
	}

	public WebElement getIdentifiesDetails() {
		return identifiesDetails;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
