package checkupREPO;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class CheckupPage {
	
	AppiumDriver driver;
	
	public CheckupPage(AppiumDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	
	
	// checkup module icon
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Checkups\"]")
	private WebElement checkups;
	
	public WebElement getCheckups() {
		return checkups;
	}
	
	
	
	
	
	// popular chechups
	@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Full Body Checkup\"]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView")
	private WebElement fullbodyCheckupBox;
	
	public WebElement getFullbodyCheckupBox() {
		return fullbodyCheckupBox;
	}
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Sexual Health\"]")
	private WebElement sexualhealthCheckupBox;
	
	public WebElement getsexualhealthCheckupBox() {
		return sexualhealthCheckupBox;
	}
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Women's Health\"]")
	private WebElement womenhealthCheckupBox;
	
	public WebElement getwomenhealthCheckupBox() {
		return womenhealthCheckupBox;
	}
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Allergy Checkup\"]")
	private WebElement AllergyCheckupBox;
	
	public WebElement getAllergyCheckupBox() {
		return AllergyCheckupBox;
	}
	
	
	
	// curated checkups

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Diabetes\r\n"
			+ "Checkup\"]")
	private WebElement diabetes;
	
	
	
	@AndroidFindBy(xpath = "android.view.ViewGroup[@content-desc=\"Senior Citizen\"]")
	private WebElement SrCitizen;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Women's\r\n"
			+ "Health\"]")
	private WebElement womenhealth;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Full\r\n"
			+ "Body Checkups\"]")
	private WebElement fullBodyChekup;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Lifestyle\r\n"
			+ "Checkup\"]")
	private WebElement lifestyleCheckup;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Cancer\r\n"
			+ "Checkup\"]")
	private WebElement cancerCheckup;
	
	

	public AppiumDriver getDriver() {
		return driver;
	}

	public WebElement getDiabetes() {
		return diabetes;
	}

	public WebElement getSrCitizen() {
		return SrCitizen;
	}

	public WebElement getWomenhealth() {
		return womenhealth;
	}

	public WebElement getFullBodyChekup() {
		return fullBodyChekup;
	}

	public WebElement getLifestyleCheckup() {
		return lifestyleCheckup;
	}

	public WebElement getCancerCheckup() {
		return cancerCheckup;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
