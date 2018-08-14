import java.net.MalformedURLException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.RemoteWebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

public class GesturesTest1 extends Base{
	public static void main(String[] args) throws MalformedURLException {
		//Appium code goes here...
		AndroidDriver<AndroidElement> driver = Capabilities(); //Getting the capabilities in the Android Driver
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Tapping on one of the objects
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		
		//Tap
		//It is a class that has all the methods to simulate the touch action in android
		//driver to be passed as an argument - t object gets all the capabilties to handle the mobile gestures
		PointOption<ElementOption> expandableList = ElementOption.element(driver.findElementByAndroidUIAutomator("text(\"Expandable Lists\")"));
		TouchAction t = new TouchAction(driver);
		t.tap(expandableList).perform();
		
		driver.findElementByAndroidUIAutomator("text(\"1. Custom Adapter\")").click();
		//Long press action simulated
		ElementOption peoplename = ElementOption.element(driver.findElementByAndroidUIAutomator("text(\"People Names\")"));
		Duration pressTime = Duration.ofSeconds(3);
		t.longPress(LongPressOptions.longPressOptions().withElement(peoplename).withDuration(pressTime)).release().perform();
		
		//Validating the text present in an object of the application
		//Type casting to AndroidElement is important
		System.out.println(((AndroidElement)driver.findElementsById("android:id/alertTitle")).getText());
		
		
	}
}
