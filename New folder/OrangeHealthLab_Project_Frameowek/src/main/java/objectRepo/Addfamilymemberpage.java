package objectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utility.AndroidUtility;

public class Addfamilymemberpage {
	
public AndroidDriver driver;
	
	public Addfamilymemberpage(AndroidDriver driver) {
		this.driver= driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath="//android.view.ViewGroup[@content-desc=\"single-select-btn\"]")
	private WebElement electreletionship;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@content-desc=\"members-name-error\"]")
	private WebElement selectmemberName;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@content-desc=\"date-input\"]")
	private WebElement date;
	@AndroidFindBy(xpath="//android.widget.EditText[@content-desc=\"month-input\"]")
	private WebElement month;
	@AndroidFindBy(xpath="//android.widget.EditText[@content-desc=\"year-input\"]")
	private WebElement year;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@content-desc=\"mobile-number-input\"]")
	private WebElement mobileno;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text=\"Male\"]")
	private WebElement male;
	@AndroidFindBy(xpath="//android.widget.TextView[@text=\"Female\"]")
	private WebElement female;
	@AndroidFindBy(xpath="//android.widget.TextView[@text=\"Other\"]")
	private WebElement other;
	
	@AndroidFindBy(xpath="//android.view.ViewGroup[@content-desc=\"save-btn\"]")
	private WebElement savebtn;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc=\"item-select-text\" and @text=\"Sibling\"]")
	private WebElement sibling;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc=\"item-select-text\" and @text=\"Spouse\"]")
	private WebElement spouse;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc=\"item-select-text\" and @text=\"Child\"]")
	private WebElement child;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc=\"item-select-text\" and @text=\"Parent\"]")
	private WebElement parent;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc=\"item-select-text\" and @text=\"Grandparent\"]")
	private WebElement grandparent;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc=\"item-select-text\" and @text=\"Others\"]")
	private WebElement othersReletionship;
	
	
	
	

	public WebElement getSpouse() {
		return spouse;
	}

	public WebElement getChild() {
		return child;
	}

	public WebElement getParent() {
		return parent;
	}

	public WebElement getGrandparent() {
		return grandparent;
	}

	public WebElement getOthersReletionship() {
		return othersReletionship;
	}

	public WebElement getSibling() {
		return sibling;
	}

	public AppiumDriver getDriver() {
		return driver;
	}

	public WebElement getRelectreletionship() {
		return electreletionship;
	}

	public WebElement getSelectmemberName() {
		return selectmemberName;
	}

	public WebElement getDate() {
		return date;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getMobileno() {
		return mobileno;
	}

	public WebElement getMale() {
		return male;
	}

	public WebElement getFemale() {
		return female;
	}

	public WebElement getOther() {
		return other;
	}

	public WebElement getSavebtn() {
		return savebtn;
	}
	
	
	// business method
	
		public void addAfamilyMember(String name,String date,String month, String year, String mobileNo) {
			Addfamilymemberpage afm= new Addfamilymemberpage(driver);
			AndroidUtility autil= new AndroidUtility(driver);
			
			afm.getRelectreletionship().click();
			afm.getSibling().click();
			afm.getSelectmemberName().sendKeys(name);
			afm.getDate().sendKeys(date);
			afm.getMonth().sendKeys(month);
			afm.getYear().sendKeys(year);
			autil.hidekeyBoard(driver);
			afm.getMobileno().sendKeys("8877665544");
			afm.getMale().click();
			afm.getSavebtn().click();
			
			
		}
	
	
	

}
