package myProfile;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.Activity;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.remote.MobileCapabilityType;
import profileREPO.HealthProfilePage;
import profileREPO.Myaccount;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class WhatsAppAutomationTest {

    @Test
    public void changeContext() throws MalformedURLException, InterruptedException {
        DesiredCapabilities dc = new DesiredCapabilities();

        dc.setCapability("platformName", "Android");
        dc.setCapability("automationName", "uiautomator2");
        dc.setCapability("deviceName", "Galaxy A04");
        dc.setCapability("udid", "R9ZW1065M9V");

        dc.setCapability("ignoreHiddenApiPolicyError", true);
        dc.setCapability("autoGrantPermissions", true);
        dc.setCapability("noReset", true);

        // Connect to Appium Server
        URL url = new URL("http://localhost:4723");
        AndroidDriver driver = new AndroidDriver(url, dc);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        // Start your app explicitly
        driver.activateApp("in.orangehealth.patient");

        // Profile Page
        HealthProfilePage hp = new HealthProfilePage(driver);
        WebElement profileBtn = hp.getProfileIcon();
        wait.until(ExpectedConditions.visibilityOf(profileBtn)).click();

        // Settings
        WebElement settingIcon = hp.getSettingIcon();
        wait.until(ExpectedConditions.visibilityOf(settingIcon)).click();

        // WhatsApp Help Option
        Myaccount mac = new Myaccount(driver);
        WebElement whatsappBtn = mac.getHelpWhatsapp();
        wait.until(ExpectedConditions.visibilityOf(whatsappBtn)).click();

        // Wait for WhatsApp to open
        Thread.sleep(5000);  // You can replace with better wait if needed

        // Check if WhatsApp is now the active app
        String currentPackage = driver.getCurrentPackage();
        System.out.println("Current App: " + currentPackage);

        if (!currentPackage.equals("com.whatsapp")) {
            System.out.println("WhatsApp didn't open properly.");
            return;
        }

        // Now WhatsApp should be open, wait for chat field
        try {
            WebDriverWait whatsappWait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement chatField = whatsappWait.until(
                ExpectedConditions.presenceOfElementLocated(AppiumBy.id("com.whatsapp:id/entry"))
            );

            chatField.sendKeys("Hello from Appium automation!");
        } catch (Exception e) {
            System.out.println("Failed to find or interact with WhatsApp chat field: " + e.getMessage());
        }

        // Optional: Return back to original app
//        driver.activateApp("in.orangehealth.patient");
    }
}
