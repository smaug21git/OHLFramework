package checkupREPO;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class FullBodyCheckupBoxPlans {
	
	AppiumDriver driver;
	
	public FullBodyCheckupBoxPlans(AppiumDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	//full body chechup advance
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Full Body Checkup - Advanced\"]/parent::android.view.ViewGroup/parent::android.view.ViewGroup/descendant::android.view.ViewGroup[@content-desc='Add to Cart, Remove']")
	private WebElement addToCart;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Full Body Checkup - Advanced\"]/parent::android.view.ViewGroup/parent::android.view.ViewGroup/descendant::android.view.ViewGroup[@content-desc='View-Details']")
	private WebElement viewDetails;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Full Body Checkup - Advanced\"]/following-sibling::android.view.ViewGroup/child::android.widget.TextView[@text='68% Off']")
	private WebElement discount;
							
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Full Body Checkup - Advanced\"]/following-sibling::android.widget.TextView[@text='₹8433']")
	private WebElement originalprice;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Full Body Checkup - Advanced\"]/following-sibling::android.widget.TextView[@text='₹2699']")
	private WebElement afterDiscountprice;
	
	
	//full body checkup essentials
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Full Body Checkup - Essential\"]/parent::android.view.ViewGroup/following-sibling::android.view.ViewGroup/descendant::android.view.ViewGroup[@content-desc='Add to Cart, Remove']")
	private WebElement addToCart_Essential;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Full Body Checkup - Essential\"]/parent::android.view.ViewGroup/following-sibling::android.view.ViewGroup/descendant::android.view.ViewGroup[@content-desc='View-Details']")
	private WebElement viewDetails_essentials;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Full Body Checkup - Essential\"]/parent::android.view.ViewGroup/following-sibling::android.view.ViewGroup/descendant::android.widget.TextView[@text='Remove']")
	private WebElement delete_Essential;
	
	public WebElement getDelete_Essential() {
		return delete_Essential;
	}
	
	//ultra body checkup

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Ultra Full Body Checkup - Male\"]/parent::android.view.ViewGroup/following-sibling::android.view.ViewGroup/descendant::android.view.ViewGroup[@content-desc='Add to Cart, Remove']")
	private WebElement addToCart_Ultra_Full_Body_Checkup_Male;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Ultra Full Body Checkup - Male\"]/parent::android.view.ViewGroup/following-sibling::android.view.ViewGroup/descendant::android.view.ViewGroup[@content-desc='View-Details']")
	private WebElement viewDetails_Ultra_Full_Body_Checkup_Male;
	
	//ultra full body checkup female
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Ultra Full Body Checkup - Female\"]/parent::android.view.ViewGroup/following-sibling::android.view.ViewGroup/descendant::android.view.ViewGroup[@content-desc='Add to Cart, Remove']")
	private WebElement addToCart_Ultra_Full_Body_Checkup_Female;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Ultra Full Body Checkup - Female\"]/parent::android.view.ViewGroup/following-sibling::android.view.ViewGroup/descendant::android.view.ViewGroup[@content-desc='View-Details']")
	private WebElement viewDetails_Ultra_Full_Body_Checkup_Female;
	
	//full body checkup comprehensive
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Full Body Checkup - Comprehensive\"]/parent::android.view.ViewGroup/following-sibling::android.view.ViewGroup/descendant::android.view.ViewGroup[@content-desc='Add to Cart, Remove']")
	private WebElement addToCart_FullBodyComprehensive;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Full Body Checkup - Comprehensive\"]/parent::android.view.ViewGroup/following-sibling::android.view.ViewGroup/descendant::android.view.ViewGroup[@content-desc='View-Details']")
	private WebElement viewDetails_FullBodyComprehensive;
	
	
	// full body checkup basic
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Full Body Checkup - Basic\"]/parent::android.view.ViewGroup/following-sibling::android.view.ViewGroup/descendant::android.view.ViewGroup[@content-desc='Add to Cart, Remove']")
	private WebElement addToCart_FullBodyBasic;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Full Body Checkup - Basic\"]/parent::android.view.ViewGroup/following-sibling::android.view.ViewGroup/descendant::android.view.ViewGroup[@content-desc='View-Details']")
	private WebElement viewDetails_FullBodybasic;
	
	// essential for kids
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Children's Checkup - Essential for Kids\"]/parent::android.view.ViewGroup/following-sibling::android.view.ViewGroup/descendant::android.view.ViewGroup[@content-desc='Add to Cart, Remove']")
	private WebElement addToCart_kidsCheckup;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Children's Checkup - Essential for Kids\"]/parent::android.view.ViewGroup/following-sibling::android.view.ViewGroup/descendant::android.view.ViewGroup[@content-desc='View-Details']")
	private WebElement viewDetails_kidsCheckup;
	
	
	
	
	
	
	
	
	public WebElement getAddToCart_Essential() {
		return addToCart_Essential;
	}

	public WebElement getViewDetails_essentials() {
		return viewDetails_essentials;
	}

	public WebElement getAddToCart_Ultra_Full_Body_Checkup_Male() {
		return addToCart_Ultra_Full_Body_Checkup_Male;
	}

	public WebElement getViewDetails_Ultra_Full_Body_Checkup_Male() {
		return viewDetails_Ultra_Full_Body_Checkup_Male;
	}

	public WebElement getAddToCart_Ultra_Full_Body_Checkup_Female() {
		return addToCart_Ultra_Full_Body_Checkup_Female;
	}

	public WebElement getViewDetails_Ultra_Full_Body_Checkup_Female() {
		return viewDetails_Ultra_Full_Body_Checkup_Female;
	}

	public WebElement getAddToCart_FullBodyComprehensive() {
		return addToCart_FullBodyComprehensive;
	}

	public WebElement getViewDetails_FullBodyComprehensive() {
		return viewDetails_FullBodyComprehensive;
	}

	public WebElement getAddToCart_FullBodyBasic() {
		return addToCart_FullBodyBasic;
	}

	public WebElement getViewDetails_FullBodybasic() {
		return viewDetails_FullBodybasic;
	}

	public WebElement getAddToCart_kidsCheckup() {
		return addToCart_kidsCheckup;
	}

	public WebElement getViewDetails_kidsCheckup() {
		return viewDetails_kidsCheckup;
	}

	public AppiumDriver getDriver() {
		return driver;
	}

	public WebElement getAddToCart() {
		return addToCart;
	}

	public WebElement getViewDetails() {
		return viewDetails;
	}

	public WebElement getDiscount() {
		return discount;
	}

	public WebElement getOriginalprice() {
		return originalprice;
	}

	public WebElement getAfterDiscountprice() {
		return afterDiscountprice;
	}

	public WebElement getNoOfparameter() {
		return noOfparameter;
	}

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Full Body Checkup - Advanced\"]/parent::android.view.ViewGroup/parent::android.view.ViewGroup/descendant::android.widget.TextView[@text='100 parameters']")
	private WebElement noOfparameter;
	
	
	
	
	
	
	
	

}
