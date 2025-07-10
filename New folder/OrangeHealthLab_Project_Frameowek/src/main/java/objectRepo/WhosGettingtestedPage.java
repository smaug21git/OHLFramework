package objectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class WhosGettingtestedPage {
	
public AppiumDriver driver;
	
	public WhosGettingtestedPage(AppiumDriver driver) {
		this.driver= driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath="//android.widget.EditText[@content-desc=\"enter-name-1301441\"]")
	private WebElement fullanmeTxtfield;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@content-desc=\"enter-age-1\"]")
	private WebElement ageTxtfield;
	
	@AndroidFindBy(xpath="//android.view.ViewGroup[@content-desc=\"Male\"]/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.GroupView/com.horcrux.svg.PathView[3]")
	private WebElement maleRadioBtn;
	
	@AndroidFindBy(xpath="//android.view.ViewGroup[@content-desc=\"Female\"]/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.GroupView/com.horcrux.svg.PathView[2]")
	private WebElement femaleRadioBtn;
	
	@AndroidFindBy(xpath="//android.view.ViewGroup[@content-desc=\"Remove-member-from-order\"]")
	private WebElement removememberFromOrder;
	
	@AndroidFindBy(xpath="//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/com.horcrux.svg.SvgView[4]/com.horcrux.svg.GroupView/com.horcrux.svg.PathView")
	private WebElement addAnothermember;
	
	@AndroidFindBy(xpath="//android.view.ViewGroup[@content-desc=\"No prescribing doctor\"]")
	private WebElement noPrescribingDoctor;
	
	@AndroidFindBy(xpath="//android.view.ViewGroup[@content-desc=\"Add-your-doctor\"]")
	private WebElement addyourDoctor;
	
	@AndroidFindBy(xpath="@AndroidFindBy(xpath=\"//android.view.ViewGroup[@content-desc=\\\"Add-your-doctor\\\"]\")\r\n"
			+ "	private WebElement addyourDoctor;")
	private WebElement selectSlotbutton;
	
	
	//day
	@AndroidFindBy(xpath="//android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup")
	private WebElement day;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text=\"02:15 PM\"]")
	private WebElement time_2;
	@AndroidFindBy(xpath="//android.widget.TextView[@text=\"06:00 PM\"]")
	private WebElement time_6;
	@AndroidFindBy(xpath="//android.widget.TextView[@text=\"04:00 PM\"]")
	private WebElement time_3;
	@AndroidFindBy(xpath="//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup[5]/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup")
	private WebElement time_4;
	@AndroidFindBy(xpath="//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup[5]/android.view.ViewGroup[5]/android.view.ViewGroup/android.view.ViewGroup")
	private WebElement time_5;
	
	
	//review order
	
	@AndroidFindBy(xpath="//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]/com.horcrux.svg.SvgView[1]/com.horcrux.svg.GroupView/com.horcrux.svg.PathView")
	private WebElement reviewOrder;

	public AppiumDriver getDriver() {
		return driver;
	}


	public WebElement getFullanmeTxtfield() {
		return fullanmeTxtfield;
	}


	public WebElement getAgeTxtfield() {
		return ageTxtfield;
	}


	public WebElement getMaleRadioBtn() {
		return maleRadioBtn;
	}


	public WebElement getFemaleRadioBtn() {
		return femaleRadioBtn;
	}


	public WebElement getRemovememberFromOrder() {
		return removememberFromOrder;
	}


	public WebElement getAddAnothermember() {
		return addAnothermember;
	}


	public WebElement getNoPrescribingDoctor() {
		return noPrescribingDoctor;
	}


	public WebElement getAddyourDoctor() {
		return addyourDoctor;
	}


	public WebElement getSelectSlotbutton() {
		return selectSlotbutton;
	}


	public WebElement getDay() {
		return day;
	}


	public WebElement getTime_2() {
		return time_2;
	}


	public WebElement getTime_6() {
		return time_6;
	}


	public WebElement getTime_3() {
		return time_3;
	}


	public WebElement getTime_4() {
		return time_4;
	}


	public WebElement getTime_5() {
		return time_5;
	}


	public WebElement getReviewOrder() {
		return reviewOrder;
	}
	
	
	
	
	
	
	
	
	
	
	
	


	
	
}
