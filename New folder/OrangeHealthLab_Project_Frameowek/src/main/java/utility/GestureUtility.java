
package utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class GestureUtility {
	AppiumDriver driver;
	
		public GestureUtility(AppiumDriver driver) {
			this.driver=driver;
		}
		
		public void clickByElement(WebElement element) {
			
			((JavascriptExecutor) driver).executeScript("mobile:clickGesture", 
					ImmutableMap.of("elementId",((RemoteWebElement)element).getId()));
		}
		
		public void clickByCoordinate(int x, int y) {

			((JavascriptExecutor) driver).executeScript("mobile:clickGesture", 
					ImmutableMap.of("x",x,"y",y));
		}
		
		
		public void doubleClickByElement(WebElement element) {
			
			((JavascriptExecutor) driver).executeScript("mobile:doubleClickGesture", 
					ImmutableMap.of("elementId",((RemoteWebElement)element).getId()));
		}
		
		
		public void LongClickByElement(WebElement element, int time) {
			((JavascriptExecutor) driver).executeScript("mobile:longClickGesture",
					ImmutableMap.of("elementId", ((RemoteWebElement) element).getId()));
		}


		public void LongClickByCoordinates(int x, int y, int time) {
			((JavascriptExecutor) driver).executeScript("mobile:longClickGesture",
					ImmutableMap.of("x", x, "y", y, "duration", time));
		}

	
		public void DoubleClickByElement(WebElement element) {
			((JavascriptExecutor) driver).executeScript("mobile:doubleclickGesture",
					ImmutableMap.of("elementId", ((RemoteWebElement) element).getId()));
		}

	
		public void DoubleClickBycoordinates(int x, int y) {
			((JavascriptExecutor) driver).executeScript("mobile:doubleclickGesture", ImmutableMap.of("x", x, "y", y));
		}

	
		public void DragAndDrop(WebElement element, int x, int y) {
			((JavascriptExecutor) driver).executeScript("mobile:dragGesture",
					ImmutableMap.of("elementId", ((RemoteWebElement) element).getId()));
		}

	
		public void ZoomIn(WebElement element, double percent) {
			((JavascriptExecutor) driver).executeScript("mobile:pinchOpenGesture",
					ImmutableMap.of("elementId", ((RemoteWebElement) element).getId(), "percent", percent));
		}

	
		public void ZoomOut(WebElement element, double percent) {
			((JavascriptExecutor) driver).executeScript("mobile:pinchCloseGesture",
					ImmutableMap.of("elementId", ((RemoteWebElement) element).getId(), "percent", percent));
		}

	
		public void SwipeByElement(WebElement element, String Direction, double percent) {
			((JavascriptExecutor) driver).executeScript("mobile:swipeGesture", ImmutableMap.of("elementId",
					((RemoteWebElement) element).getId(), "direction", Direction, "percent", percent));
		}

	
		public void SwipeByCoordinates(int left, int top, int width, int height, String direction, double percent) {
			((JavascriptExecutor) driver).executeScript("mobile:swipeGesture", ImmutableMap.of("left", left, "top", top,
					"width", width, "height", height, "direction", direction, "percent", percent));
		}

		public WebElement ScrollByText(String text) {
			WebElement elementXpath = driver.findElement(AppiumBy
					.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(text(\"" + text + "\"));"));
			return elementXpath;
			
		}
		
		public WebElement ScrollByTextBackward(String text) {
			WebElement elementXpath = driver.findElement(AppiumBy
					.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollBackward(text(\"" + text + "\"));"));
			return elementXpath;
			
		}
		


		public WebElement ScrollByXpath(String xpath) {
			WebElement elementXpath = driver.findElement(AppiumBy
					.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"" + xpath + "\"));"));
			return elementXpath;
		}


}
