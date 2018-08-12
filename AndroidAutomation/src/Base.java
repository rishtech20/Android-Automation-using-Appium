import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base {
	//This method sets all the capabilities and then, returns the driver to the caller
	//Opens the emulator - establishes connection with the device on which automation is to be done
	//Launches the application to be tested
	//Finally, the web driver is launched and the connection to server is made
	public static AndroidDriver<AndroidElement> Capabilities() throws MalformedURLException {
		//Appium code goes here...
		//Using the file method to specify the location of the apk file
		File f = new File("src"); //Go to source folder
		File fs = new File(f, "ApiDemos-debug.apk"); //This is the APK file we need
		
		//Making a desired capabilities object
		DesiredCapabilities cap = new DesiredCapabilities();
		
		//Setting the emulator or the device that the server need to comm to
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Appium-Automation");
		
		//Specifying the application that needs to be tested
		//We should always avoid hardcoding the path of the APK
		//This way it works in all the systems
		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		
		//Sending connection to the server - we need to invoke the android driver class
		//The driver object helps us in automating all our applications
		//It has the capability of handling the Android OS
		AndroidDriver<AndroidElement>  driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		//The server is at the local host
		//wd ==> web driver, it is where the connection is being invoked and the Appium server is listening to the client code
		return driver;
		//Android UI automator
	}

}
