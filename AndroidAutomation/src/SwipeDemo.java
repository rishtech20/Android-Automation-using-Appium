import java.net.MalformedURLException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

//Class to perform the swipe action in the application
public class SwipeDemo extends Base{

	public static void main(String[] args) throws MalformedURLException {
		//Appium code goes here...
		AndroidDriver<AndroidElement> driver = Capabilities(); //Getting the capabilities in the Android Driver
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//clicking on an element
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		
		//clicking on an element
		driver.findElementByAndroidUIAutomator("text(\"Date Widgets\")").click();
		
		//clicking on an element
		driver.findElementByAndroidUIAutomator("text(\"2. Inline\")").click();
		
		//clicking on another element - tag names cannot pick up special characters like '$'when using xpath()
		//In such a case we can skip the tagname and use '*' in place of it
		driver.findElementByXPath("//*[@content-desc = '9']").click();
		
		//Using the touch action class to perform the swipe action
		//1. Touch for a few seconds on the element
		//2. Drag it and then release it manually
		TouchAction t = new TouchAction(driver); //Creating a new touch action object
		
		//Drag the element from
		ElementOption fifteen = ElementOption.element(driver.findElementByXPath("//*[@content-desc = '15']"));
		
		//Drag the element to 
		ElementOption fortyFive = ElementOption.element(driver.findElementByXPath("//*[@content-desc = '45']"));
		Duration pressTime = Duration.ofSeconds(1);
		t.longPress(LongPressOptions.longPressOptions().withElement(fifteen).withDuration(pressTime)).moveTo(fortyFive).release().perform();
		
	}

}
