package profileREPO;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import javaUtil.JavaUtility;
import utility.GestureUtility;

public class CreateProfile {
	
	public WebElement getMale() {
		return male;
	}


	public WebElement getFemale() {
		return female;
	}


	public WebElement getBloodTypeGeneric() {
		return bloodTypeGeneric;
	}

	AppiumDriver driver;
	public CreateProfile( AppiumDriver driver) {
		this.driver= driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	// personal info
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Personal Info\"]")
	private WebElement personalinfo;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@text=\"John\"]")
	private WebElement fullName;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\" DD / MMM / YYYY \"]")
	private WebElement dateOfBirthday;
	

	
	
	
	@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Gender*\"]")
	private WebElement gender;
	@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Male\"]")
	private WebElement male;
	@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Female\"]")
	private WebElement female;
	
	
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Not Set\"]")
	private WebElement bloodType;
	
	
	@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"A+\"]")
	private WebElement bloodTypeGeneric;
	// business method for blood type info
	
		public WebElement bloodtypegeneric(String type) {
			
			return driver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\""+type+"\"]"));
		}
	
	
	
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@text=\"000-000-0000\"]")
	private WebElement contactNumber;
	
	@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Relationship, Select\"]/android.widget.ImageView")
	private WebElement reletionship;
	
	// business method for reletionship type info
	
			public WebElement reletionType(String Type) {
				
				return driver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\""+Type+"\"]"));
			}
		
	
	

	
	//physicalinfo
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Physical Info\"]")
	private WebElement physicalInfo;
	@AndroidFindBy(xpath = "(//android.widget.EditText[@text=\"00\"])[1]")
	private WebElement heightFT;
	@AndroidFindBy(xpath = "//android.widget.EditText[@text=\"00\"]")
	private WebElement heightIN;
	@AndroidFindBy(xpath = "(//android.widget.TextView[@text=\"Not Set\"])[1]")
	private WebElement weight;
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Waist Size\"]/following-sibling::android.view.ViewGroup[@content-desc='Not Set']")
	private WebElement waistSize;
	
	//lifestyleinfo
	
	@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Lifestyle Info\"]")
	private WebElement lifeStyleInfo;
	@AndroidFindBy(xpath = "(//android.widget.TextView[@text=\"Select\"])[1]")
	private WebElement smoking;
	
	public WebElement smoking(String type) {
		
		return driver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\""+type+"\"]"));
	}
	
	
	@AndroidFindBy(xpath = "(//android.widget.TextView[@text=\"Select\"])[2]")
	private WebElement drinking;
	
     public WebElement drinking(String type) {
		
		return driver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\""+type+"\"]"));
	}
     
	@AndroidFindBy(xpath = "(//android.widget.TextView[@text=\"Select\"])[3]")
	private WebElement workOut;
	
public WebElement workout(String type) {
		
		return driver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\""+type+"\"]"));
	}
	
	//medical condition
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Medical Conditions\"]")
	private WebElement medicalcondition;
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Medical Conditions\"]")
	private WebElement medicalAddCondition;
	
	//family history
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Family History\"]")
	private WebElement familyHistory;
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Add Conditions\"]")
	private WebElement FamilyHistoryAddCondition;
	
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Create Profile\"]")
	private WebElement createProfile;
	public AppiumDriver getDriver() {
		return driver;
	}


	public WebElement getPersonalinfo() {
		return personalinfo;
	}


	public WebElement getFullName() {
		return fullName;
	}


	public WebElement getDateOfBirthday() {
		return dateOfBirthday;
	}


	public WebElement getGender() {
		return gender;
	}


	public WebElement getBloodType() {
		return bloodType;
	}


	public WebElement getContactNumber() {
		return contactNumber;
	}


	public WebElement getReletionship() {
		return reletionship;
	}


	public WebElement getPhysicalInfo() {
		return physicalInfo;
	}


	public WebElement getHeightFT() {
		return heightFT;
	}


	public WebElement getHeightIN() {
		return heightIN;
	}


	public WebElement getWeight() {
		return weight;
	}


	public WebElement getWaistSize() {
		return waistSize;
	}


	public WebElement getLifeStyleInfo() {
		return lifeStyleInfo;
	}


	public WebElement getSmoking() {
		return smoking;
	}


	public WebElement getDrinking() {
		return drinking;
	}


	public WebElement getWorkOut() {
		return workOut;
	}


	public WebElement getMedicalcondition() {
		return medicalcondition;
	}


	public WebElement getMedicalAddCondition() {
		return medicalAddCondition;
	}


	public WebElement getFamilyHistory() {
		return familyHistory;
	}


	public WebElement getFamilyHistoryAddCondition() {
		return FamilyHistoryAddCondition;
	}


	public WebElement getCreateProfile() {
		return createProfile;
	}
	
	
	
	
	
	
	
	
}
