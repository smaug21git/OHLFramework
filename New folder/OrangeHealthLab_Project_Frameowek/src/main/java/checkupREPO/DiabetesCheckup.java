package checkupREPO;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class DiabetesCheckup {
	
AppiumDriver driver;
	
	public DiabetesCheckup(AppiumDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Diabetes Care Checkup- Essential\"]/parent::android.view.ViewGroup/parent::android.view.ViewGroup/descendant::android.view.ViewGroup[@content-desc='Add to Cart, Remove']")
	private WebElement essentialCheckup;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Diabetes Care Checkup - Advanced\"]/parent::android.view.ViewGroup/parent::android.view.ViewGroup/descendant::android.view.ViewGroup[@content-desc='Add to Cart, Remove']")
	private WebElement advanceCheckup;

	public AppiumDriver getDriver() {
		return driver;
	}

	public WebElement getEssentialCheckup() {
		return essentialCheckup;
	}

	public WebElement getAdvanceCheckup() {
		return advanceCheckup;
	}
	
	

}
