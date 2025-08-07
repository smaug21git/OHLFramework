package checkupREPO;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class WomenHealthCheckUpBoxAllPlans {
	
	
	
AppiumDriver driver;
	
	public WomenHealthCheckUpBoxAllPlans(AppiumDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	
	// women health checkup
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Women Health Checkup - Essential\"]/parent::android.view.ViewGroup/following-sibling::android.view.ViewGroup/descendant::android.view.ViewGroup[@content-desc='Add to Cart, Remove']")
	private WebElement addTocart_womenhealthcheckups_essential;
	
	public WebElement getaddTocart_womenhealthcheckups_essential() {
		return addTocart_womenhealthcheckups_essential;
	}
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Women Health Checkup - Essential\"]/parent::android.view.ViewGroup/following-sibling::android.view.ViewGroup/descendant::android.view.ViewGroup[@content-desc='View-Details']")
	private WebElement viewDetails_womenhealthcheckups_essential;
	
	public WebElement getviewDetails_womenhealthcheckups_essential() {
		return viewDetails_womenhealthcheckups_essential;
	}
	
	// PCOD screen comprehensive
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"PCOD Screening - Comprehensive\"]/parent::android.view.ViewGroup/following-sibling::android.view.ViewGroup/descendant::android.view.ViewGroup[@content-desc='View-Details']")
	private WebElement viewDetails_PCODScreening_comprehensive;
	
	public WebElement getviewDetails_PCODScreening_comprehensive() {
		return viewDetails_PCODScreening_comprehensive;
	}
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"PCOD Screening - Comprehensive\"]/parent::android.view.ViewGroup/following-sibling::android.view.ViewGroup/descendant::android.view.ViewGroup[@content-desc='Add to Cart, Remove']")
	private WebElement AddTocart_PCODScreening_comprehensive;
	
	public WebElement getAddTocart_PCODScreening_comprehensive() {
		return AddTocart_PCODScreening_comprehensive;
	}
	

}
