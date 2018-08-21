import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class MiscMethods extends Base{

	public static void main(String[] args) throws MalformedURLException {
		// Appium code starts here....
		AndroidDriver<AndroidElement> driver = Capabilities(); //Getting the capabilities in the Android Driver
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//checking the current activity name
		System.out.println("Current Activity:\n" + driver.currentActivity());
		
		//checking the current context - on what view we are on out of
		//1) Native View 2) Hybrid view 3) Web-view
		System.out.println("Context:\n" + driver.getContext());
		
		//checking the orientation of the device
		System.out.println("Orientation:\n" + driver.getOrientation());
		
		//checking whether or not the device is locked
		System.out.print("Is Locked?\n" + driver.isDeviceLocked());
		
		//driver.navigate().back(); //helps the user to tap on the back button on the navigation bar
		//driver.hideKeyboard(); //Hides the keyboard to launch the other activities
		//driver.isKeyboardShown(); //Returns a boolean TRUE or FALSE based on whether or not the keyboard is hidden
		
	}
}
