package checkupREPO;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class WomenHelath {
	
	AppiumDriver driver;
	
	public WomenHelath (AppiumDriver driver) {
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Women Health Checkup - Essential\"]/parent::android.view.ViewGroup/parent::android.view.ViewGroup/descendant::android.view.ViewGroup[@content-desc='Add to Cart, Remove']")
	private WebElement essentialCheckup;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Women Health Checkup - Advanced\"]/parent::android.view.ViewGroup/parent::android.view.ViewGroup/descendant::android.view.ViewGroup[@content-desc='Add to Cart, Remove']")
	private WebElement advanceCheckup;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Women Health Checkup - Comprehensive\"]/parent::android.view.ViewGroup/parent::android.view.ViewGroup/descendant::android.view.ViewGroup[@content-desc='Add to Cart, Remove']")
	private WebElement comprehensiveCheckup;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"PCOD Screening - Comprehensive\"]/parent::android.view.ViewGroup/parent::android.view.ViewGroup/descendant::android.view.ViewGroup[@content-desc='Add to Cart, Remove']")
	private WebElement PCODComprehensiveScreeningCheckup;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"PCOD Screening\"]/parent::android.view.ViewGroup/parent::android.view.ViewGroup/descendant::android.view.ViewGroup[@content-desc='Add to Cart, Remove']")
	private WebElement PCODScreeningCheckup;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Antenatal Checkup - Basic\"]/parent::android.view.ViewGroup/parent::android.view.ViewGroup/descendant::android.view.ViewGroup[@content-desc='Add to Cart, Remove']")
	private WebElement antenatalBasicCheckup;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Antenatal Checkup - Comprehensive\"]/parent::android.view.ViewGroup/parent::android.view.ViewGroup/descendant::android.view.ViewGroup[@content-desc='Add to Cart, Remove']")
	private WebElement antenatalcomprehensiveheckup;

	public AppiumDriver getDriver() {
		return driver;
	}

	public WebElement getEssentialCheckup() {
		return essentialCheckup;
	}

	public WebElement getAdvanceCheckup() {
		return advanceCheckup;
	}

	public WebElement getComprehensiveCheckup() {
		return comprehensiveCheckup;
	}

	public WebElement getPCODComprehensiveScreeningCheckup() {
		return PCODComprehensiveScreeningCheckup;
	}

	public WebElement getPCODScreeningCheckup() {
		return PCODScreeningCheckup;
	}

	public WebElement getAntenatalBasicCheckup() {
		return antenatalBasicCheckup;
	}

	public WebElement getAntenatalcomprehensiveheckup() {
		return antenatalcomprehensiveheckup;
	}
	
	
	
	
	

}
