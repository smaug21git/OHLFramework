package objectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class WelcomePage {
	
	public AppiumDriver driver;
	
	public WelcomePage(AppiumDriver driver) {
		this.driver= driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath="//android.view.View")
	private WebElement LoginOrSignupBtn;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text=\"T&C \"]")
	private WebElement TcBtn;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text=\"Privacy Policy\"]")
	private WebElement PrivecyPolicyBtn;

	public AppiumDriver getDriver() {
		return driver;
	}

	public WebElement getLoginOrSignupBtn() {
		return LoginOrSignupBtn;
	}

	public WebElement getTcBtn() {
		return TcBtn;
	}

	public WebElement getPrivecyPolicyBtn() {
		return PrivecyPolicyBtn;
	}
	
	
	
	
	

}
