import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ScrollingDemo extends Base{

	public static void main(String[] args) throws MalformedURLException {
		// Appium code goes here
		AndroidDriver<AndroidElement> driver = Capabilities(); //Getting the capabilities in the Android Driver
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//clicking on an element
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		
		//Here is the scrolling gesture demo code
		//UiScrollable is an Android class, since there is no other method to automate scrolling hence we are going
		//to use it.
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
				+ ".scrollable(true).instance(0))"
				+ ".scrollIntoView(new UiSelector()"
				+ ".textContains(\"WebView\")"
				+ ".instance(0))").click();
	}

}
