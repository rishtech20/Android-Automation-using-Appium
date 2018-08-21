import java.net.MalformedURLException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;

public class DragAndDrop extends Base {
	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver<AndroidElement> driver = Capabilities(); //Getting the capabilities in the Android Driver
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//clicking on an element
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		
		//clicking drag and drop in the views
		driver.findElementByAndroidUIAutomator("text(\"Drag and Drop\")").click();
		
		//Drag and drop action
		TouchAction t = new TouchAction(driver);
		ElementOption from = ElementOption.element(driver.findElementsByClassName("android.view.View").get(0));
		ElementOption to = ElementOption.element(driver.findElementsByClassName("android.view.View").get(1));
		Duration pressTime = Duration.ofMillis(150);
		t.longPress(LongPressOptions.longPressOptions().withElement(from).withDuration(pressTime)).moveTo(to).release().perform();
		
	}
}
