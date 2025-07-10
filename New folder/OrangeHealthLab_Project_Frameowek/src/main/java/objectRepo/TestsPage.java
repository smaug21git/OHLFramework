package objectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class TestsPage {
AppiumDriver driver;
	
	public TestsPage(AppiumDriver driver) {
		this.driver= driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath="//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]")
	private WebElement searchBtn;
	
	//most booked tests
	@AndroidFindBy (xpath="//android.widget.TextView[@text=\"Complete Blood Count (CBC)\"]/parent::android.view.ViewGroup/following-sibling::android.view.ViewGroup/android.view.ViewGroup[@content-desc='Add to Cart, Remove']")
	private WebElement CBC_AddToCartBtn;
	
	@AndroidFindBy (xpath="//android.widget.TextView[@text=\"Complete Blood Count (CBC)\"]/parent::android.view.ViewGroup/following-sibling::android.view.ViewGroup/android.view.ViewGroup[@content-desc='View-Details']")
	private WebElement CBC_ViewdetailsBtn;
	
	@AndroidFindBy (xpath="//android.widget.TextView[@text=\"COVID -19 RT PCR\"]/parent::android.view.ViewGroup/following-sibling::android.view.ViewGroup/android.view.ViewGroup[@content-desc='Add to Cart, Remove']")
	private WebElement COVID19RT_PCR_AddToCartBtn;
	
	@AndroidFindBy (xpath="//android.widget.TextView[@text=\"COVID -19 RT PCR\"]/parent::android.view.ViewGroup/following-sibling::android.view.ViewGroup/android.view.ViewGroup[@content-desc='View-Details']")
	private WebElement COVID19RT_PCR_ViewdetailsBtn;
	
	
	
	//addto cart button
	@AndroidFindBy(xpath="//android.view.ViewGroup[@content-desc=\"Add to Cart, Remove\"]")
	private WebElement AddToCartBtn;
	//viewdetails
	@AndroidFindBy(xpath="//android.view.ViewGroup[@resource-id=\"__CAROUSEL_ITEM_5_READY__\"]/android.view.ViewGroup/android.view.ViewGroup[3]/com.horcrux.svg.SvgView[5]/com.horcrux.svg.GroupView/com.horcrux.svg.RectView")
	private WebElement viewDetailsBtn;

	public AppiumDriver getDriver() {
		return driver;
	}
	public WebElement getSearchBtn() {
		return searchBtn;
	}
	public WebElement getCBC_AddToCartBtn() {
		return CBC_AddToCartBtn;
	}
	public WebElement getCBC_ViewdetailsBtn() {
		return CBC_ViewdetailsBtn;
	}
	public WebElement getCOVID19RT_PCR_AddToCartBtn() {
		return COVID19RT_PCR_AddToCartBtn;
	}
	public WebElement getCOVID19RT_PCR_ViewdetailsBtn() {
		return COVID19RT_PCR_ViewdetailsBtn;
	}
	public WebElement getAddToCartBtn() {
		return AddToCartBtn;
	}
	public WebElement getViewDetailsBtn() {
		return viewDetailsBtn;
	}
	
	
	//test for vital organs
	
	
	
	
	
	
	
	
	
	

}
