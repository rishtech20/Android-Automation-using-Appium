import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;	

public class UIAutomatorTest extends Base{

	public static void main(String[] args) throws MalformedURLException {
		//Appium code goes here...
		AndroidDriver<AndroidElement> driver = Capabilities(); //Getting the capabilities in the Android Driver
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Locating an element in the application using the Android UI Automator.
		//Attribute and value is all we need as compared to XPath.
		//This is not present in the Selenium, it is unique to appium
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		//driver.findElementByAndroidUIAutomator("text(\"Animation\")").click();
		
		//Validating the object properties - clickable property in this scenario - we want to know the total size
		System.out.println(driver.findElementByAndroidUIAutomator("new UiSelector().clickable(true)").getSize());
		//driver.findElementByAndroidUIAutomator("new UiSelector().clickable(true)").getSize();
	}

}
